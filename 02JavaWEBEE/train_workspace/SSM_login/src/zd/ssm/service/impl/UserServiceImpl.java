package zd.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zd.ssm.dao.UserMapper;
import zd.ssm.model.User;
import zd.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User findUserByUsernameAndPassword(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUsernameAndPassword(user);
	}

}
