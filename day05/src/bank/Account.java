package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	
	public Account() {
		
		//MakeAccountNumber makenum = new MakeAccountNumber(); 
		//static을 하면 객체 생성하지 않고 클래스.함수 이렇게 사용할수 있다.		
		this.accNum = MakeAccountNumber.makeAccNum();    //계좌번호 따는 로직을 따로 class로 만듦
	}
	
	
	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}


	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}	
	
	// 잔액조회 (getter 이용)
	public double getBalance() {
		return balance;
	}
	
	
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금 금액을 확인 하세요");
			return;
		}
		if(this.balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= money;
	}
	
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인 하세요");
			return;   //if문에 해당될 경우 더 이상 진행안하고 종료한다..
		}
		this.balance += money;
	}

}
