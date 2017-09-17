package zd.ssm.service;

import zd.ssm.model.User;

public interface UserService {
	public User findUserByUsernameAndPassword(User user);
}
