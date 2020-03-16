package f_oop2;

// 싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
// 객체들 간에 객체를 공유하기 위해 사용한다

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){ // 이 메소드를 호출하면 이 객체를 필요로 하는 애들이 이 객체를 쓸수 있다. 주소도 똑같음
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
