package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
	String[] name; // 플레이어 이름
	static int horseA[]; // A 플레이어의 말 개수
	static int horseB[]; // B 플레이어의 말 개수
	int horseAStatus[]; // 말의 현재 상태
	int horseBStatus[];
	char currentTurn; // 플레이어 턴
	int selectHorseNumber;

	Scanner sc = new Scanner(System.in);
	
	Player() {
		name = new String[2];
		horseA = new int[3]; // 0은 1번 플레이어의 말, 1은 2번 플레이어의 말 ...
		horseB = new int[3];
		horseAStatus = new int[3]; // 말의 상태 0 이면 OUT, 1이면 이동중, 2이면 골인
		horseBStatus = new int[3];
		selectHorseNumber = -1; // 안쓸말의 배열을 만들어서 2라는 수를 주면 좋을듯
		
	}
	
	void setInit(){ // 이름 입력 및, 말 초기화하기
		System.out.println("2명의 플레이어로 시작합니다.");
		System.out.println("말의 개수는 3개씩 입니다.");
		for(int i = 0; i < name.length; i++){
			if(name[i]== null){
				System.out.print("이름을 입력해주세요 >>");
				name[i] = sc.nextLine();
			}
		}
		for (int i = 0; i < horseA.length; i++) {
			horseA[i] = 0; // 말 초기화
		}
		for (int i = 0; i < horseB.length; i++) {
			horseB[i] = 0; // 말 초기화
		}
		for (int i = 0; i < horseAStatus.length; i++) {
			horseAStatus[i] = 0; // 말 상태
		}
		for (int i = 0; i < horseBStatus.length; i++) {
			horseBStatus[i] = 0; // 말 상태
		}
		System.out.println("참가 플레이어의 이름은 : " + Arrays.toString(name));
	}
	
	void order(){ // 순서 정하기
		System.out.print("플레이어의 순서는 ");
		for (int i = 0; i < name.length; i++) {// 플레이어의 이름의 배열 인덱스와 말 배열의 인덱스의 번호를 맞춘다.
			int num = (int)(Math.random()*2);
			
			String tmp = name[0]; // 플레이어 이름
			name[0] = name[num];
			name[num] = tmp;
			
		}
		System.out.println(Arrays.toString(name));
	}
	
	int selectHorse(String curTurn) { // 말을 골랐을때 // 매개변수 현재 턴인 사람
		boolean b_goalHorse = false;
		while (b_goalHorse == false) {
			System.out.println("움직을 말을 골라주세요");
			selectHorseNumber = Integer.parseInt(sc.nextLine());
			if (horseAStatus[selectHorseNumber] == 2 && curTurn.equals(name)) {
				System.out.println("A" + horseA[selectHorseNumber] + " 는 이미 골인된 말입니다. ");
				continue; // b_goalHorse = true; 안되게 하려고 false 유지시키려고

			}
			if (horseBStatus[selectHorseNumber] == 2 && curTurn.equals(name)) {
				System.out.println("B" + horseB[selectHorseNumber] + " 는 이미 골인된 말입니다. ");
				continue; 
			}
			b_goalHorse = true;
		}

		return selectHorseNumber;
	}
	
/*	String curTurn(){ // 현재 누구의 턴인지
		
	}*/

}
