package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		// 짝수만 구하시오
		// i%2 == 0

		int sum = 0;
		double avg = 0.0;

		System.out.println("Start...");
		int cnt = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { 
				sum += i;
				cnt++;
			}
			if (i == 8) {	//제어문 : 8까지만 돌고 멈춘다...
				break;
			}
		}

//		for (int i = 1; i <= 100; i++) {
//			if(i%2 !=0) {		// continue로 짝수만!! 유지보수성으로는 더 좋다~!
//				continue;
//			}
//			sum += i ;
//			cnt++;
//		}
		avg = sum / (cnt * 1.0);
		System.out.printf("%d \n%4.2f\n", sum, avg);
		System.out.println("End..." + cnt);
	}

}
