package zd.service;

import java.sql.SQLException;

import zd.dao.UserDao;

import zd.bean.User;

public class UserService {
	
	public User getUserByName(String name) throws SQLException{
		UserDao dao = new UserDao();
		return dao.getUserByName(name);
		
		
	}

}
