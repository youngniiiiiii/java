package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustmodifyTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
//		Cust cust = new Cust("id201", "pwd20", "tommy", 30);
//		try {
//			crudService.register(cust);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage()); 
//								//->CustCrudeService로 가서 try/catch 고객화면에 오류내용을 노출해줌
//		}

//		Cust cust2 = new Cust();
//		try {
//			crudService.remove("id05");
//			System.out.println("성공ㅡㅡ");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			// e.printStackTrace();
//		}

		Cust cust3 = new Cust("id76","pw55","benney",30);
		try {
			crudService.modify(cust3);
			
			System.out.println("성공ㅡㅡ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

}
