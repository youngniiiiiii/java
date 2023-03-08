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
	public void register(UserDTO v) throws Exception {
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e; //에러가 발생시 여기서 처리안하고 던져서 App까지 간다.
		}
		System.out.println("Send SMS");
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);	
		} catch (Exception e) {
			//log
			throw e; // 서비스단에서 문제발생한 로그를 찍을 수 있다. 만약 try/catch없이 그냥 던져버리면 못한다.
		}	
		System.out.println("Send SMS");
		
	}
	@Override
	public void modify(UserDTO v) throws Exception {
		dao.update(v);  //try/catch없이 여기서 바로 던저버려서 아래 행위가 실행이 안되고 로그가 안찍힘....
		System.out.println("Send SMS");
		
	}


}
