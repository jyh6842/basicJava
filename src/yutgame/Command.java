package yutgame;

public class Command extends Thread {
	public static void main(String[] args) {
		Player player = new Player();
		ThrowYut throwYut = new ThrowYut();
		MapDisplay display = new MapDisplay();
		Hunt hunt = new Hunt();
		Win win = new Win();

		System.out.println("------------------------------------");
		System.out.println(" 윷놀이 게임에 오신 것을 환영합니다 ");
		System.out.println("------------------------------------");
		System.out.println("0~3번의 총 4개의 말을 먼저 골인시킨 쪽이 우승합니다.");
		System.out.println("실제 윷놀이 게임과는 룰이 다소 다를 수 있습니다.");
		System.out.println("버그 제보는 직접 와서 말씀해 주세요~");
		System.out.println("Copyright 2015. GodZeta  all rights reserved.");
		System.out.println();
		System.out.println();

		player.inputName();
		player.startRandom();

		String winner = null; // 승리자 체크 변수

		while (winner == null) {

			for (int i = 1; i > 0; i--) { // i는 윷을 던질수 있는 횟수
				display.disOut(); // 맵과, 플레이어 상태 표시
				throwYut.rolling(i); // 윷 던지기
				// ThrowYut.numberYut = -1; // 테스트
				if (ThrowYut.numberYut == 4) {
					System.out.println("윷이 나와서 한번 더 던집니다.");
					i++;
				} else if (ThrowYut.numberYut == 5) {
					System.out.println("모가 나와서 한번 더 던집니다.");
					i++;
				}
				// 이동중인 말이 없는데 뒷도가 나왔을 경우 처리
				if (ThrowYut.numberYut == -1 && (Player.currentHorse[0] == 0 || Player.currentHorse[0] == 31)
						&& (Player.currentHorse[1] == 0 || Player.currentHorse[1] == 31)
						&& (Player.currentHorse[2] == 0 || Player.currentHorse[2] == 31)
						&& (Player.currentHorse[3] == 0 || Player.currentHorse[3] == 31)) {
					System.out.println("이동할 말이 없습니다. 애석하게 생각합니다. ^______^ ");
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}

				int k = player.move(); // 현재 이동한 말의 번호
				int re = hunt.kill(k); // 상대 말을 죽였다면 1이 반환됨
				if (re == 1) {
					System.out.println("상대 말을 잡았으므로 한번 더 던집니다.");
					i += re; // 이동횟수 1 추가
				}
				System.out.println("");
			}
			// 승리체크
			winner = win.check();

			if (Player.currentTurn == 'A') { // 순서 교대
				Player.currentTurn = 'B';
				Player.currentName = Player.nameB;
				Player.currentHorse = Player.horseB;
			} else if (Player.currentTurn == 'B') {
				Player.currentTurn = 'A';
				Player.currentName = Player.nameA;
				Player.currentHorse = Player.horseA;
			}

		}
		System.out.println("축하합니다~!");
		System.out.println("[" + Player.currentTurn + "] " + winner + "님의 승리입니다 !!!!   'ㅁ'b");
	}
}

/*
 * [주요 설계]
 * 
 * -지도- 지도 클래스 안에서 지역변수 지도 배열 생성 각 말들의 위치를 탐색하여 지도 배열 안에 넣어 줌 지도 화면 뿌림
 * 
 * -플레이어 상태- A. 홍길동 B. 임꺽정 -플레이어의 말 상태- 이동중 : Out : 골인:
 * 
 * 이동력 : 초기값 1 플레이어 각 말들의 위치 : 배열
 * 
 * -메인- 플레이어 턴 1 <-> 2 : turn -------------------------------
 * 
 * [지도 표시 방식]
 * 
 * 위치 정보표시 방식 : A1234
 * 
 * 
 * [지도 모델링 및 넘버]
 * 
 * ◎ 11 o 10 o 9 o 8 o 7 ◎ 6 (각 탭 1씩)
 * 
 * o 26 O 21 (공백4 . 탭4 공백4 . )
 * 
 * o 12 o 5 (. 탭5 .)
 * 
 * o 27 o 22 (탭1 공백4 . 탭2 공백4.)
 * 
 * o 13 o 4 (. 탭5 .)
 * 
 * ◎ 28 == 23 (탭2 공백7 . )
 * 
 * o 14 o 3 (. 탭5 .)
 * 
 * o 24 o 29 (탭1 공백4 . 탭2 공백4.)
 * 
 * o 15 o 2 (. 탭5 .)
 * 
 * o 25 o 30 (공백4 . 탭4 공백4 . )
 * 
 * ◎ 16 o 17 o 18 o 19 o 20 ◎1 (각 탭 1씩)
 * 
 * 초기값은 0; 0에서 출발할 경우 +1 이후 이동할 숫자만큼 더해줌
 * 
 * 0 : 대기 31 : 골인
 * 
 * 1 에서 뒷도가 나올경우 20으로 이동 이동중인 말이 없는데 뒷도가 나올경우 턴 넘김
 * 
 * 23에 멈출 경우 28 넣어줌
 * 
 * 
 * - 분기지점 6 에서 대각선으로 갈 경우 +14 11 에서 대각선으로 갈 경우 +14 28 에서 좌측 방향으로 내려갈 경우 -5
 * 
 * -특수지점 21 에서 모가 나오면 -10 22 에서 윷 이상이면 -10 23 에서 걸 이상이면 -10 24 에서 개 이상이면 -10 25
 * 에서 무조건 -10
 * 
 * 16~20까지 한번에 이동해서 합계 21이상이 될 경우 31 넣어줌 (골인) 26~30까지 한번에 이동해서 합계 31이상이 될 경우 31
 * 넣어줌 (골인)
 * 
 * 
 * == 게임 흐름 ==
 * 
 * 
 * [초기화]
 * 
 * 1번 플레이어의 이름을~ 2번 ~
 * 
 * 
 * 시작합니다
 * 
 * 
 * [게임 시작]
 * 
 * 홍길동의 차례입니다.
 * 
 * 윷을 던집니다. 아무 말이나 입력후 엔터를 눌러주세요. (대사 입력)
 * 
 * ~~가 나왔다. 몇칸 이동 - 이동력 -1 - 윷이나 모가 나올경우 이동력 +1
 * 
 * -지도 출력 -플레이어 말 상태 출력
 * 
 * 
 * 이동할 말 선택 0 1 2 3 (선택)
 * 
 * -이동시 이동 시작 위치가 분기점인지 확인 분기점이면 이동할 방향 선택 특수지점일 경우 계산 처리
 * 
 * - 이동시 말이 업혔는지 확인 업힌 말들 배열에 넣기
 * 
 * -이동 후 이동한 위치에 다른 말이 있는지 확인
 * 
 * -자신의 말이 있으면 업어서 같이 이동 -다른 플레이어의 말이 있으면 그 말을 제거 후 이동력+1
 * 
 * -이동력이 1 이상이면 "~~~님이 한번 더 이동합니다" 이동력이 0이면 플레이어 턴 넘김
 * 
 * 
 */
