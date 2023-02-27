package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Random r = new Random();
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = r.nextInt(5)+1; // 위의 두줄을 간단하게
		}	
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		//배열에 홀수 값들의 합과 평균을 구하시오
		
		for(int a : arr) {
			if (a%2 ==1) {
				sum += a;
				cnt++;
			}
		}
		avg = sum / (cnt * 1.0);
		
		System.out.println(Arrays.toString(arr));  //배열 확인하는 방법
		System.out.printf("%d,%4.2f",sum,avg);
	}

}
