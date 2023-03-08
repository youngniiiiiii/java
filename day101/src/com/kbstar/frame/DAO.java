package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {	//database의 데이터를 입력/수정/삭제 등
	//일반적인 CRUD (Create, Read, Update, Delete)를 할 수 있도록 기능 정의함
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception; // 한명의 고객에 대해 select에 Key값을 넣으면 V타입을 리턴해라...
	public List<V> select() throws Exception;   //모든고객에 대해 List에 V타입으로 리턴해라..
}
