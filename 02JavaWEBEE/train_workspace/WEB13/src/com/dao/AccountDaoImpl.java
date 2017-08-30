package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.domain.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class AccountDaoImpl implements AccountDao{

	@Override
	/**
	 * 登录
	 */
	public User getAccountByNameAndPassword(String name, String pwd) throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select * from user1 where username=? and password=?";
		//执行查询
		User user = runner.query(sql, new BeanHandler<User>(User.class), name,pwd);
		return user;
	}

	@Override
	/**
	 * 注册
	 */
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
