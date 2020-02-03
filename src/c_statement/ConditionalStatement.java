package c_statement;

import java.util.Scanner;

public class ConditionalStatement { // statement : 객체

	public static void main(String[] args) {
		
		/*
		 * << if 문 >>
		 * - if			: 조건식의 결과가 true 이면 블럭아느이 문장을 수행한다.
		 * - else if 	: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else 		: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. 		
		 */
		
		int a = 10;

		if (a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행한다. ");
		}
		
		if (a < 10) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 1; // 주민번호 첫자리
		String gender = null;// 성별
		
		if (regNo == 1) {
			gender = "남자";
		} else if (regNo == 2) { // if 블록 뒤에 else if로 조건을 추가할 수 있다.
			gender = "여자";
		} else if (regNo == 3) {
			gender = "남자";
		} else if (regNo == 4) {
			gender = "여자";
		} else { // true인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		regNo = 1;
		gender = null;
		// 수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if (regNo == 1 || regNo == 3) // 수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender = "남자";
		else if (regNo == 2 || regNo == 4) {
			gender = "여자";
		} else {
			gender = "확인 불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		
		// 성적에 등급을 부여하는 프로그램
		int score = 88;
		String grade = null;
		
		if( score >= 90){
			grade = "A";
		}else if( score >= 80){
			grade = "B";
		}else if( score >= 70){
			grade = "C";
		}else if( score >= 60){
			grade = "D";
		}else{
			grade ="F";
		}
		System.out.println("점수 : " + score + "은 성적 등급 : " + grade);
		
		score = 100;
		grade = null;

		if (score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("점수 : " + score + "은 성적 등급 : " + grade);
		
		/*
		 * << switch 문 >> - 조건식과 일치하는 case문 이후의 문장을 수행한다. - 조건식의 결과는 정수와 문자열만
		 * (JDK1.7부터 문자열 허용) 허용한다.
		 */

		regNo = 2;
		gender = null;
		switch (regNo) {
		case 1:
		case 3:
			gender = "남자";
			break; // break를 만나면 switch문을 빠져나간다.
		case 2:
		case 4:
			gender = "여자";
			break;
		default: // if 문의 else 와 같은 역할을 한다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		score = 95;
		grade = null;
		switch (score / 10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "확인불가";
		}
		System.out.println("당신의 점수 "+ score+"점은 성적 등급 : " + grade + "입니다.");
		
		
		// 숫자를 입력받아 그 숫자가 0인지 아닌지 출력해 주세요
/*		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc1 = new Scanner(System.in);
		int inputNum1 = Integer.parseInt(sc1.nextLine());
		
		if(inputNum1 != 0){
			System.out.println("숫자 0이 아닙니다.");
		}else{
			System.out.println("숫자 0 입니다.");
		}*/
		
		//숫자를 입력 받아 그 숫자가 짝수인지 홀수인지 출력해주세요
/*		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc2 = new Scanner(System.in);
		int inputNum2 = Integer.parseInt(sc2.nextLine());
		if(inputNum2 % 2 == 0){
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}*/
		
		// 두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요
/*		System.out.println("2개의 숫자를 입력해주세요 !");
		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc3 = new Scanner(System.in);
		int inputNum3 = Integer.parseInt(sc3.nextLine());
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum4 = Integer.parseInt(sc3.nextLine());
		
		System.out.println(inputNum3 >= inputNum4 ? inputNum3 : inputNum4);*/
		

		// 3개의 숫자를 입력받아 더 큰 숫자를 출력해주세요
		System.out.println("3개의 숫자를 입력해주세요 !");
		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc4 = new Scanner(System.in);
		int inputNum5 = Integer.parseInt(sc4.nextLine());
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum6 = Integer.parseInt(sc4.nextLine());
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum7 = Integer.parseInt(sc4.nextLine());
		
		if (inputNum5 > inputNum6 && inputNum5 > inputNum7) {
			System.out.print("가장 큰 숫자는 ");
			System.out.println(inputNum5);
		} else if(inputNum6 > inputNum5 && inputNum6 > inputNum7){
			System.out.print("가장 큰 숫자는 ");
			System.out.println(inputNum6);
		} else {
			System.out.print("가장 큰 숫자는 ");
			System.out.println(inputNum7);
		}
		

	}// main
}
