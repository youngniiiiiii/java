package ifcontrol;

public class Ws {

	public static void main(String[] args) {
		//1~100까지의 숫자 중
		int sum3 = 0;
		int cnt3 = 1;
		double avg3 = 0.0;
		//1. 3의 배수의 합과 평균을 구하시오
		for(int i = 0; i<=100; i++) {
			if(i%3 == 0) {
				sum3 += i;
				cnt3++;
			}
		}
			avg3 = (sum3)*1.0 / cnt3;
				
		System.out.printf("3의 배수의 합: %d \n3의 배수의 평균: %4.2f\n",sum3,avg3);
		//2. 4의 배수의 합과 평균을 구하시오
		int sum4 = 0;
		int cnt4 = 1;
		double avg4 = 0.0;
		
		for(int i = 0; i<=100; i++) {
			if(i%4 == 0) {
				sum4 += i;
				cnt4++;
			}
		}
			avg4 = (sum4)*1.0 / cnt4;
				
		System.out.printf("4의 배수의 합: %d \n4의 배수의 평균: %4.2f\n",sum4,avg4);
		
		//3. 7의 배수의 합과 평균을 구하시오
		
		int sum7 = 0;
		int cnt7 = 1;
		double avg7 = 0.0;
		
		for(int i = 0; i<=100; i++) {
			if(i%7 == 0) {
				sum7 += i;
				cnt7++;
			}
		}
			avg7 = (sum7)*1.0 / cnt7;
				
		System.out.printf("7의 배수의 합: %d \n7의 배수의 평균: %4.2f\n",sum7,avg7);
	}

}
