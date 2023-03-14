package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustmodifyTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();

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
