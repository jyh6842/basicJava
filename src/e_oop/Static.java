package e_oop;

public class Static {
	public static void main(String[] args) {
		/*
		 * << static >>
		 * - 객체 생성 없이 변수나 메소드를 사용하기 위해 붙인다.
		 * - 객체들 간에 변수의 값을 공유하기 위해 붙인다.
		 * - static 이 붙은 것 : 클래스 멤버(클래스 변수, 클래스 메소드)
		 * - 클래스 멤버 : 메모리에 클래스가 저장될 때 같이 저장된다.
		 * - static이 붙지 않은 것 : 인스턴스 멤버(인스턴스 변수, 인스턴스 메소드)
		 * - 인스턴스 멤버 : 메모리에 인스턴스가 정장될 때 같이 저장된다.
		*/
		
		//static이 붙은 메소드 (클래스명.메소드명)
		Math.random();
		System.out.println();//System이라는 클래스에 out이라는 이름의 변수
		
		System.out.println(ClassMember.classVar);
		ClassMember.classMethod();
		
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		
		System.out.println(cm1.classVar);
		cm1.classMethod();
		//객체를 통해서도 클래스 멤버에 접근할수 있지만 좋은 방법은 아니다. (클래스.클래스변수(메소드)로 접근해라)
		
		ClassMember cm2 = new ClassMember();
		
		System.out.println("변경 전");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		cm2.instanceVar = "인스턴스 변수 변경";

		System.out.println("변경후");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		System.out.println("변경 전");
		System.out.println("cm1 : " + cm1.classVar);
		System.out.println("cm2 : " + cm2.classVar);
		
		cm2.classVar = "클래스 변수 변경";

		System.out.println("변경후");
		System.out.println("cm1 : " + cm1.classVar);
		System.out.println("cm2 : " + cm2.classVar); // 클래스 변수는 cm2의 객체에서 변경한 것이 cm1에서도 변경되었다.
	}
}
