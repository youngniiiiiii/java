package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;

import co.kbstar.frame.DAO;
import co.kbstar.frame.Service;

public class UserService implements Service<String,UserDTO>{
	
	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	@Override
	public void register(UserDTO v) {
		dao.insert(v);
		System.out.println("Send SMS");
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send SMS");
		
	}
	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("Send SMS");
		
	}

}
