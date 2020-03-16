package f_oop2;

public class SampleParent extends Object{ // 컴파일러가 명시하지 않아도 따로 상속 받는게 없다면 Object를 자동을 상속 받는다.
	
	String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent() {
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a + b;
	}
	
	
}
