package zd.service.impl;

import org.apache.ibatis.session.SqlSession;

import zd.dao.UserMapper;
import zd.model.User;
import zd.service.UserService;
import zd.util.MybatisUtil;

public class UserServiceImpl implements UserService {

	@Override
	public User findUserByusernameAndPassword(User user) {
	    SqlSession session=MybatisUtil.getFactory().openSession();
	    UserMapper userMapper=session.getMapper(UserMapper.class);
	    return userMapper.findUserByusernameAndPassword(user);
	}

}
