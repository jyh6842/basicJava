package f_oop2.ex_interface;

public class Starcraft { //인터페이스의 사용 예

	public static void main(String[] args) {
		Marin marin = new Marin();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(marine);
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
	}
}

class Unit{
	int hp; // 체력
	final int MAX_HP;
	
	Unit(int hp) { // 파라미터가 있음
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marin extends Unit{ // 부모 클래스의 생성자에 파라미터가 있어서 컴파일 에러가 발생햇었음
	Marin() {
		super(40); //부모의 변수가 40으로 초기화	
	}
}

class Tank extends Unit implements Repairable{
	Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV() {
		super(60);
	}
	
	void repair(Repairable r){ // 어떤 유닛이 올지 모른다. 공통적으로 상속받고 있는 Unit 클래스가 있다. Unit 타입의 클래스를 파라미터로 넣으면 좋겠지만 마린은 기계타입이 아니라서 수리 못함 마린은 파라미터로 받으면 안됨
				   			   // 구분하기 위해 인터페이스를 만들자
							   // 이 타입에 해당하는 애들만 사용이 가능. 어떤 객체가 넘어와도 아무런 변수와 메소드가 없어서 다른 타입으로 형변환을 해줄 필요가 있다. 변수나 메소드를 가지고 있는 타입
		if(r instanceof Unit){ // Unit으로 형변환이 가능한지 확인 // r 이라는 객체가 Unit이라는 타입으로 형변환 가능한지 확인해주는 명령어 instanceof
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}