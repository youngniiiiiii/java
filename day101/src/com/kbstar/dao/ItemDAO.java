package com.kbstar.dao;

import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO> {
	HashMap<String, ItemDTO> db = null;

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getItemId())) {
			throw new Exception();
		}
		db.put(v.getItemId(), v);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getItemId())) {
			throw new Exception();
		}
		db.put(v.getItemId(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception();
		}
		db.remove(k);
		
	}

	@Override
	public ItemDTO select(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
