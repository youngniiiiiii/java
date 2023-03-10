package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{

	HashMap<String,TransactionDTO> db;
	
	public TransactionDAO() {
		db =  new HashMap<String, TransactionDTO>();
	}
	@Override
	public void insert(TransactionDTO v) throws Exception {
	
		db.put(v.getDate(),v);
	}

	@Override
	public void delete(String k) throws Exception {
		db.remove(k);
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
		db.put(v.getDate(),v);
		
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO trans = null;

		trans = db.get(k);
		return trans;
		
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for(TransactionDTO trans: col) {
			list.add(trans);
		}
		return list;
	}
	//고객이 보유 하고 있는 특정 계좌번호를 입력하면
	//해당계좌의 거래내역을 조회 한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
