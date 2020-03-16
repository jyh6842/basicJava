package d_array;

import java.util.Arrays;

public class Score {
	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~100까지 랜덤으로 생성하고
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	CSS		JQuery	JSP		총점		평균
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		 * 1	홍길동	100		90		80		70		60		50		350		75.0
		*/
		
		String[] name = new String[24];
		name[0] = "김0";
		name[1] = "김1";
		name[2] = "김2";
		name[3] = "김3";
		name[4] = "김4";
		name[5] = "김5";
		name[6] = "김6";
		name[7] = "김7";
		name[8] = "김8";
		name[9] = "김9";
		name[10] = "김10";
		name[11] = "김11";
		name[12] = "김12";
		name[13] = "김13";
		name[14] = "김14";
		name[15] = "김15";
		name[16] = "김16";
		name[17] = "김17";
		name[18] = "김18";
		name[19] = "김19";
		name[20] = "김20";
		name[21] = "김21";
		name[22] = "김22";
		name[23] = "김23";
		
		
		
		int[][] score = new int[24][7];
		int[] sum = new int[score.length];
		double[] avg = new double[score.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length-1; j++) {
				score[i][j] = (int)(Math.random()*50)+50;
				sum[i] += score[i][j];
			}
			
			for(int j = score[i].length-1; j < score[i].length; j++){
				score[i][j] = sum[i];
				
			}
			
			System.out.println(Arrays.toString(score[i])); //배열 확인
			avg[i] = (double)sum[i] / 6; // 평균 // score[i].length-1 이걸로 왜 안되지?
			System.out.println(avg[i]);
		}// 합 그리고 평균
		
		int rank[] = new int[score.length];
		
		for (int i = 0; i < score.length; i++) {
			rank[i] +=i;
		}
		//석차 번호 순서대로
		
		String nameTmp ="";
		
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]){
					int[] tmp = new int[score[i].length];
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
					
					nameTmp = name[i];
					name[i] = name[j];
					name[j] = nameTmp;
					

					/*for (int j1 = 0; j1 < score.length-1; j1++) {
						for (int j2 = j1+1; j2 < score[j1].length; j2++) {
							for (int k = 0; k < 7; k++) {
								tmp[k] = score[j1][k];
								score[j1][k] = score[j2][k];
								score[j2][k] = tmp[k];
							}
						}
					}*/
				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int count = 0;
		System.out.println("석차\t이름\t"+"Java	Oracle	HTML	CSS	JQuery	JSP	총점"+"\t평균");
		for (int i = 0; i < score.length ; i++) {
			count = name.length; // 반복될 수록 적게 빠지기 때문에
			for (int j = i + 1; j < score.length; j++) {
				if (score[i][6] != score[j][6]) {
					count--;
				}
			}
			System.out.print(count + "\t");
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");

			}
			avg[i] = (double) score[i][6] / 6;
			System.out.println(String.format("%.2f", avg[i]));
		}

		
		
		
		
		
		
	}//main
}
