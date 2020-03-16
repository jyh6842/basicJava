package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		/*
		 * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작 (a라는 문자가 있으면 a로 시작하는지 검사)
		 * $	앞 문자로 종료
		 * . 	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지[^a-z] : a부터 z가 아닌것)
		 * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수 문자
		*/
		
		String str = "abc123"; //앞에는 영문자 3, 뒤에는 숫자3개씩 오는 패턴으로 만들고 싶다.
//		String regex = "[a-z]{3}[0-9]{1,3}"; //영문자 3개 이하 숫자가 1개 이상 3개 이하라는 패턴을 만들고 싶다
//		String regex = "[a-z0-9]+"; //a~9 : 1개 이상
//		String regex = "\\w*";
		String regex = ".*"; //패턴을 만들때에는 좁게 만드는 것이 중요
		
		Pattern p = Pattern.compile(regex);// regex라는 패턴을 만듬
		Matcher m = p.matcher(str); 
		System.out.println(m.matches()); // 패턴이 일치하는지 매치시켜 확인함
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		String id_str = "6842jyh";
		String password_str = "qewrdfas1@";
		String email_str = "jyh6842@naver.com";
		String id_regex = "[a-z0-9]{5,20}"; // 패턴 만듬
		String password_regex = ".{8,20}"; // 패턴 만듬
		String email_regex  = "[a-z0-9]{5,20}[@]{1}[a-z0-9]{4,10}[.]{1}[a-z]{3,10}"; // 패턴 만듬
		
		Pattern p1 = Pattern.compile(id_regex); // 패턴을 만듬
		Pattern p2 = Pattern.compile(password_regex);
		Pattern p3 = Pattern.compile(email_regex);
		Matcher m1 = p1.matcher(id_str); 
		Matcher m2 = p2.matcher(password_str); 
		Matcher m3 = p3.matcher(email_str); 
		System.out.println(m1.matches()); // 패턴이 일치하는지 매치시켜 확인함
		System.out.println(m2.matches()); // 패턴이 일치하는지 매치시켜 확인함
		System.out.println(m3.matches()); // 패턴이 일치하는지 매치시켜 확인함
		
		
		
		
		
		
		
	}
}
