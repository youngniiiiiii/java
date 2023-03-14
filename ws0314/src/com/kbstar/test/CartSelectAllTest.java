package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectAllTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();
		List<Cart> list = null;
		try {
			list = cartService.get();
			for (Cart data : list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
}
}
