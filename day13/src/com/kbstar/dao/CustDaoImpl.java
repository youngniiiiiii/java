package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

//dto임
public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
	}

	public Connection getConnection() throws Exception {
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

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate(); // 위 쿼리문을 날린다는 뜻
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate(); // 위 쿼리문을 날린다는 뜻
			if (result == 0) { // result=0 이냐 아니냐로 예외를 확인하려고함
				throw new Exception("ID 없음");
			}

		} catch (Exception e1) { // 시스템장애 오류
			throw e1;
		}

//		try(Connection con = getConnection();
//			PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);)
//		{
//			pstmt.setString(1, k);
//			int result = pstmt.executeUpdate();
//		}catch (SQLException e2) {
//			throw e2;
//		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("없음");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(db_id, db_pwd, name, age);
				System.out.println(db_id+" "+name+" "+age);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
			return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
