package cn.edu360.sm.service;

import cn.edu360.sm.model.User;

public interface UserService {
	public User findUserByusernameAndPassword(User user);

	public User findUserById(Integer userId);

}
