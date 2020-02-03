package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		/*
		 *  << 배열  >>
		 *  - int[] number = new int[5]; 						// 배열 안에 int 5개를 저장 하겠다.
		 *  - int[] number = new int[]{10, 20, 30, 40, 50};		// 중괄호를 열고 실제 저장할 값을 넣어줌
		 *  - int[] number = {10, 20, 30, 40, 50};				
		 *  
		*/

		// 배열은 참조형 타입이다.
		int[] array; // 배열은 주소를 저장할 공간이 만들어진다.
		array = new int[5];// 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 잇는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.
		
		System.out.println(array); // 주소값
		System.out.println(array[0]); // 실제 값에 접급하기 위해서는 index를 지정해줘야한다.
		// index에는 int만 사용할수 있다.(리터럴, 변수, 상수, 연산 등)
		
		String arrayStr = Arrays.toString(array); // 배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int [] iArray1 = new int []{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		int [] iArray2 = {1,2,3}; // 선언과 초기화를 동시에 해야한다.
/*		int[] iArray3;
		iArray3 ={1,2,3};// 컴파일 에러 발생
*/
		
		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20; 
		array[2] = 30;  
		array[3] = 40;  
		array[4] = 50; 
//		array[5] = 60; // ArrayIndexOutofBoundsException 발생
		
		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int arraytest[] = new int[10];
		
		// 모든 인덱스에 있는 값을 변경 해주세요.
		arraytest [0] = 10;
		arraytest [1] = 20;
		arraytest [2] = 30;
		arraytest [3] = 40;
		arraytest [4] = 50;
		arraytest [5] = 60;
		arraytest [6] = 70;
		arraytest [7] = 80;
		arraytest [8] = 90;
		arraytest [9] = 100;
		
		// 모든 인덱스에 있는 값을 더 해주세요
		// index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		int sum = 0;
		for (int i = 0; i < arraytest.length; i++) {
			sum += arraytest[i];
		}
		
		// 모든 인덱스에 잇는 값을 더한 후 출력
		System.out.println(sum);
		
		// 배열에 숫자를 저장하고 함계와 평균을 구해보자
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0; // 합계
		double avg = 0; // 평균
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 향상된 for문
		for(int number : numbers){ // 배열에 있는 값을 차례대로 변수에 넣는다. // : 뒤에는 배열만 올 수 있다. 그리고 뒤에 온 배열과 앞에 있는 변수의 타입이 같아야 한다.
			System.out.print(number+ " ");
		}
		
		for(int number : numbers){ 
			number = 0; //numbers 의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int max = numbers[0];
		int min = numbers[0];
		for (int number : numbers) {
			if(max <  number){
				max = number;
			}
			if(min > number ){
				min = number;
			}
		}
		System.out.println("MAX : " +max+ " min : " + min);
		
		int[] shuffle = new int[30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * shuffle.length);
			int tmp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = tmp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int randomNumber[] = new int[500];
		for (int i = 0; i < randomNumber.length; i++) {
			int random = (int) (Math.random() * 10)+1;
			randomNumber[i] = random;
		}
		int number[] = new int[10]; // 전부 0 으로 초기화
		
		for (int i = 0; i < 11; i++) {
			
			for (int j = 0; j < randomNumber.length; j++) {
				
				if( i+1 == randomNumber[j]){
					number[i]++; // count
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println((i+1) +" : " + number[i]);
		}
		
		
		// 위 문제의 최소값, 최대값, 반복횟수(난수를 몇번 만들것이냐)를 입력받아 각 숫자가 생성된 횟수를 출력해주세요
		Scanner sc = new Scanner(System.in);
		min = 0;
		max = 0;
		int repeatNumber = 0;


		System.out.println("최소 값을 입력해주세요 >>");
		min = Integer.parseInt(sc.nextLine());
		System.out.println("최대 값을 입력해주세요 >>");
		max = Integer.parseInt(sc.nextLine());
		System.out.println("반복 횟수의 값을 입력해주세요 >>");
		repeatNumber = Integer.parseInt(sc.nextLine());
		
		int countNumbersize = max - min+1;
		
		int arraySize[] = new int[repeatNumber];
		int countNumber[] = new int[countNumbersize];
		
		for (int i = 0; i < arraySize.length; i++) { // 배열에 랜덤 함수 채워넣어 초기화 반복 횟수
			arraySize[i] = (int) (Math.random() * (max-min)) + min; // 최대와 최소 값 범위 사이 // max-min 은 
		}
		
		System.out.println(Arrays.toString(arraySize));
		
		for (int i = 0; i <= max-min; i++) {
			for (int j = 0; j < arraySize.length; j++) { // 반복 횟수
 
				if (i + min == arraySize[j]) {
					countNumber[i]++; // count
				}
			}
		}
		
		for (int i = 0; i < countNumber.length; i++) {
			System.out.println((i+min) +" : " + countNumber[i]);
		}
			
		
		
		
		
	}//main
}
