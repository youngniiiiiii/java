package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteTest {

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
			String url = "jdbc:oracle:thin:@172.16.21.43:1521:XE";  //네트워크가 망가지면, SQLRecoverableException이 나온다...
			String deleteSql = "DELETE FROM cust WHERE id=?";



			try(Connection con = DriverManager.getConnection(url, id, pwd);
					PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
				pstmt.setString(1, "id88");

				int result = pstmt.executeUpdate();	//위 쿼리문을 날린다는 뜻
				System.out.println(result);		//result=0 이냐 아니냐로 예외를 확인하려고함
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 

		}

	}
