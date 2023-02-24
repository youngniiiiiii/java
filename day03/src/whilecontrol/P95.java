package whilecontrol;

public class P95 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;

		System.out.println("Start...");

		int i = 1;
		int cnt = 0;

		while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			
			if (i == 8) {    //제어문 80에서 멈춰라
				break;
			}
			i++;
		}

		avg = (sum * 1.0) / cnt;

		System.out.printf("%d\n%4.2f", sum, avg);
		System.out.println("End..." + i);
	}

}
