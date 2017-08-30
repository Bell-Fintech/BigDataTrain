package com.service;

import java.sql.SQLException;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.domain.User;

public class AccountServiceImpl  implements AccountService{
     AccountDao  dao = new AccountDaoImpl();
	@Override
	public User login(String name, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAccountByNameAndPassword(name, pwd);
	}

	@Override
	public int register(User user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
