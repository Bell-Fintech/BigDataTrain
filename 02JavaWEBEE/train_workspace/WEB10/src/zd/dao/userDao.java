package zd.dao;

import java.sql.SQLException;

import zd.bean.User;

public interface userDao {
	public int register(User user) throws SQLException;
}
