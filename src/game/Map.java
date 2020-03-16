package game;

public class Map extends Player {
	String[] mapPlayerPosition;
	String[][] horse; // 말의 개수가 늘어나면 이차원 배열로 해야함, 말의 개수가 하나이면 1차원 배열
	
	Map() {
		
		mapPlayerPosition = new String[32]; // 인덱스는 0~31 까지이고 0은 아웃 31은 골인
		horse = new String[32][3]; // 열은 말의 수
		
	}
	
	void mapDisp() {
		for (int i = 0; i < horse.length; i++) {
			for (int j = 0; j < horse[i].length; j++) {
				mapPlayerPosition[i] = "";
				horse[i][j] = "";
			}
		}

		for (int i = 0; i < horseA.length; i++) {
			if (horseA[i] != 0 || horseA[i] != 31) { // 대기상태나, 골인 상태가 아니면
				mapPlayerPosition[horseA[i]] = "A"; // horseA[i]의 값이 0과 31이 아니면
													// maPlayer에 horseA[i]
				horse[horseA[i]][i] = String.valueOf(i);// 정수를 문자열로 변환
			}
		}
		for (int i = 0; i < horseB.length; i++) {
			if (horseB[i] != 0 || horseB[i] != 31) {
				mapPlayerPosition[horseB[i]] = "B";
				horse[horseB[i]][i] = String.valueOf(i);
			}
		}

		for (int i = 0; i < mapPlayerPosition.length; i++) { // null 공백처리, 공백처리 하려고
			if (mapPlayerPosition[i] == null) {
				mapPlayerPosition[i] = "";
			}
		}
		for (int i = 0; i < horse.length; i++) {
			for (int j = 0; j < horse[i].length; j++) {
				if (horse[i][j] == null) {
					horse[i][j] = "";
				}
			}
		}
		
		//// 맵 만들기
		System.out.println();
		System.out.print("◎" + mapPlayerPosition[11] + horse[11][0] + horse[11][1] + horse[11][2] +"\t");
		for (int i = 10; i >= 7; i--) {
			System.out.print("o" + mapPlayerPosition[i] + horse[i][0] + horse[i][1] + horse[i][2] +"\t");
		}
		System.out.print("◎" + mapPlayerPosition[6] + horse[6][0] + horse[6][1] + horse[6][2] +"\t");
		System.out.println();

		System.out.print("    " + "o" + mapPlayerPosition[26] + horse[26][0] + horse[26][1] + horse[26][2]);
		System.out.println("\t\t\t\t" + "    " + "o" + mapPlayerPosition[21] + horse[21][0] + horse[21][1] + horse[21][2]);
		System.out.println();

		System.out.print("o" + mapPlayerPosition[12] + horse[12][0] + horse[12][1] + horse[12][2]+ "\t\t\t\t\t");
		System.out.print("o" + mapPlayerPosition[5] + horse[5][0] + horse[5][1] + horse[5][2]);
		System.out.println();

		System.out.print("\t" + "    " + "o" + mapPlayerPosition[27] + horse[27][0] + horse[27][1] + horse[27][2]);
		System.out.print("\t\t" + "    " + "o" + mapPlayerPosition[22] + horse[22][0] + horse[22][1] + horse[22][2]);
		System.out.println();

		System.out.print("o" + mapPlayerPosition[13] + horse[13][0] + horse[13][1] + horse[13][2] + "\t\t\t\t\t");
		System.out.print("o" + mapPlayerPosition[4] + horse[4][0] + horse[4][1] + horse[4][2]);
		System.out.println();

		 // 중앙
		System.out.print("\t\t" + "       " + "◎" + mapPlayerPosition[28] + horse[28][0] + horse[28][1] + horse[28][2]);
		System.out.println();

		System.out.print("o" + mapPlayerPosition[14] + horse[14][0] + horse[14][1] + horse[14][2] + "\t\t\t\t\t");
		System.out.print("o" + mapPlayerPosition[3] + horse[3][0] + horse[3][1] + horse[3][2]);
		System.out.println();

		System.out.print("\t" + "    " + "o" + mapPlayerPosition[24] + horse[24][0] + horse[24][1] + horse[24][2]);
		System.out.print("\t\t" + "    " + "o" + mapPlayerPosition[29] + horse[29][0] + horse[29][1] + horse[29][2]);
		System.out.println();

		System.out.print("o" + mapPlayerPosition[15] + horse[15][0] + horse[15][1] + horse[15][2] + "\t\t\t\t\t");
		System.out.print("o" + mapPlayerPosition[2] + horse[2][0] + horse[2][1] + horse[2][2]);
		System.out.println();

		System.out.print("    " + "o" + mapPlayerPosition[25] + horse[25][0] + horse[25][1] + horse[25][2]);
		System.out.print("\t\t\t\t" + "    " + "o" + mapPlayerPosition[30] + horse[30][0] + horse[30][1] + horse[30][2]);
		System.out.println();
		
		System.out.print("◎" + mapPlayerPosition[16] + horse[16][0] + horse[16][1] + horse[16][2] +"\t");
		for (int i = 17; i <= 20; i++) {
			System.out.print("o" + mapPlayerPosition[i] + horse[i][0] + horse[i][1] + horse[i][2] +"\t");
		}
		System.out.print("◎" + mapPlayerPosition[1] + horse[1][0] + horse[1][1] + horse[1][2] +"\t");
		System.out.println();

		
		

	}// mapDisp()
}// Class Map 
