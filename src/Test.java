class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {
		
	}
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage(){
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
	void info(){
		System.out.println(name +", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+ getTotal()+", "+getAverage());
	}
}
public class Test{
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		s.info();

	}

}