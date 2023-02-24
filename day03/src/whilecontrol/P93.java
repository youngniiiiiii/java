package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		System.out.println("Start...");
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;

		}
		avg = sum / ((i-1)*1.0);
		
		System.out.printf("%d\n%4.2f",sum,avg);
		System.out.println("End..."+i);
	}

}
