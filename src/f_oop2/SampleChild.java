package f_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var); // 상속받은 변수
		int result = method(7,3); // 상속받은 메소드
		System.out.println(result); 
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild(); // 부모 생성자를 먼저 호출하고 자식 생성자를 호출함 //자식에서 오버로딩이 안됬으면 부모클래스에서 그냥 실행되는 것임 물려받은 것이 아님
		
		System.out.println(sc.var); //컴파일 에러가 발생함 //객체를 통해서 호출하면 됨 //오버라이딩을 하게되면 값이 다름
		
		int result = sc.method(7, 3);
		System.out.println(result);
	}
	
	// 오버라이딩 : 상속받은 메소드에 내요을 재정의 하는 것
	@Override//어노테이션 //오버라이드 라는 어노테이션이 있으면 내가 이름을 비슷하게(잘못) 입력하면 컴파일 에러가 발생하게 해준다.
	int method(int a, int b){ //파라미터의 개수와 타입은 똑같아야한다. 메소드의 이름도 똑같아야 하고 반환타입도 똑같아야 한다.
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var);// 지역 변수
		System.out.println(this.var); // 인스턴스 변수
		System.out.println(super.var);// 부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10,20));
		System.out.println(super.method(10,20));
	}
	
	SampleChild() {
		super();
		//super() 를 사용해 부모 클래스의 객체도 생성한다.
		//super() 가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
}
