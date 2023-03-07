package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// Constructor - 음수 예외 상황
	public Account() {
	}

	public Account(String accNo, String name, String accHolder, double balance) throws Exception {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;

		if (this.balance < 0) {
			throw new Exception("잔액은 음수가 될 수 없습니다.");
		}
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

	public void withdraw(double money) throws Exception {
		if (money <= 0 || balance < money) {
			throw new Exception();
		}
		this.balance -= money;
	}

	public void deposit(double money) throws Exception {
		if (money <= 0) {
			throw new Exception();
		}
		this.balance += money;
	}
}
// 계좌 정보 조회

// 잔액 조회

// 입금 - 음수 예외 상황

// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
