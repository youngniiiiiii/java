package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.UserMariaDBDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		DAO dao1 = new AccountMariaDBDAO();
		AccountDTO account = new AccountDTO("100", "자유저축", 1000);
		dao1.insert(account);
		
		DAO dao2 = new UserMariaDBDAO();
		UserDTO user = new UserDTO("id01", "pwd01", "james");
		dao2.insert(user);
		
	}

}
