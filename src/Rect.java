class RectTest{
  

}
public class Rect{
	   //멤버변수 선언 -이름 가로길이와 세로 길이를 나타냄 
//  name, width, height 
	String name;
	int width;
	int height;

 //생성자1- 매개변수 없다
	Rect(){
		
	}
 //생성자2- 매개변수 있다
	Rect(String name, int width, int height){
		this.name = name;
		this.width = width;
		this.height = height;
	}

 //메소드 - 면적을 구하는 메소드 getArea()
//             둘레를 구하는 메소드 getCircum() 
	int getArea(){
		return width * height;
	}
	
	int getCircum(){
		return width*2 + height*2;
	}

 // 다음과 같이 정보를 출력하는 메소드 -info()
/*        이름 : 사각형 
      가로 : 8
     세로 : 6
     면적 : 48
     둘레  : 28*/
	
	void info(){
		System.out.println(name+", "+getArea() + ", " +getCircum());
	}
    public static void main(String args[]) {
       //Rect객체 생성 
    	Rect r = new Rect("사각형",8,6);
      //info메소드를 호출하여 출력 
    	r.info();
    	
   }
}
