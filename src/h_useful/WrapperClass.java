package h_useful;

import java.util.ArrayList;

public class WrapperClass {
	
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean	: Boolean
		 * char		: Character
		 * byte		: byte
		 * short	: Short
		 * int		: Integer
		 * log		: Long
		 * float	: Float
		 * double	: Double 
		*/
		
		int i = 10; // 기본형 타입
		Integer iw = new Integer(20); //참조형 타입
		
		System.out.println(i + iw); // 기본형 타입과 참조형 타입이 연산이 됨
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE );
		
		System.out.println(i + Integer.parseInt("20"));// 문자열을 숫자로
		
		System.out.println(i + String.valueOf(20));
		
		System.out.println(i + Integer.valueOf("20"));// 문자열을 숫자로 둘중 아무거나 사용해도 됨
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // 배열인데 길이가 유동적인 배열이다. 길이가 저장한만큼 계속 늘어남 <제네릭> 이라고함 타입을 지정하는거
		
		list.add(new Integer(10));
		list.add(10); // 기본형 타입의 int도 저장할 수 있다. 오토박싱 : 기본형 타입이 wrapper 클래스로 자동 변환
		
		Integer integer = list.get(0);// 0번 인덱스에 있는 값 가져오기
		int i2 = list.get(0); //Integer 여도 int에 넣을 수 있다. 언박싱  : wrapper 클래스가 기본형타입을 자동 변환
		System.out.println(integer);
	}
}
