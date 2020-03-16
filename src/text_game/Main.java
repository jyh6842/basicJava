package text_game;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 
		Scanner sc = new Scanner(System.in);
		
		Method m = new Method();

		System.out.println("모험 RPG 시작");
		
		System.out.println("플레이어 이름을 입력해주세요 >> ");

		Method.playerName = sc.nextLine();

		m.start();

	}

}

 