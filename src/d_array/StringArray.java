package d_array;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		String s = new String("ABCD");//참조형 타입으로 초기화하는 방법
		String str = "ABCD"; // String 은 특별히 간단하게 초기화 가능
		// String 문자 여러개를 다루기 위한 클래스
		// char의 배열이 여러개 존재한다. 문자열을 다룰수 있게 해준다
		
		char[] charArray = str.toCharArray();// String 클래스 내부에 문자배열을 가지고 있다.
		System.out.println(charArray);
		System.out.println(charArray[0]); // A
		
		/*
		 * << String 의 주요 메소드 >>
		 * - equals() 	 : 문자열의 내용이 같은지 확인한다.
		 * - length() 	 : 문자열의 길이를 반환한다.
		 * - chatAt() 	 : 문자열에 해당 위치에 있는 문자를 반환한다.
		 * - subString() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * - indexOf() 	 : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * - replace() 	 : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		*/
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		String revStr = ""; // str을 거꾸로 담을 변수
		// 뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		for (int i = str.length() - 1; i >= 0; i--) {
//			revStr += str.charAt(i);
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);

		str = "0123456789";
		String sub1 = str.substring(3);// 3번 인덱스로부터 잘라서 반환한다. 뒤의 인덱스까지 3456...
		System.out.println(sub1);
		String sub2 = str.substring(5,8);//5번 인덱스로부터 8번 인덱스 전까지 잘라서 반환한다. 567
		System.out.println(sub2);
		
		str = "치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자"); // 피자의 시작 인덱스를 반환한다.
		System.out.println(idx);
		
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 500원"
		};
		
		for(int i = 0; i<menus.length; i++){
			String name = menus[i].substring(0, menus[i].indexOf(" "));
			System.out.println(name);
			
			// 가격만 분리시켜 int형 변수에 담기
			int price = Integer.parseInt(menus[i].substring(menus[i].indexOf(" ") + 1, menus[i].indexOf("원"))); // 공백 후 , 원 전 : 숫자만 잘라서 가져오기
			System.out.println(price);
			
		}
		
		str = "123456789";
		str = str.replace("3", "짝");
		System.out.println(str);
		str = str.replace("6", "짝");
		System.out.println(str);
		str = str.replace("9", "짝");
		System.out.println(str);
		
		String pn  = "010-2363-3647";
		// 하이폰(-)을 제거해서 출력해주세요
		pn = pn.replace("-", "");
		System.out.println(pn);
		
		//숫자를 입력받아 입력 받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>>");
		String inputNumber = sc.nextLine();
		
		int count = 0;
		charArray = inputNumber.toCharArray();
	
		if(inputNumber.length() % 3 == 0){ // 3자리

			for (int i = 0; i < inputNumber.length(); i++) {
				
				System.out.print(charArray[i]);
				count++;
				if(count%3==0 && inputNumber.length()-1 != i){
					System.out.print(",");
				}
			}
		}
		
		if(inputNumber.length() % 3 == 1){ // 4자리
			System.out.print(charArray[0]);
			for (int i = 1; i < inputNumber.length(); i++) {
				if(i==1){
					System.out.print(",");
				}
				System.out.print(charArray[i]);
				count++;
				if(count%3==0 && inputNumber.length()-1 != i){
					System.out.print(",");
				}
			}
		}
		if(inputNumber.length() % 3 == 2){ // 5자리
			System.out.print(charArray[0]);
			System.out.print(charArray[1]);
			for (int i = 2; i < inputNumber.length(); i++) {
				if(i==2){
					System.out.print(",");
				}
				System.out.print(charArray[i]);
				count++;
				if(count%3==0 && inputNumber.length()-1 != i){
					System.out.print(",");
				}
			}
		}
		
		System.out.println();
		
		// 개선된 숫자 컴마 찍기
		System.out.println("숫자를 입력해주세요>>");
		inputNumber = sc.nextLine();
		String tmp = "";
		count = 0;
		for (int i = inputNumber.length() -1 ; i >=0; i--) {
			tmp =  inputNumber.charAt(i) + tmp;
			count++;
			
			if(count % 3 == 0 && i != 0){
				tmp = ","+tmp;
			}
		}
		System.out.print(tmp);
		
		

	
	}// main
	
}//public class StringArray
