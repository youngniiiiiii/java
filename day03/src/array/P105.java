package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Random r = new Random();

		int oddsum = 0;
		double oddavg = 0.0;
		int cnt = 0;
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = r.nextInt(9)+1;
		}
		
		for(int i=0; i< arr.length; i++) {
			if(i%2 == 0) {
				oddsum += arr[i];
				cnt++;
			}
		}	
		
		System.out.println(Arrays.toString(arr));
		
		// 홀수 번째의 합과 평균을 구하시오
		
		oddavg = (oddsum *1.0)/cnt++;
		
		System.out.printf("%d,%4.2f",oddsum,oddavg);
		
	}

}
