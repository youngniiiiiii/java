package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		
		System.out.println(Arrays.toString(arr));  //배열 확인하는 방법
		
		
		for(int i=0; i< arr.length; i++) {
//			int data = r.nextInt(99)+1     //1부터 99까징
//			arr[i] = data;
			arr[i] = r.nextInt(99)+1; // 위의 두줄을 간단하게
		}	
		
		int sum = 0;
		double avg = 0.0;
			
		for(int a : arr) {
			sum += a;	
		}
		
		avg = sum / (arr.length*1.0);
			
		//배열의 합과 평균을 구하시오
		System.out.println(Arrays.toString(arr)); 
		System.out.printf("%d \t %4.2f", sum, avg);
			
	}

}
