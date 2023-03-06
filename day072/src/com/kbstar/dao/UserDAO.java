package com.kbstar.dao;

import com.kbstar.dto.UserDTO;

import co.kbstar.frame.DAO;

public class UserDAO implements DAO<String,UserDTO>{	//user의 key는 string , value는 UserDTO

	@Override
	public void insert(UserDTO v) {
		System.out.println(v.getId()+"님이 저장 되었습니다.");
		
	}

	private String getId() {
	return null;
}

	@Override
	public void delete(String k) {
		System.out.println(k+"님이 삭제 되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v.getId()+"님의 정보가 수정 되었습니다.");
		
	}


}
