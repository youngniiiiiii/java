package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO> {

	
		HashMap<String, AccountDTO> db;
		
		public AccountDAO() {
			db = new HashMap<String, AccountDTO>();
		}

		@Override
		public void insert(AccountDTO v) throws Exception {
			db.put(v.getAccNo(), v);
			
		}

		@Override
		public void delete(String k) throws Exception {
			db.remove(k);
			
		}

		@Override
		public void update(AccountDTO v) throws Exception {
			db.put(v.getAccNo(), v);
		}

		@Override
		public AccountDTO select(String k) throws Exception {
			AccountDTO obj = null;
			obj = db.get(k);
			return obj;
		}

		@Override
		public List<AccountDTO> select() throws Exception {
			List<AccountDTO> list = new ArrayList<AccountDTO>();
			Collection<AccountDTO> col = db.values();
			for(AccountDTO obj: col) {
				list.add(obj);
			}
			
			return list;
		}
		
		//사용자의 계좌조회
		//obj : 사용자의 id 입력 -> 사용하는 계좌 보여줌
		//Object obj = new String(); 자바의 모든 기능은 Object에서 상속받음
		@Override
		public List<AccountDTO> search(Object obj) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
}
