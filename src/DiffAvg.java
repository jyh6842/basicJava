
public class DiffAvg {

	public static void main(String[] args) {
		int[] arr = new int[]{50,45,40,35,30,25,20};
		
//		50 - 45 - 40 - 35 - 30 - 25 - 20
//		   5	5	 5	  5    5    5
		
//		0 1, 1 2, 
		int num = 0;
		float avg = 0;
		// 간격 평균 5
		for (int i = 0; i < arr.length-1; i++) {
			num += arr[i] - arr[i+1];
			System.out.println(i+1 +" : " + (arr[i] - arr[i+1]));
		}
		avg = num / (arr.length-1);
		System.out.println("사이의 평균 : " +avg);
		
		// 아래 배열의 간격 평균 : 15
		num = 0;
		arr = new int[]{115, 80, 70, 55, 45, 40, 25};
		for (int i = 0; i < arr.length-1; i++) {
			
			num += arr[i] - arr[i+1];
			System.out.println(i+1 +" : " + (arr[i] - arr[i+1]));
			
		}
		avg = num / (arr.length-1);
		System.out.println();
		System.out.println("사이의 평균 : " +avg);

	}

}
