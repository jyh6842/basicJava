package h_useful;

public class ObjectClass {
	
	int a = 10;
	String b = "abc";
	
	ObjectClass(int a, String b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) { // 내용이 같은 변수를 찾고 싶을 때
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	public static void main(String[] args) {
		ObjectClass oc = new ObjectClass(10, "abc");// 생성자를 만든 후에 파라미터가 없어서 객체에 문제가 발생하여 파라미터를 집어 넣음 
		ObjectClass oc2 = new ObjectClass(20, "def"); 
		ObjectClass oc3= new ObjectClass(10, "abc"); 
		
		System.out.println(oc.equals(oc2));
		System.out.println(oc.equals(oc3));
		

	}

	@Override
	public String toString() {
		return "리턴하고 싶은 내용";
	}

}
