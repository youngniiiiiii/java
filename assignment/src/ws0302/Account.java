package ws0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
		
	}
	
	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}



	public Account(String accNum, String accName, double balance) {
		this();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("금액을 확인해 주세요");
			return;
		}if(money > balance) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		this.balance -= money;
	}
	
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("금액을 확인해 주세요");
			return;
		}
		this.balance += money;
	}
	
	
	public double getInterest() {
		double result = 0.0;
		result = this.balance * this.rate;
		return result;
	}

	
	
	
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public double getRate() {
		return rate;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	
	
}
