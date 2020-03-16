package yutgame;

import java.util.Scanner;

public class SpecialMove {

	public void route(int i, int before, int after) { // 이동하려는 말의 출발전 현재 위치를 받음
		if (before == 0) {
			Player.currentHorse[i] += 1;
		} else if (before == 1 && ThrowYut.numberYut == -1) { // 출발점에서 뒷도가 나오면
			Player.currentHorse[i] = 20; // 개이득
		}

		else if (before == 6) {
			int a = 0;
			while (a < 1 || a > 2) {
				System.out.println("1. 수평 ←    2. 대각선 ↙");
				System.out.println("어느쪽으로 이동하시겠습니까?");
				a = new Scanner(System.in).nextInt();
				if (a < 1 || a > 2) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}

			}
			if (a == 2) {
				Player.currentHorse[i] += 14;
				if (ThrowYut.numberYut == 3) {
					Player.currentHorse[i] = 28;
					after = 28;
				}
			}

		}

		if (before == 11) {
			int a = 0;
			while (a < 1 || a > 2) {
				System.out.println("1. 아래 ↓    2. 대각선 ↘");
				System.out.println("어느쪽으로 이동하시겠습니까?");
				a = new Scanner(System.in).nextInt();
				if (a < 1 || a > 2) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}

			}
			if (a == 2) {
				Player.currentHorse[i] += 14;
			}

		}
		if (before == 28) {
			int a = 0;
			while (a < 1 || a > 2) {
				System.out.println("1. 좌측 대각선 ↙      2. 우측 대각선 ↘");
				System.out.println("어느쪽으로 이동하시겠습니까?");
				a = new Scanner(System.in).nextInt();
				if (a < 1 || a > 2) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}
			}
			if (a == 1) {
				Player.currentHorse[i] -= 5;
			}
		}
		if (before == 21 && ThrowYut.numberYut == 5) {
			Player.currentHorse[i] -= 10;
		}
		if (before == 22 && ThrowYut.numberYut >= 4) {
			Player.currentHorse[i] -= 10;
		}

		if (before == 24 && ThrowYut.numberYut >= 2) {
			Player.currentHorse[i] -= 10;
		}
		if (before == 25) {
			Player.currentHorse[i] -= 10;
		}
		////////////////////////////////////
		if (before == 16 && ThrowYut.numberYut == 5) {
			Player.currentHorse[i] = 31;
		}
		if (before == 17 && ThrowYut.numberYut >= 4) {
			Player.currentHorse[i] = 31;
		}
		if (before == 18 && ThrowYut.numberYut >= 3) {
			Player.currentHorse[i] = 31;
		}
		if (before == 19 && ThrowYut.numberYut >= 2) {
			Player.currentHorse[i] = 31;
		}
		if (before == 20 && ThrowYut.numberYut >= 1) {
			Player.currentHorse[i] = 31;
		}

		/////////////////////////////////////
		if (before == 26 && ThrowYut.numberYut == 5) {
			Player.currentHorse[i] = 31;
		}
		if (before == 27 && ThrowYut.numberYut >= 4) {
			Player.currentHorse[i] = 31;
		}
		if (before == 28 && ThrowYut.numberYut >= 3) {
			Player.currentHorse[i] = 31;
		}
		if (before == 29 && ThrowYut.numberYut >= 2) {
			Player.currentHorse[i] = 31;
		}
		if (before == 30 && ThrowYut.numberYut >= 1) {
			Player.currentHorse[i] = 31;
		}
		//////////////////////////////////////

		if (after == 23) {
			Player.currentHorse[i] = 28;
		}

		for (int j = 0; j < Player.currentHorse.length; j++) { // 업힌 말들도 같이 이동
			if (before != 0 && before != 31 && Player.currentHorse[j] == before) {
				Player.currentHorse[j] = Player.currentHorse[i];
			}
		}

	}
}
