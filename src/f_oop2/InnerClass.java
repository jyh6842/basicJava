package f_oop2;

import f_oop2.Outer.StaticInner;

public class InnerClass {

}

class Outer{
	
	// 인스턴스 변수
	int instanceVar = 1;
	int var = 10;
	
	// 클래스 변수
	static int classVar = 2;
	
	// 인스턴스 클래스
	class InstanceInner{
		// 인스턴스 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30;
			System.out.println(var); // 30
			System.out.println(this.var); // 20
			System.out.println(Outer.this.var); // 10
		}
	}
	
	// 스태틱 클래스
	static class StaticInner{
		// 스새틱 클래스에서는 클래스 멤버만 사용 가능
//		int inner1 = instanceVar; // static 클래스에는 클래스 변수만 가능 인스턴스 변수는 아직 메모리에 올라오지 않았기 때문에
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	void method(){
		//지역 변수
		int localVar1 = 3;
		final int localVar2 = 4;
		// 지역 클래스
		class LocalInner{
			// 지역 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능하고
			// final이 붙은 지역 변수도 사용 가능
			int inner1 = instanceVar;
			int inner2 = classVar;
//			int inner3 = localVar1; // final이 붙지 않은 변수는 컴파일 에러
			int inner4 = localVar2;
		}
		
		// 지역 클래스는 메소드 내부에서 인스턴스화를 통해 사용 가능
		LocalInner li = new LocalInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
		
		// 인스턴스 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		InstanceInner instanceInner = new InstanceInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		
		// 스태틱 클래스는 클래스를 통해 바로 접근할 수 있다.
		System.out.println(StaticInner.inner3);
		// 스태틱 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야하낟.
		StaticInner si = new StaticInner();
		System.out.println(si.inner2);
	}
}
