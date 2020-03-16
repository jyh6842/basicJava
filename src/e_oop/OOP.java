package e_oop;

public class OOP {
	public static void main(String[] args) {
		/*
		 * << OOP (Object Oriented Programming) : 객체지향 프로그래밍  >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		*/
		
		SampleClass sc = new SampleClass(); // 객체 생성 //클래스명이 타입 
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
//		String returnString = "명령 수행 후 결과물을 돌려주는 메소드";
		System.out.println(returnString);
		
		sc.method4(7, 15);
		
		sc.flowTest1();
		
		// 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		// 객체가 저장된 변수를 통해 메소드들을 호출해주세요.
		// 파라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고,
		// 리턴타입이 잇는 메소드는 리턴받은 값을 출력해주세요
		ClassMaker c = new ClassMaker();
		c.method1();
		
		int number = c.method2();
		System.out.println(number);
		
		c.method3(5);
		
		int number2 = c.method4(1, 2);
		System.out.println(number2);
		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 123456
		// 5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();
		double result = 0;
		result = cal.add(123456, 654321);
		System.out.println(result);
		result= cal.mul(result, 123456);
		System.out.println(result);
		result= cal.div(result, 123456);
		System.out.println(result);
		result= cal.sub(result, 654321);
		System.out.println(result);
		result= cal.remain(result, 123456);
		System.out.println(result);
	}//main
}//OOP
