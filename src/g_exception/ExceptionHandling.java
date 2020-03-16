package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * << 에러 >>
		 * - 컴파일 에러 : 컴파일 시 에 발생되는 에러 (빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * << 런타임 에러 >>
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 *  << 예외 >>
		 *  - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 *  - RuntimeException 클래스와 그 자식들은 예외 처리가 강제되지 않는다.(unchecked 예외)
		 *  - [ RuntimeException 클래스와 그 자식들을 제외한 ] Exception 클래스의 자식들은
		 *  		예외처리가 강제된다.(checked 예외)
		 *  
		 *  << 예외 처리 >>
		 *  - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 *  - try {} catch(Exception e){}
		 *  - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 *  - catch의 () 안에는 처리할 예외를 지정해줄 수 있다.
		 *  - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 *  - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		*/
		
		try { // 실행하고 싶은 문장을 시도
			int result = 10/0; // 예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
			System.out.println(result); // 예외 발생시 실행되지 않는다.
		} catch (ArithmeticException | IndexOutOfBoundsException e) { // 캐치에는 아무것도 없어도 실행은 된다.
			e.printStackTrace(); // 어떤 에러가 발생했는지 보여줌
		} catch (NullPointerException e) {
			
		} catch (Exception e) {
			// 예상치 못한 예외를 처리할 수 있다.
			// 모든 예외를 한번에 처리할 수 있다.
		}
		System.out.println("Here!!");
		
		test1();

	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10/0); // 컴파일 에러가 발생하지 않음 // 개발자가 대부분 잘못한거
		try {
			new FileInputStream(""); // 컴파일 에러가 발생 ==> 반드시 예외 처리를 해야함 // 코딩을 잘해도 예외가 발생하는 부분
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
