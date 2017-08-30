package com.service;

import java.sql.SQLException;

import com.domain.User;

public interface AccountService {

		/**
		 * 登录
		 */
		public User  login(String name , String pwd)throws SQLException;
		
		/**
		 * 注册
		 */
	    public int register(User user)throws SQLException;

}
