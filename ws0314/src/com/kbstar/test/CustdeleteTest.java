package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustdeleteTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		Cust cust = new Cust();
		try {
			crudService.remove("id05");
			System.out.println("성공ㅡㅡ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

}
