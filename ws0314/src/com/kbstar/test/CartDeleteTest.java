package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartDeleteTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		
		try{
			Service.remove("2023314632100");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
