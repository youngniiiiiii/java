package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

	public CartDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		//System.out.println("Driver Loading 완료");
	}

	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.CartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUser_id());
			pstmt.setString(3, v.getItem_id());
			pstmt.setInt(4, v.getCnt());
			// 날짜자동생성
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.CartDeleteSql);) {
			pstmt.setString(1, k); // 이거 안쓰니까 인덱스에서 누락된 IN 또는 OUT에러 발생
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception();
			}
			System.out.println("상품이 삭제되었습니다.");
		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.CartUpdateSql);) {


			pstmt.setString(2, v.getId());
			pstmt.setInt(1, v.getCnt());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("존재하지 않는 ID입니다.");
			}
		} catch (Exception e) {
			throw e;/////////////////////// e2??
		}

	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.CartSelectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String user_id = rset.getString("user_id");
				String item_id = rset.getString("item_id");
				int cnt = rset.getInt("cnt");

				cart = new Cart(id, user_id, item_id, cnt, null);
			} catch (Exception e) {
				throw e;
			}

		} catch (Exception e) {
			throw e;
		}
		return cart;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		List<Cart> list = new ArrayList<Cart>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.CartSelectAllSql);) {
			try (ResultSet rSet = pstmt.executeQuery();) {
				while (rSet.next()) {
					Cart cart = null;
					String id = rSet.getString("id");
					String user_id = rSet.getString("user_id");
					String item_id = rSet.getString("item_id");
					int cnt = rSet.getInt("cnt");
					Date regdate = rSet.getDate("regdate");

					cart = new Cart(id, user_id, item_id, cnt, regdate);
					list.add(cart);
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cart> search(String k) throws Exception {	//id를 넣으면 걔가 보유한 cart list를 보여줘라
		List<Cart> list = new ArrayList<Cart>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.MycartSelectAllSql);) {
			
			pstmt.setString(1,k);	//String k에 user_id 넣게따는 조건으로
			try (ResultSet rSet = pstmt.executeQuery();) {	//데이터를 조회해라
				
				while (rSet.next()) {
					Cart cart = null;
					String id = rSet.getString("id");
					String user_id = rSet.getString("user_id");
					String item_id = rSet.getString("item_id");
					int cnt = rSet.getInt("cnt");
					Date regdate = rSet.getDate("regdate");

					cart = new Cart(id, user_id, item_id, cnt, regdate);
					list.add(cart);
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

} 

