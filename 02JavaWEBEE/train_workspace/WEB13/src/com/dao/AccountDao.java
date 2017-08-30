package com.dao;

import java.sql.SQLException;

import com.domain.Account;
import com.domain.User;

public interface AccountDao {
	/**
	 * 登录
	 */
	public User  getAccountByNameAndPassword(String name , String pwd)throws SQLException;
	
	/**
	 * 注册
	 */
    public int register(User user)throws SQLException;
}
