package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환
		*/
		
		ArrayList<Object> list = new ArrayList<Object>(); // <어떤 타입의 값을 저장할 것인지> Object는 어떤 클래스도 저장할 수 있다. 모두의 부모이기 때문에 아무타입이나 저장할 수 있다.
		
		//Object가 제네릭이면 꺼낼때 어떤 타입인지 알수가 없다. 그래서 한가지 타입으로 정하는게 일반적이다.
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.add(1, "456");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		list2.remove(0); // abc가 삭제되고 1번 인덱스가 0번 인덱스로 자동으로 자리가 옮겨짐
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); // 2차원배열 // new로 만든 생성자에는 제네릭을 안붙여도 된다.
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		
		list3.add(list4); // 3번에는 
		
		System.out.println(list3.get(0));
		
		list4 = new ArrayList<>();
		list4.add(30);
		list4.add(40);
		list3.add(list4); // 이렇게 넣을때마다 list3의 인덱스가 증가한다.
		
		System.out.println(list3.get(1));
		
		list4.add(50);
		list4.add(60);
		
//		System.out.println(list3.get(2)); 이렇게는 안됨
		
		// 정수를 저장할 수 있는 ArrayList를 생성해 1~100 사이의 랜덤한 값을 5번에 저장해주세요.
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list5.add(i, (int)(Math.random()*100)+1);
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(list5.get(i)+" ");
		}
		System.out.println();
		
		// 위에서 만든 ArrayList에 저장된 값들의 합계와 평균을 출력해주세요. 최대값, 최소값
		int min  = list5.get(0);
		int max  = list5.get(0);
		int sum = 0;
		float avg = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(min > list5.get(i) ){
				min  = list5.get(i);
			}
			if(max < list5.get(i) ){
				max  = list5.get(i);
			}
			sum += list5.get(i);
		}
		avg = (float)sum / list5.size();

		System.out.println();
		System.out.println("최소값 : "+min + " 최대값 : " + max + " 합계 : " + sum+ " 평균 : " + avg);
		System.out.println();
		
		
		
		
		
		// 2차원 배열 ArrayList
		ArrayList<ArrayList<Integer>> list6= new ArrayList<>();
		ArrayList<Integer> list7 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list5.add(i, (int)(Math.random()*100)+1);
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(list5.get(i)+" ");
		}
		
		
	}

}
