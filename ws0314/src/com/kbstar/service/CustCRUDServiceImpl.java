package com.kbstar.service;

import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust>{

	DAO<String, String, Cust> dao;	//serviceimpl은 필요에 따라 DAO를 이용한다
	
	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}
	
	
	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증
		// DB 입력
	

		// Email, SMS 전송
		
	}

	@Override
	public void modify(Cust v) throws Exception {
		try{
		dao.update(v);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재 하지 않습니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try{
			dao.delete(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재 하지 않습니다.");
			}
		}
		
	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try{
			cust = dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			}else {
				throw new Exception("ID가 존재 하지 않습니다.");
			}
		}
		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		try {
			list = dao.selectAll();
		}catch (Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			}
		}
		return list;
	}

}
