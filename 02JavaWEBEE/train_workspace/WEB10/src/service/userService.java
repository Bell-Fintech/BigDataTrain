package service;

import java.sql.SQLException;

import zd.bean.User;

public interface userService {
	public int register(User user) throws SQLException;
}
