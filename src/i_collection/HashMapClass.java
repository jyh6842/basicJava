package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {
	
	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * get()	: 지정된 키의 값을 반환(없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		*/
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("title", "제목입니다.");
		map.put("content", "내욥입니다.");
		map.put("user", "김승섭");
		map.put("date", "2020-02-20 14:48");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동");
		
		System.out.println();
		System.out.println(map.get("user")); // 값이 덮어짐
		
		map.remove("user");// 값 제거
		System.out.println(map.get("user")); // 값이 없어 null 반환		
		
		// 키를 모를때 keySet이라는 것을 사용할 수 있음
		
		System.out.println("키를 찾으려고 합니다.");
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 두 사람의 정보를 저장하고 있는 ArrayList<HashMap<String, String>>을 만들어주세요
		// 홍길동, 남자, 30세, 프로그래머
		// 이순신, 남자, 40세, 장군
		
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		HashMap<String , String> info = new HashMap<>();


		
		info.put("name", "홍길동");
		info.put("gender", "남자");
		info.put("age", "30세");
		info.put("job", "프로그래머");
		
		list.add(info);
		
		info = new HashMap<>();
		
		info.put("name", "이순신");
		info.put("gender", "남자");
		info.put("age", "40세");
		info.put("job", "장군");
		
		list.add(info);
		
		// HashMap을 파라미터로 받아 저장된 모든 값을 출력하는 메소드를 만들어주세요
		for(HashMap<String, String> m : list){ // 리스트에 어레이리스트인데 해쉬맵이 저장되어 있음 하나꺼내면 해쉬맵인것임
			printHashMap(m); // 해쉬맵 m을 넣는 것임
		}
		
	}//main
	
	private static void printHashMap(HashMap<String, String> info){
		for (String key : info.keySet()) {
			 String value = info.get(key);
			System.out.print(key+ " : " + value + "\t");
		}
		System.out.println();
	}
	
}
