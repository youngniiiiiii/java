package com.kbstar.dao;

import com.kbstar.dto.UserDTO;

import co.kbstar.frame.DAO;

public class UserDAO implements DAO<String,UserDTO>{	//user의 key는 string , value는 UserDTO

	@Override
	public void insert(UserDTO v) throws Exception {
		if(v.getId().equals("id01")) {
			throw new Exception("EX0004");
		}
		System.out.println(v.getId()+"님이 저장 되었습니다.");
		
	}

	private String getId() {
	return null;
}

	@Override
	public void delete(String k) throws Exception {
		if(k.equals("id01")) {
			throw new Exception("EX0005");
		}
		System.out.println(k+"님이 삭제 되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(v.getId().equals("id01")) {
			throw new Exception("EX0006");
		}
		System.out.println(v.getId()+"님의 정보가 수정 되었습니다.");
		
	}


}
