package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.UserDao;
import zd.model.User;
import zd.service.UserService;
import zd.util.MybatisUtil;

public class UserServiceImpl implements UserService {

	public User findUserById(int id) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		UserDao daili=session.getMapper(UserDao.class);
		User user=daili.findUserById(id);
		return user;
		
	}

	public List<User> findUserByUsername(String name) {
		return null;
	}

	public void addUser(User user) {
		
   }

}
