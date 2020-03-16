package f_oop2;

public class Store {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		Product p = (Product)new Desktop(); // 데스크탑의 객체를 프로덕트라는 객체에 저장됨 (형변환 생략 부모라서 가능)
		p.info();
		c.buy(p);// 물건 구매
		
		p = new TV(); //TV 객체 생성
		p.info();
		c.buy(p);
		
		p = new Laptop();// 한 가지 객체가 여러가지 모습을 가지고 있다 (다형성)
		p.info();
		c.buy(p);
		
		c.showItem();
	}
}

class Product{
	String name;
	int price;
	

	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("----------------------");
		System.out.println("상품명 : "+name);
		System.out.println("금   액 : " +price + "원");
		System.out.println("----------------------");
	}
}

class Desktop extends Product{
	Desktop() {
		super("삼성 컴퓨터", 5000000); // 부모클래스의 생성자를 호출한 것
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 100000000);
	}
}

class Laptop extends Product{
	Laptop(){
		super("Asus", 1500000);
	}
}

class Customer{
	int money = 99999999;
	Product[] item = new Product[10]; // 장바구니 (물건들의 공통점은 Product라는 클래스임) 타입이 모두 Product
	
	void buy(Product p){ // 물건을 사는 메소드
		if(money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for (int i = 0; i < item.length; i++) { // 장바구니에 물건 추가
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}
	
	void showItem(){ // 장바구니에 어떤 물건이 들어 있는지 보여주는 메소드
		System.out.println("------------- 장바구니 -------------");
		for (int i = 0; i < item.length; i++) {
			if(item[i] != null){
				System.out.println(i+1 + ", " + item[i].name);
			}
		}
		System.out.println("------------------------");
	}
	
}