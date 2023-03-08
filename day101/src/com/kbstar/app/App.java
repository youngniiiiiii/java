package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

	public class App {

		public static void main(String[] args) {
			
			DAO<String, UserDTO> userDao = new UserDAO();
			
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Input Command(q,i,d,u,s,sa)");
				String cmd = sc.next();
				if(cmd.equals("q")) {
					System.out.println("Bye");
					break;
					
				}else if(cmd.equals("i")) {
					System.out.println("Input ID");
					String id = sc.next();
					System.out.println("Input PWD");
					String pwd = sc.next();
					System.out.println("Input NAME");
					String name = sc.next();
					UserDTO user = new UserDTO(id, pwd, name);  //user 객체 만들어서
					try {
						userDao.insert(user);					//입력받은 값을 데이터베이스에 넣어라!!!
					} catch (Exception e) {
						System.out.println("id가 이미 있습니다.");
					}						
					
				}else if(cmd.equals("d")) {
					System.out.println("Input ID");
					String id = sc.next();						//id 객체 만들어서
					try {
						userDao.delete(id);						//입력받은 id를 데이터베이스에서 삭제해라!!!
					} catch (Exception e) {
						System.out.println("id가 존재하지 않습니다.");
					}							
					
				
				}else if(cmd.equals("u")) {
					System.out.println("Input ID");
					String id = sc.next();
					System.out.println("Input PWD");
					String pwd = sc.next();
					System.out.println("Input NAME");
					String name = sc.next();
					UserDTO user = new UserDTO(id, pwd, name);	//user 객체 만들어서
					try {
						userDao.update(user);					//입력받은 값을 데이터베이스에서 수정해라!!!
					} catch (Exception e) {
						System.out.println("id가 존재하지 않습니다.");
					}						
				}else if(cmd.equals("s")) {
					System.out.println("Input ID..");
					String id = sc.next();
					UserDTO user = null;
					try {
						user = userDao.select(id);
						System.out.println(user);
					} catch (Exception e) {
						
					}
				}else if(cmd.equals("sa")){
					List<UserDTO> list = null; //전체 데이터 받을 준비
					try {
						list = userDao.select();
						for(UserDTO u :list) {
							System.out.println(u);
						}
					} catch (Exception e) {
						
					}
				}
			}
			sc.close();
		}
	}
