package service;

import java.sql.SQLException;

import zd.bean.User;
import zd.dao.userDao;
import zd.dao.userDaoImpl;

public class userServiceImpl implements userService {
	userDao dao= new userDaoImpl();

	@Override
	public int register(User user) throws SQLException {
		dao.register(user);
		return 0;
	}

}
