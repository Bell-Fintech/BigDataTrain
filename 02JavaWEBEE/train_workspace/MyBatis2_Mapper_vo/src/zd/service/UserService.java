package zd.service;

import java.util.List;

import zd.model.User;

public interface UserService {
	public User findUserById(int id);
	public List<User> findUserByUsername(String name);
	public void addUser(User user);
	

}
