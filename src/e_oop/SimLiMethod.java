package e_oop;

import java.util.Scanner;

public class SimLiMethod {
	Scanner s = new Scanner(System.in);
	
	void simLiMethodStart(){
		
		
		System.out.println("심리 테스트입니다.");
		 
		 simLiQ1();

	}// simLiMethod1
	
	void simLiQ1( ){
		System.out.println("나는 금사빠다(금방 사랑에 빠진다) Y / N >> ");
		String input = s.nextLine();
		
		
		if(input.equals("Y")){
			simLiQ2();
		}else if(input.equals("N")){
			simLiQ4();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ1();
		}
	}// simLiMethod1
	void simLiQ2( ){
		System.out.println("연애할 때 끌려다니는 타입이다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ5();
		}else if(input.equals("N")){
			simLiQ3();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ2();
		}
	}// simLiMethod2
	void simLiQ3( ){
		System.out.println("데이트코스는 미리 짜는게 편하다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ6();
		}else if(input.equals("N")){
			simLiQ5();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ3();
		}
	}// simLiMethod3
	void simLiQ4( ){
		System.out.println("감정기복이 크지 않다. Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ7();
		}else if(input.equals("N")){
			simLiQ5();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ4();
		}
	}// simLiMethod4
	void simLiQ5( ){
		System.out.println("감정 표현이 솔직한 편이다. Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ7();
		}else if(input.equals("N")){
			simLiQ6();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ5();
		}
	}// simLiMethod5
	void simLiQ6( ){
		System.out.println("활동적인 데이트가 좋다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ7();
		}else if(input.equals("N")){
			simLiQ9();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ6();
		}
	}// simLiMethod6
	void simLiQ7( ){
		System.out.println("연락이 없어도 믿고 기다리는 편이다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			System.out.println("A : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		}else if(input.equals("N")){
			simLiQ8();
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ7();
		}
	}// simLiMethod7
	void simLiQ8( ){
		System.out.println("이성친구는 존재할 수 없다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			simLiQ9();
		}else if(input.equals("N")){
			System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 타입!");
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ8();
		}
	}// simLiMethod8
	void simLiQ9( ){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다 Y / N >> ");
		String input = s.nextLine();
		if(input.equals("Y")){
			System.out.println("D : 무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
		}else if(input.equals("N")){
			System.out.println("C : 이것은 의리인가 사랑인가... 친구 같이 편안한 연애를 하는 타입!");
		}else{
			System.out.println("Y / N 중 하나를 입력해주세요 >> ");
			simLiQ9();
		}
	}// simLiMethod9
}
