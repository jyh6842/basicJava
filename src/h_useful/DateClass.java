package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
	
	public static void main(String[] args) {
		Date today = new Date(); //현재 날짜가 생성된 상태로 만들어짐 //java.util 데이트 고르세요
		System.out.println(today);
		
		// 날짜 -> 포맷 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");// 패턴 지정
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");// 패턴 지정 // 대문자 HH는 24시간의미, sss 밀리세컨즈 의미
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 패턴 지정
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a");// 패턴 지정 //yy 뒤에 있는 두자리 표시하겠다. a 오전 오후 표시
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포맷 -> 날짜
		String str = "2020년 2월 20일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str); // 포맷과 다를수 있어서 포맷에 잘못입력 햇을 수 있어서 에러가 발생하는것
			System.out.println(sdf3.format(dateStr)); // 포맷을 또 변경
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// 날짜로 계산하기
		Calendar cal = Calendar.getInstance(); // getInstance() 싱글톤 할때 배웠었음
		
		cal.setTime(new Date());
		cal.set(2020, 2, 19); //2020/02/19 (월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);// 얼만큼 더할건지 2번째 인자
		cal.add(Calendar.MONTH, 2);// 얼만큼 더할건지 2번째 인자
		cal.add(Calendar.DAY_OF_MONTH, -3);// 얼만큼 더할건지 2번째 인자
		cal.add(Calendar.HOUR, 2);// 얼만큼 더할건지 2번째 인자
		cal.add(Calendar.MINUTE, 5);// 얼만큼 더할건지 2번째 인자
		cal.add(Calendar.SECOND, -10);// 얼만큼 더할건지 2번째 인자
		System.out.println(sdf3.format(cal.getTime()));
	}
}
