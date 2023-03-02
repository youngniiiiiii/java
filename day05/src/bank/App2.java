package bank;

import java.util.Scanner;

public class App2 {  //실제 애플리케이션

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		Account acc = null;   //변수를 while문 밖에 선언을 함-> while문 안에 하면 명령문 실행시마다 초기화 됨
		
		while(true) {
			
			System.out.println("Input Command(c,w,d,s,q)");
			String cmd = sc.next();  //화면에서 입력되는 값을 끄집어온다.
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("c")) {
				System.out.println("Create Account:");	
				System.out.println("Input Account Info[name,balace]");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());		//String을 넣음 Double로 만들어 줌
				
				acc = new Account(name, balance);
				System.out.println(acc);
				
			}else if(cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("Input Withdraw Money");
				
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);				
				System.out.println(acc);
				
			}else if(cmd.equals("d")) {
				System.out.println("Deposite:");
				System.out.println("Input Deposit Money");
				
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println(acc);

				
			}else if(cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);
			}
		}
		sc.close();
	}
 
}
