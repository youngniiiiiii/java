package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;

import co.kbstar.frame.DAO;
import co.kbstar.frame.SearchService;
import co.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {
//하나의 서비스에 2개의 인터페이스 생성가능
	
	DAO<Integer, ItemDTO> dao;
	//여기서 sms 선언하고 아래에서 sms.send 할 수도 있다.
	
	public ItemService() {
		dao = new ItemDAO();	//프로모션 : 상위클래스 변수DAO에 하위클래스 객체(new ItemDAO();)를 담는것
								//요놈이 바뀌는 것에 따라 '다형성'이 발생 <ex> Oracle을 MySQL로...
	}
	
	@Override
	public void register(ItemDTO v) throws Exception {
		System.out.println(v+"Data Check..");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS..");
	}

	@Override
	public void remove(Integer k) throws Exception {
		System.out.println(k+"Data Check..");
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS..");
		
	}

	@Override
	public void modify(ItemDTO v) throws Exception {
		System.out.println(v+"Data Check..");
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS..");
		
	}

	@Override
	public void search() {
		System.out.println("Item Search..");
		
	}

	
}
