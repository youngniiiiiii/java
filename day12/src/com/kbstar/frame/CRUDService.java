package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K,V> {	//사용자가 회원가입을 한다
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception; 		//key값을 넣으면 V전체 게시글을 리턴 할것이다
	public List<V> get() throws Exception;	//V를 List에 담아서 리턴 할것이다
}
