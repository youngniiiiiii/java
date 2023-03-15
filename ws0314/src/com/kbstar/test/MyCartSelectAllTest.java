package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) throws Exception {
		ShopService<Cust, Cart> service = new ShopServiceImpl();
		
		List<Cart> list = null;
		
		try {
			list = service.myCart("id777");
			if(list.size()==0){
					System.out.println("조회할 데이터가 없습니다");
			}else {
			for (Cart data : list) {
				System.out.println(data);
			}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
}
}
