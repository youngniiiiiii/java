package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserResisterTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj =
				new UserDTO("id01", "pwd01", "james", "kye4929@naver.com","010-2958-4929");
		UserDTO obj2 =
				new UserDTO("id02", "pwd01", "james", "kye4929@naver.com","010-2958-4929");
		UserDTO obj3 =
				new UserDTO("id03", "pwd01", "james", "kye4929@naver.com","010-2958-4929");

		//insert Test------------------------------------------
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		//get(k) Test------------------------------------------!
		UserDTO user = null;
		try {
		    user = service.get("id01");
		    System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//get() Test--------------------------------------------!
		List<UserDTO> list = null;
		try {
			list = service.get();
			for(UserDTO u :list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//remove() Test-------------------------------------------!
		try {
			service.remove("id02");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//
	}

}
