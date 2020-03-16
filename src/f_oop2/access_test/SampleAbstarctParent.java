package f_oop2.access_test;

public abstract class SampleAbstarctParent {

	void method() {

	}

	// 추상 메소드 : 선언부만 있고 구현부는 없는 메소드
	abstract void abstractMethod(); // 추상메소드는 일반적인 클래스가 가질 수 없다. 추상클래스드만 가질 수 있다.

}

class SampleAbstractChild extends SampleAbstarctParent {

	// 추상 클래스로 만들지 or 추상 메소드를 오버라이딩하여 구현해야함
	// 메소드 만들고 싶으면 클래스에 ctrl + 1 하여 메소드를 오버라이딩 한다.

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub

	}

}