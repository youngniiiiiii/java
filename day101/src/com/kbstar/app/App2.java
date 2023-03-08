package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		DAO<String, ItemDTO> itemDao = new ItemDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input Command q,i,u,d");
			String cmd = sc.next();
			if(cmd.equals("q")){
				System.out.println("종료합니다.");
				break;

			}else if(cmd.equals("i")){
				System.out.println("상품코드를 입력하세요.");
				String itemId = sc.next();
				System.out.println("상품이름을 입력하세요.");
				String itemName = sc.next();
				System.out.println("상품의 수량를 입력하세요.");
				int itemQt = parseInt(sc.next());
				
				ItemDTO item = new ItemDTO(itemId, itemName, itemQt);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println("상품이 이미 존재합니다.");
				}
				
			}else if(cmd.equals("u")){
				System.out.println("종료");	
				
			}else if(cmd.equals("d")){
				System.out.println("종료");
			}
	}

}

	private static int parseInt(String next) {
		// TODO Auto-generated method stub
		return 0;
	}
}
