package game;

import java.util.Scanner;

import yutgame.ThrowYut;

public class Main {

	public static void main(String[] args) {
		Player p = new Player();
		Map m = new Map();
		Throw t = new Throw();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------------------------------------");
		System.out.println(" 윷놀이에 오신 것을 환영합니다 ");
		System.out.println("------------------------------------");
		System.out.println("주사위 2개를 굴려주세요");
		System.out.println();
		System.out.println();
		
		p.setInit(); // 이름 입력 및 말 상태 초기화
		p.order(); // 순서정하기
		
		
		
		boolean win = false; // 이기면 끝내기 위해서
		String currentTurnName = p.name[0]; // 처음 턴의 이름
		int selectHorseNumber = -1;//선택한 말의 번호

		
		
		while (win == false) {

			m.mapDisp(); // 맵을 보여준다. 
			// 현재 말의 상태를 보여준다.
			// 현재 누구의 턴인지 보여준다.
			// 순서에 맞게 던지기
			// 윷을 던진다.
			for(int chance = 1; chance > 0; chance--){
			System.out.println("현재 던질 사람의 턴 : "+currentTurnName);// 던질 사람의 이름
			System.out.println("윷을 던져주세요! 엔터를 누르시면 됩니다.");
			sc.nextLine();
			int number = t.throwYut();// 윷 던져서 나온 수
			String yutName = t.yutName(number); // 윷 던져서 나온 수를 도개걸윷모로 출력
			System.out.println(yutName + " : " + number +" 칸 이동합니다.");
			selectHorseNumber = p.selectHorse(currentTurnName);// 이동하기 전 말 고르기 // 말 고르기 // 이미 골인한 말이라면 계속 묻기 // 현재 이동중인 말을 고르면 다시 고를 수 있도록 한다. 
			//말을 고르면 말이 움직을 수 있게 0과 2가 아니게 해준다.
			
			// 빽도가 나와서 현재 움직일 말이 없다면 
			if(number == -1 &&(p.horseAStatus[0] == 0 || p.horseAStatus[0] == 2)&& (p.horseAStatus[1] == 0 || p.horseAStatus[1] == 2)&&(p.horseAStatus[2] == 0 || p.horseAStatus[0] == 2)){
				System.out.println("현재 움직일 말이 없습니다.");
				break;
			}
			if(number == -1 &&(p.horseBStatus[0] == 0 || p.horseBStatus[0] == 2)&& (p.horseBStatus[1] == 0 || p.horseBStatus[1] == 2)&&(p.horseBStatus[2] == 0 || p.horseBStatus[0] == 2)){
				System.out.println("현재 움직일 말이 없습니다.");
				break;
			}
			

			
			
			// 말 이동하기
			if(currentTurnName.equals(p.name[0])){
				if(Player.horseA[selectHorseNumber] == 0){
					number++;
				}
			Player.horseA[selectHorseNumber] += number;// Player 이라는 부모의 멤버변수를 자식 클래스가 어떻게 하면 쓸 수 있을까?
			}else {
				if(Player.horseB[selectHorseNumber] == 0){
					number++;
				}
			Player.horseB[selectHorseNumber] += number;
			}

			// 말을 잡으면? 기회 한번 더
			if(currentTurnName.equals(p.name[0])){// A가 잡으면
				if((Player.horseB[0] == Player.horseA[selectHorseNumber] && Player.horseB[0] != 0) || (Player.horseB[1] == Player.horseA[selectHorseNumber] && Player.horseB[1] != 0)|| (Player.horseB[2] == Player.horseA[selectHorseNumber] && Player.horseB[2] != 0)){
					if(Player.horseB[0] == Player.horseA[selectHorseNumber]){Player.horseB[0] = 0;} // 말이 잡히면 0
					if(Player.horseB[1] == Player.horseA[selectHorseNumber]){Player.horseB[1] = 0;}
					if(Player.horseB[2] == Player.horseA[selectHorseNumber]){Player.horseB[2] = 0;}
				
				chance++;
				}
			}
			if(currentTurnName.equals(p.name[1])){ // B가 잡으면
				if((Player.horseA[0] == Player.horseB[selectHorseNumber] && Player.horseA[0] != 0 ) || (Player.horseA[1] == Player.horseB[selectHorseNumber] && Player.horseA[1] != 0) || (Player.horseA[2] == Player.horseB[selectHorseNumber] && Player.horseA[2] != 0 )){
					if(Player.horseA[0] == Player.horseB[selectHorseNumber]){Player.horseA[0] = 0;}
					if(Player.horseA[1] == Player.horseB[selectHorseNumber]){Player.horseA[1] = 0;}
					if(Player.horseA[2] == Player.horseB[selectHorseNumber]){Player.horseA[2] = 0;}
					
				chance++;
				}
			}
			
			}//for 윷 던질 기회
			
			// 윷을 다 던진후  턴을 교체한다.
			if(currentTurnName.equals(p.name[0])){
				currentTurnName = p.name[1];
			}else{
				currentTurnName = p.name[0];
			}
			
			//예)
//			p.horseA[0] = 31 > 골인 == 2 
//			if()
			//이기면 게임 종료
			
		}// 게임 while
		
		
		
	}//main()

}//Main
