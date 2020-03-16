package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballArrayVersion2 {

	public static void main(String[] args) {
		int [] answer = new int[3];
		int[] input = new int[answer.length];
		
		boolean isDuplicated; // 중복 안되게 하려고 만든 변수
		do {
			isDuplicated = false;
			for (int i = 0; i < answer.length; i++) {
				answer[i] = (int)(Math.random()*9)+1;
			}
			
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if(i != j && answer[i] == answer[j]){ // 중복이 안되면 true로 바꿔서 while문을 계속 돌도록
						isDuplicated = true;
					}
				}
			}
			
		} while (isDuplicated);
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println(answer.length + "자리 숫자를 입력해주세요>");
			int temp = Integer.parseInt(s.nextLine());
			
			int index = input.length - 1;
			while(0 < temp){
				input[index--] = temp % 10;
				temp /= 10;
			}
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			for(int i = 0; i < answer.length; i++){
				for(int j = 0; j < input.length; j++){
					if(answer[i] == input[j]){
						if(i == j){
							strike++;
						}else{
							ball++;
						}
					}
				}
			}
			out = answer.length - strike - ball;
			
			System.out.println(++count + "차 시도"
					+ Arrays.toString(input).replace(", ", "") + " : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("-------------------------");
			if(strike == answer.length){
				System.out.println("정답입니다!!");
				break;
			}
		}

	}

}
