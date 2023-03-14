package com.kbstar.frame;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public interface DAO<K1, K2, V> {
	public void insert(V v) throws Exception;
	public void delete(K1 k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K1 k) throws Exception;
	public List<V> selectAll() throws Exception;
	
	public List<V> search(K2 k) throws Exception;
	
	public default Connection getConnection() throws Exception {
		Connection con = null;
		// file을 읽고 정보들을...
		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		// 코드안에는 Id,pw,url 정보가 없어도 file을 읽어서 정보를 끄집어낼수있따..
		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}
}
