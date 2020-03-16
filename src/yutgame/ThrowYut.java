package yutgame;

import java.util.Random;

public class ThrowYut extends Thread {
	static int numberYut;
	static String nameYut;

	// 이동할 숫자를 랜덤으로 받음
	// 1 2 3 4 5 -1 차례로 도 개 걸 윷 모 뒷도
	public void rolling(int kkk) {
		System.out.println("[" + Player.currentTurn + "]" + Player.currentName + "님의 차례입니다.");
		System.out.println("윷을 던집니다. 아무 말이나 입력후 엔터를 눌러주세요. (남은 횟수: " + kkk + " )");
		// aa는 빼도 되지만, 테스트용 치트키를 만들기 위해 넣음
		String aa = Player.scanner.nextLine(); 

		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int i = random.nextInt(6);
		switch (i) {
		case 1:
			nameYut = "도";
			break;

		case 2:
			nameYut = "개";
			break;

		case 3:
			nameYut = "걸";
			break;

		case 4:
			nameYut = "윷";
			break;

		case 5:
			nameYut = "모";
			break;

		default:
			nameYut = "뒷도";
			i = -1;
			break;
		}

		////////// 테스트용 비밀코드/////////////////////////////////////

		switch (aa) {
		case "11":
			nameYut = "도";
			i = 1;
			break;

		case "22":
			nameYut = "개";
			i = 2;
			break;

		case "33":
			nameYut = "걸";
			i = 3;
			break;

		case "44":
			nameYut = "윷";
			i = 4;
			break;

		case "55":
			nameYut = "모";
			i = 5;
			break;

		case "00":
			nameYut = "뒷도";
			i = -1;
			break;
		}
		/////////////////////////////////////////////////////////////////

		numberYut = i;

		System.out.println("[ " + nameYut + " ]  " + numberYut + "칸 이동합니다.");

	}

	// public static void

	// String[] args) { // 출력 테스트
	// ThrowYut throwYut = new ThrowYut();
	// throwYut.rolling();
	// System.out.println(numberYut);
	// System.out.println(nameYut);
	// }
}
