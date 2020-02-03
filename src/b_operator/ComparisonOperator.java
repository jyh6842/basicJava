package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * << 비교 연산자 >>
		 * 
		 * - < : 작다
		 * - > : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다
		 */
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 <= 20 - 15;
		System.out.println(b);
		
		// float 과 double을 비교할 때는 형변환에 주의해야 한다.
		b = 10.0f == 10.0;
		System.out.println(b); //true
		
		b = 10.1f == 10.1;
		System.out.println(b); // false 왜? 실수 같은 경우에는 값을 정확하게 표기하지 못함, 이 값의 근사치를 표기함
		
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1); // 이 경우를 보면 근사치의 값을 보여준다.
		
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b); // 같은 스트링 리터럴은 같은 주소를 갖는다.
		
		b = "abc" == new String("abc"); // new 라는 애가 새로운 주소를 만드는 역할을 함
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 연산자로 내용을 비교할 수 없다.
		//String의 내용을 비교하기 위해서는 equals() 메소드를 사용한다.
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		b = !"abc".equals(new String("ABC"));
		System.out.println(b);
		
		// 다음의 문장들을 코드로 작성해주세요
		// 1보다 2가 큰가?
		b = 1 < 2;
		System.out.println(b);
		// 0은 100보다 작거나 같은가?
		b = 0 <= 100;
		System.out.println(b);
		// 3.14f 와 3.14는 다른가?
		b = 3.14f != 3.14;
		System.out.println(b);
		// "남자"와 "여자"는 다른가?
		b = !"남자".equals("여자");
		System.out.println(b);
	}

}
