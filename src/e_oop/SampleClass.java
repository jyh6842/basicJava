package e_oop; // 현재 클래스의 위치를 알려준다.

import java.util.*; // import 다른 패키지에 있는 클래스의 위치를 알려준다. (import는 package 와   class 사이의 위치에 선언한다.)
					// * : util 밑에 있는거 전부 import
// import 방법 : ctrl + shift + o (필요한 import 전부 됨)
public class SampleClass {
	
	int field = 10; //전역변수 : 클래스 전체 영역에서 사용하는 변수 (메소드 밖에 있는 변수)
	
	/*
	 * - 메소드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * - 리턴타입 메소드명(파리미터){ }
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	*/
	
	void method1() {
		System.out.println("파라미터도 리턴타입도 없는 메소드");
	}

	void method2(int parameter) {
		System.out.println(parameter + " 를 사용해 명령을 수행하는 메소드");
	}
	
	void flowTest1(){
		System.out.println("flowTest1 시작 : 1");  //1
		flowTest3();							//2
		System.out.println("flowTest1 종료 : 6");  //8
		
	}
	void flowTest2(){
		System.out.println("flowTest2 시작 : 3"); //5
		System.out.println("flowTest2 종료 : 4"); //6
		
	}
	void flowTest3(){
		System.out.println("flowTest3 시작 : 2"); //3
		flowTest2();						   //4
		System.out.println("flowTest3 종료 : 5"); //7
		
	}

	String method3() {
		return "명령 수행 후 결과물을 돌려주는 메소드";
		// return : 메소드를 종료시키고 결과물을 돌려준다.
		// 리턴타입이 없는 메소드에서는 메소드를 종료시킨다.
	}

	int method4(int a, int b) {
		System.out.println(a + "," + b + " 를 사용해 명령을 수행하고 결과물을 돌려주는 메소드");
		return a + b;
	}

}
