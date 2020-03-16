package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballArray {

	public static void main(String[] args) {
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		
		int[] answer = new int[3];


		while(true){
			for(int i = 0; i < answer.length; i++){
			answer[i] = (int)(Math.random()*9)+1;
			}
			if(answer[0] != answer[1] && answer[0] !=answer[2] && answer[1] !=answer[2]){ // 이렇게 하는 것보다 좋은 방법은? 중복되지 않은 배열로 하는 것보다 좋은 방법은?
				break;
			}
				
		}
		
		System.out.println(Arrays.toString(answer));
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = Integer.parseInt(s.nextLine());// 값 입력하기
		
		int[] inputArr = new int[answer.length];
		
		
		
		int z=100;// 몇자리 숫자냐에 따라서 1자리면 1 십의 자리면 10
		int number = 0; // 배열에 있는 값을 숫자로 바꿈
		for (int j = 0; j < answer.length; j++) {
			
			inputArr[j] = input/z;
			input = input % z;
					
			if (z > 1){
				z /= 10;
			}
		}
		
		for (int j = 0; j < inputArr.length; j++) {
			if(inputArr[j] == answer[j]){
				strike++;
			}	
		}
		
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = 0; j < inputArr.length; j++) {
				if(inputArr[i] == answer[j] || inputArr[0] == answer[2]){
				
				}
			}
		}
		
		if(inputArr[0] == answer[1] || inputArr[0] == answer[2]){
			ball++;
		}
		if(inputArr[1] == answer[0] || inputArr[1] == answer[2]){
			ball++;
		}
		if(inputArr[2] == answer[0] || inputArr[2] == answer[1]){
			ball++;
		}
		
		out = 3 - strike - ball;
		
		System.out.println(strike+"" + ball + ""+out);
		
		
		
	
	}// main

}// 끝
