package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		/*
		 * << 다차원 배열 >>
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		*/
		
		int[][] numbers = new int[2][3]; // 2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다. // []는 타입뒤에 붙이는 것을 많이 사용한다.
		int numbers2[][] = new int[][]{{1,2,3}, {4,5,6}}; // 값의 개수로 배열의 길이가 정해진다.
		int[] numbers3[] = {  {1,2,3}
							, {4,5,6}
							, {7,8,9}
							}; //3*3
		int[][] numbers4 = new int[3][]; // 가변 배열
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10]; // 길이를 다르게 지정할 수 있다.
		
//		numbers[0] = 10; // 1차원에 값을 저장할 수 없다.
		numbers[0] = new int[5]; // 1차원에 배열을 저장할 수 있다. 0번째 인덱스의 배열에 5칸짜리로 만들어졌다.
		numbers[0][0] = 10; // 2차원에 값을 저장할수 있다.
		numbers[0][1] = 20; 
		numbers[1][0] = 100;
		
		// numbers 배열에 저장된 값의 모양을 적어주세요.
		// 예) {{1,2,3}, {4,5,6}}
		// { {10, 20, 0, 0, 0}
		//  ,{100,0,0} }
		
		System.out.println(Arrays.toString(numbers));// 배열안에 배열이 있으므로 주소만 나옴
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i])); // 이렇게 하면 나옴
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = (int)(Math.random() * 100)+1;
				System.out.print(numbers[i][j]+"\t");
			}
			System.out.println();
		}
		
		//1차원의 길이는 3이고 2차원의 길이는 5일 배열 만들고
		// 모든 인덱스에 1 ~ 100 사이의 랜덤한 값을 저장해주세요
		
		int[][] scores = new int[3][5];
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100)+1;
				
			}
			System.out.println(Arrays.toString(scores[i]));
			
		}
		
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];

		for (int i = 0; i < scores.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			System.out.print("합계 :" + sum[i] +"\t");
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("평균 : " + avg[i]);
		}
		
		
		
		
	}
}
