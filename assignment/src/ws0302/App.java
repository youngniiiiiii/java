package ws0302;

public class App {

	public static void main(String[] args) {
	//1. 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
		Account accounts[] = new Account[6];
		
		accounts[0]= new Account("james1", 10000, 0.35, "VIP");
		accounts[1]= new Account("james2", 10000, 0.45, "GOLD");
		accounts[2]= new Account("james3", 10000, 0.55, "SIVER");
		accounts[3]= new Account("james4", 10000, 0.15, "GOLD");
		accounts[4]= new Account("james5", 10000, 0.28, "SIVER");
		accounts[5]= new Account("james6", 10000, 0.31, "VIP");
	//2. 6개의 계좌 정보를 출력 하시오
		double sum = 0.0;
		double avg = 0.0;
		int cnt = 0;
		
		for(Account acc :accounts) {
			System.out.println(acc);

		
	//3. 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
			System.out.printf("잔액은: %4.2f 원, 이자금액은 %4.2f 원\n", acc.getBalance(), acc.getInterest());
			System.out.println("---------------------------------------------------");
		
	//4. VIP들의 잔액의 합과 평균을 출력 하시오
			if(acc.getGrade().equals("VIP")) {
				sum += acc.getBalance();
				cnt++;
			}
				avg = (sum)/cnt;
		}
		System.out.printf("VIP들의 잔액의 합은 %4.2f원, 평균은 %4.2f원",sum,avg);
	}

}
