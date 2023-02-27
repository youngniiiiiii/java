package array;

public class P103 {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		//int []arr = new int[3]; //둘다 선언 가능
		//int arr[] = {10, 20, 30};
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr);
		
		
		System.out.println("Type 2 ");			//값을 꺼낼때는 좋으나 위치파악엔 Xfor(int i=0; i< arr.length; i++) {
		for(int data:arr) {
			System.out.printf("%d \t", data);
		}
		
	}

}
