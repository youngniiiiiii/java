package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;

import co.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {	//DAO에서 상속됨. DAO의 정의된 함수를 재정의하여 기능을 구현..

	@Override
	public void insert(ItemDTO v) throws Exception {
		connect();
		//데이터베이스에 입력되는 코드 DML의 insert문
		if(v.getId() == 0001) {
			throw new Exception("IEX0001");
		};
		System.out.println(v);
		System.out.println("Inserted..!");
		close();
	}
	// int id = 100; 이 들어 갈 수 있다.
	@Override
	public void delete(Integer k) throws Exception {//해당 객체 정보를 넣으면 삭제
		connect();
		if(k==0001) {
			throw new Exception("IEX0002");
		};
		System.out.println(k);
		System.out.println("Deleted..!");
		close();
	}

	@Override
	public void update(ItemDTO v) throws Exception {	//해당 객체 정보를 넣으면 업데이트
		connect();
		if(v.getId() == 0001) {
			throw new Exception("IEX0003");	
		}
		System.out.println(v);
		System.out.println("Updated..!");
		close();
	}
}

