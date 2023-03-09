package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {	//DAO: 제네릭.. 나중에 상속받았을때 타입을 정해서 쓰세요
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception; 		//key값을 넣으면 V전체 게시글을 리턴 할것이다
	public List<V> select() throws Exception;	//V를 List에 담아서 리턴 할것이다
}
