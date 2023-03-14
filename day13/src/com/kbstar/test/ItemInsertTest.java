package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> Service = new ItemCRUDServiceImpl();
		
		Item obj = new Item("뭐지요", 50000, 3.2);
		try {
			Service.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
								//->CustCrudeService로 가서 try/catch 고객화면에 오류내용을 노출해줌
		}
	}
}