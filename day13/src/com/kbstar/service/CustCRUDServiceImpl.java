package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
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
		try {
			dao.insert(v);
		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {//객체비교는 instanceof를 쓴다.
				throw new Exception("ID가 중복 되었습니다.");
			}else {
				throw new Exception("시스템 장애 입니다.");
			}
		}

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
		dao.select(k);
		
		return null;
	}

	@Override
	public List<Cust> get() throws Exception {
		dao.selectAll();
		return null;
	}

}
