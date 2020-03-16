package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass { // 익명 클래스 // 내부클래스 중 하나
	public static void main(String[] args) {
		// 하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스
		Button b = new Button(); // 익명 클래스는 gui를 만들때 많이 사용한다. 따른 곳에서는 사용할 이유가 없다.
		
		b.addActionListener(new ActionListener() {
			
			@Override // 객체 생성을 하면서 파마리터를 바로 넘겨줌(익명 클래스) 지금 클래스 하나 가져온 거임
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
				
			}
		});
	}
}
