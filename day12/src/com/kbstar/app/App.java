package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class App {
	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			UserDTO user = null;
			System.out.println("Login(l) or Register(r) (q)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				break;
			} else if (cmd.equals("r")) {
				System.out.println("Register");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				String email = sc.next();
				String contact = sc.next();
				user = new UserDTO(id, pwd, name, email, contact);
				try {
					service.register(user);
					System.out.println("가입을 축하합니다!!! 환영합니다!!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {
				System.out.println("Login");
				String id = sc.next();
				String pwd = sc.next();
				user = null;
				try {
					user = service.login(id, pwd);
					System.out.println(user);
					System.out.println("로그인성공");
					System.out.println("-------------------------------------");
					while (true) {
						System.out.println("Menu(m,t,a,i,tr,e)......");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							break;
						} else if (cmn.equals("m")) {
							System.out.println("Make Account..");
							double balance = Double.parseDouble(sc.next());
							service.makeAccount(user.getId(), balance);
							System.out.println("계좌개설 완료!!");
						} else if (cmn.equals("t")) {
							System.out.println("Transaction..");
							String sendAcc = sc.next();
							String receiveAcc = sc.next();
							double balance = Double.parseDouble(sc.next());
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("Transaction Complete..");
						} else if (cmn.equals("a")) {
							System.out.println("Select Account..");
							List<AccountDTO> list = null;
							list = service.getAllAccount(user.getId());
							for(AccountDTO acc:list) {
								System.out.println(acc);
							}
						} else if (cmn.equals("i")) {
							System.out.println("User Info..");
							String rid = user.getId();
							UserDTO ruser = null;
							ruser = service.getUserInfo(rid);
							System.out.println(ruser);
							
						} else if (cmn.equals("tr")) {
							System.out.println("Select Transaction..");
							String accNo = sc.next();
							List<TransactionDTO> list = null;
							list = service.getAllTr(accNo);
							for(TransactionDTO tr:list) {
								System.out.println(tr);
							}
							
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			
		}sc.close();
	}
}