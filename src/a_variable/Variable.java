package a_variable;

import java.util.Scanner;


//import 단축키  Ctrl + Shift + o
 


public class Variable {

	int a; //전역 변수 : 메소드 밖에서 만든 변수
	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 잇는 메모리 상의 공간
		 * - 타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 잇따.
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * - 실수 : float(4byte), double(8byte)
		 * - 문자 : char(2byte)
		 * - 논리 : boolean(1byte)
		 * 
		 * << 명명 규칙 >>
		 * - 블럭안에서 변수명은 중복될 수 없다.
		 * - 영문 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.(한글 사용은 자제하자)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [기본적으로 변수는 소문자로 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		 * - [클래스명의 첫글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]
		*/

		// 변수 선언 방법 : 데이터 타입 + 변수 이름

		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요
		
		byte _byte;
		char _char;
		boolean _boolean;
		short _short;
		int _int;
		float _float;
		long _long;
		double _double;
		
		// 선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		// 변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.(참조 : 읽는다)
//		System.out.println(_byte); //컴파일 에러 발생(문법이 틀렸다.)
		
		//=(대입 연산자) : 대입	연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.(오른쪽 먼저 연산)
		_byte = 10; //타입에 맞는 값을 저장해야 한다.
		_short = 20;
		_int = 30;
		_long = 40L; //long 접미사 : L
		_float = 3.14f;//float 접미사 : f
		_double = 3.14; //double 접미사 : d 생략 가능
		_char = '가';
		_boolean = true; 
		// 초기화 : 변수에 처음으로 값을 저장하는 것
		
		System.out.println(_int);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디버그 실행
		
		_int = 100;
		System.out.println(_int);
		_int = 100 + 200 ;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요
		_byte = 101; 
		_short = 201;
		_int = 301;
		_long = 4001L; 
		_float = 3.141f;
		_double = 3.141; 
		_char = '나';
		_boolean = false; 
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String ="1234"; //_String 변수, 그 뒤에 오는 값은 리터럴 이라고 함 변하지 않기 때문에 상수라고 생각할 수 있지만 이미 자바에서는 상수를 다른곳에서 사용하기 때문에 다른 이름인 리터럴이라고 부른다.
		System.out.println(_String);
		
		
		/*
		 * << 리터럴의 종류 >>
		 * 숫자 : 0, 10, -5, 3.14, ... ...
		 * 문자 : '가', 'a', '0', ' '
		 * 문자열 : "가나다", "abc", "123, " ", ""
		 * 그 외 : true, false, null
		 * 
		 * << 참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String , AboutClass, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다. 
		 * - 변수의 크기는 4byte 이다.
		 *  : 주소를 참조 했을 때 실제 값이 들어 있음. 저장 하는 것은 주소다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0;
		_float = 0.0f;
		_double = 0.0d;
		_char = '\u0000';// ' ' //기본값 : 역슬러시 유는 유니코드 자바가 문자열을 표기할 때에는 유니코드를 사용한다.
		_boolean = false;//기본값
		_String = null;//기본값

		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int =128;
		_byte = (byte)_int; //형변환 : 데이터 타입을 변환하는 것
		System.out.println(_byte);//128 -> -128로 저장 됨(오버플로우 현상) -> 범위를 넘어서서(손실 발생) -128 ~ 127 범위 
		_byte = -128;
		_int = -129;
		_byte = (byte)_int; 
		System.out.println(_byte);//-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생갹할 수 있다.
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.(3번) 바이트 크기가 아니라 표현 범위임
		_int = (int)_long;
		_long = (long)_float;// 8 4 이지만 표현 범위는 float가 더 넓다.
		_float = (float)_double; 
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환을 해주세요.(3번)
		_long = _byte; // 8 1
		//_long = (long)_float; // 8 1 (x)
		_float = _long;
		_double =_float; // 8 4
		
		//float의 표현 범위가 long보다 큼 실수가 데이터의 크기는 작더라도 정수보다 표현 범위는 크다.
		//큰 타입에서 작은 타입으로 저장을 할 경우에는 형변환이 필요
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; 값을 한번만 넣을 수 있다.
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);
		
/*		System.out.println("문자열을 입력해주세요 >> ");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열  : " + input1);
		
		System.out.println("숫자를 입력해주세요 >> ");
		int input2 = Integer.parseInt(s.nextLine()); //문자열을 숫자로 바꾸기 위해서 형변환 Integer.parseInt 사용
		System.out.println("입력받은 숫자  : " + input2);
*/
		
/*		//문자열을 입력받고 입력 받은 문자열을 출력해주세요.
		System.out.print("문자를 입력해주세요 >> ");
		String input3 = s.nextLine();
		System.out.println("입력 받은 문자열입니다. : " + input3);
		
		//숫자를 입력받고 입력 받은 숫자를 출력해주세요.
		System.out.print("숫자를 입력해주세요 >> ");
		int input4 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input4);
		
		//위에서 입력 받은 문자열과 숫자를 더해서 출력해 주세요
		System.out.println("입력받은 문자열과 숫자를 더해서 출력 : " + input3 + input4); //스트링과 다른 타입이 만나면 스트링
*/	
		
/*		//3개의 숫자를 입력받고 그 숫자들을 더한 결과를 출력해주세요
		System.out.println("3개의 숫자를 입력해주세요 : ");
		System.out.println("1. ");
		int input5 = Integer.parseInt(s.nextLine());
		System.out.println("2. ");
		int input6 = Integer.parseInt(s.nextLine());
		System.out.println("3. ");
		int input7 = Integer.parseInt(s.nextLine());
		
		int result = input5+input6+input7;
		System.out.println("입력 받은 3개의 숫자들의 합은 ? : "+ result );
*/
		
		
		//아이디, 비밀번호, 이름, 전화번호, 이메일을 입력받고 마지막에 입력받은 내용 전체를 출력해주세요.
		System.out.println("아이디, 비밀번호, 이름, 전화번호, 이메일을 입력해 주세요!!");
		System.out.println("아이디 : ");
		String input8 = s.nextLine();
		System.out.println("비밀번호 : ");
		String input9 = s.nextLine();
		System.out.println("이름 : ");
		String input10 = s.nextLine();
		System.out.println("전화번호 : ");
		String input11 = s.nextLine();
		System.out.println("이메일 : ");
		String input12 = s.nextLine();
		
		System.out.println("입력받은 내용들을 전부 출력하겠습니다. ");
		System.out.println(input8+input9+input10+input11+input12);
	}

}
