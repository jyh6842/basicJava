package c_statement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		
		int a,b,c;
		a=0;b=0;c=0;
		int x,y,z = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			a = (int) (Math.random() * 9) + 1;
			b = (int) (Math.random() * 9) + 1;
			c = (int) (Math.random() * 9) + 1;
			if (a != b && a != c && b != c) {
				break;
			}
		}
		System.out.println(a + "" + b + "" + c);
		
		int count = 0;
		while (true) {
			int input = 0;
			int tmp1 = 0;
			int tmp2 = 0;
			int tmp3 = 0;
			
			int countS = 0;
			int countB = 0;
			int countO = 0;
			
			count++;
			System.out.println("입력해주세요");
			input = Integer.parseInt(sc.nextLine());
			if(input == a*100+b*10+c){
				System.out.println("정답입니다.");
				System.out.println(count +"번 째 입력으로 정답을 맞췄습니다.");
				break;
			}else{
				 tmp3 = input % 10; // 1의 자리
				 tmp2 = input / 10 % 10; // 10의 자리
				 tmp1 = input / 100 % 10; // 100의 자리
				 
				 /*if(a == tmp1 || a == tmp2 || a == tmp3){
					 if( a == tmp1){
						 countS++;
					 }
					 else if( a == tmp2 || a == tmp3){
						 countB++;
					 }
				 }else {
					 countO++;
				 }

				 if(b == tmp1 || b == tmp2 || b == tmp3){
					 if( b == tmp1){
						 countS++;
					 }
					 else if( b == tmp2 || b == tmp3){
						 countB++;
					 }
				 }else {
					 countO++;
				 }

				 if(c == tmp1 || c == tmp2 || c == tmp3){
					 if( c == tmp1){
						 countS++;
					 }
					 else if( c == tmp2 || c == tmp3){
						 countB++;
					 }
				 }else {
					 countO++;
				 }*/
				 
				
					if (a == tmp1) {
						countS++;
					}else if(a == tmp2 || a == tmp3){
						countB++;
					}
					if (b == tmp2) {
						countS++;
					}else if(b == tmp1|| b == tmp3){
						countB++;
					}
					if (c == tmp3) {
						countS++;
					}else if(c == tmp1 || c == tmp2){
						countB++;
					}
					// S
					
					// B
					if(a !=tmp1 && a !=tmp2 && a != tmp3){
						countO++;
					}
					if(b !=tmp1 && b !=tmp2 && b != tmp3){
						countO++;
					}
					if(c !=tmp1 && c !=tmp2 && c != tmp3){
						countO++;
					}
					//O
					
					System.out.println(countS+" Strike "+countB+" Ball "+countO+" Out");				 
				 
			}
			
		}
	}
}
