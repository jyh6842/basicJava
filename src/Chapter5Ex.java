import java.util.Arrays;
import java.util.Scanner;


public class Chapter5Ex {

	public static void main(String[] args) {
		//1.
/*		int[] arr ={10,20,30,40,50};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);*/
		
		//2.
/*		Scanner s = new Scanner(System.in);
		String[] name = new String[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력하세요 >> ");
			name[i] = s.nextLine();
		}
		System.out.println(Arrays.toString(name));*/
		
		//3.
/*		int[] score = { 79, 88,91,33,100,55,95};
		int min = score[0];
		int max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(min < score[i]){
				min = score[i];
			}
			if(max > score[i]){
				max = score[i];
			}
		}
		
		System.out.println(max + " " + min);*/
		
		
		//4.
/*		int sum = 0;
		float avg = 0;
		int[][] arr2 = {
			    {5,5,5,5,5},
			    {10,10,10,10,10},
			    {20,20,20,20,20},
			    {30,30,30,30,30}
			 };
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				sum += arr2[i][j];
			}
		}
		avg = sum /(arr2.length*arr2[0].length);
		
		System.out.println(sum);
		System.out.println(avg);*/
		
		
// 5.
		/*int[] answer= {1,2,3,4,1,2,4,3,2,1,3,2,2,2,1,3,4,1};
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(i+1+" : ");
			System.out.print(counter[i]);
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
// 7. 
/*		String str="i Love Java";

			int idx = str.indexOf("Java");
			System.out.println(idx);*/

// 8.
		String  s ="java.lang.Object";
		String name = s.substring(s.indexOf("lang"), s.indexOf(".Object"));
		System.out.println(name);
		

	}// main

}
