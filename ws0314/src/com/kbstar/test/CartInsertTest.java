package com.kbstar.test;

import com.kbstar.dto.Cart;

import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		
		Cart cart = new Cart("id10000","bag01",3);
		try{
			Service.register(cart);
			System.out.println("장바구니 담기 성공");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
