package d_array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		/*
		 * << 정렬 >> 
		 * - 선택 정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자릴 바꾸기를 반복해
		 * 		앞에서부터 작은 수를 채워나가는 방식
		 * - 버블 정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 		뒤에서부터 큰수를 채워나가는 방식
		 * - 삽입 정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 * - 석차 구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		*/
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers)); // 정렬 전
		
//		printRank(numbers);
//		selectSort(numbers);
//		bubbleSort(numbers);
		insertSort(numbers);
		
		
	}//main

	private static void insertSort(int[] numbers) {
		/*
		 * i, j
		 * 1,0
		 * 2,1 2,0
		 * 
		 * 
		 * 8,7 8,6 8,5 ... 8,0
		 * 9,8 9,7 9,4 ... 9,0
		*/
/*		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int lowIndex = i-1;
			
			while((lowIndex >= 0) && (numbers[lowIndex] > temp)){
				numbers[lowIndex+1] = numbers[lowIndex];
				lowIndex--;
			}//while
			numbers[lowIndex+1] = temp;
		}//for
*/		
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int j = 0;
			for( j = i - 1; j >=0; j--){
				if( temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{
					break;
				}				
			}
			numbers[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(numbers));
			
		
	}

	private static void bubbleSort(int[] numbers) {
/*		int count = 0;
		for (int i = numbers.length - 1; i > 0; i--) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
					flag++;
				}
			}
			count++;
			System.out.print(count);
			System.out.println("회차 버블 정렬 후" + Arrays.toString(numbers));
			if (flag == 0) {
				break;
			}
		}
		System.out.println("버블 정렬 후" + Arrays.toString(numbers));*/
		
		
		
		for (int i = 0; i < numbers.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < numbers.length - 1; j++) {
				if(numbers[j] > numbers[j+1]){
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
					changed = true;
				}
			}//for
			if(!changed){
				break;
			}
		}//for
		System.out.println(Arrays.toString(numbers));

	}

	private static void selectSort(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]){
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println("선택 정렬 후 " +Arrays.toString(numbers)); // 정렬 후
	}

	private static void printRank(int[] numbers) {
		int[] rankArray = new int[numbers.length];
		
		for (int i = 0; i < rankArray.length; i++) {
			rankArray[i] = 1;
		}
		/*
		 * 0,0 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
		 * 1,0 1,1 1,2 1,3 1,4 1,5 1,6 0,7 1,8 1,9
		*/
		

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					rankArray[i]++;
				}
			}
		}
		
		System.out.println("printRank"+Arrays.toString(rankArray));
	}//printRank

	private static void shuffle(int[] numbers) {
		for(int i = 0; i<numbers.length*10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}//shuffle
}
