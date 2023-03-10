package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String, TransactionDTO>{
	DAO<String, TransactionDTO> TransDao;
	
	public TransactionService() {
		TransDao = new TransactionDAO();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		TransDao.insert(v);
		
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO trans = null;
		trans =TransDao.select(k);
		return trans;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list = TransDao.select();
		return list;
	}

	@Override
	public void remove(String k) throws Exception {
		//생략
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		//생략
	}
}
