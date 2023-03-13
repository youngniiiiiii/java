package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertTest3 {// 교재 P224 BASIC!!!!

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공.");
		
		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.59:1521:XE";
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";



		try(Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(insertSql);) {
			pstmt.setString(1, "id99");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "권영은");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate();	//위 쿼리문을 날린다는 뜻
			System.out.println(result);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 

	}

}
