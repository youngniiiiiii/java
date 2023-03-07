package bank;

import java.util.Scanner;

public class App {
	// 계좌 생성
	// 계좌 정보조회
	// 계좌 입금
	// 계좌 출금
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();

		while (true) {
			System.out.println("Input q,c,s,d,w");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("시스템종료.....");
				break;
			}
			else if (cmd.equals("c")) {
				System.out.println("계좌개설 정보(계좌번호, 계좌명, 예금주, 잔액)을 입력하세요.");
				String accNo = sc.next();
				String name = sc.next();
				String accHolder = sc.next();
				double balance = Double.parseDouble(sc.next());
				try {
					acc = new Account(accNo, name, accHolder, balance);
					System.out.println("개설 완료! " + acc);
				} catch (Exception e) {
					System.out.println("잔액은 음수가 될 수 없습니다.");
				}

			} else if (cmd.equals("s")) {
				System.out.println("계좌 조회: " + acc );

			} else if (cmd.equals("d")) {
				System.out.println("입금할 금액을 입력하세요.");
				try {
					double money = Double.parseDouble(sc.next());
					acc.deposit(money);
					System.out.println("입금완료! 현재 잔액은 " + acc.getBalance() + "원 입니다.");
				} catch (Exception e) {
					System.out.println("입금금액을 확인하세요.");
				}

			} else if (cmd.equals("w")) {
				System.out.println("출금할 금액을 입력하세요.");
				System.out.println("출금가능금액은" + acc.getBalance() + "원 입니다.");
				try {
					double money = Double.parseDouble(sc.next());
					acc.withdraw(money);
					System.out.println("출금완료! 남은 잔액은 " + acc.getBalance() + "원 입니다.");
				} catch (Exception e) {
					System.out.println("출금금액을 확인하세요.");
				}
			}
		}sc.close();
	}
}