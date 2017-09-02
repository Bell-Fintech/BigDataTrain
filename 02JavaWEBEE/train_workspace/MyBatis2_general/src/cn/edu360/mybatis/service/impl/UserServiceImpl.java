package cn.edu360.mybatis.service.impl;

import java.util.List;

import cn.edu360.mybatis.dao.UserDao;
import cn.edu360.mybatis.dao.impl.UserDaoImpl;
import cn.edu360.mybatis.model.User;
import cn.edu360.mybatis.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao=new UserDaoImpl();

	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

	public List<User> findUserByUsername(String name) {
		return userDao.findUserByUsername(name);
	}

	public void addUser(User user) {
		 userDao.addUser(user);
  }

}
