package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {
	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
		Cart cart = null;
		cart = new Cart("2023314644100","김낑까깡","BAG", 30, null);
		
		try{
			Service.modify(cart);
			System.out.println("장바구니 정보가 변경되었습니다.");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
