package h_useful;

public class StringSpeedTest {
	
	public static void main(String[] args) {
		//String
//		String str = "a";
//		
//		long start = System.currentTimeMillis();
//		for(int i = 0; i< 200000; i++){
//			str += "a"; // 문자열을 더하고 있음
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start +"ms");
		
		// 속도가 String보다 우수
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			sb.append("a"); //위 처럼 9를 더해주는 것
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start +"ms");
		
	}
}
