package cn.edu360.mybatis.dao;

import java.util.List;

import cn.edu360.mybatis.model.User;

public interface UserDao {
	public User findUserById(int id);
	public List<User> findUserByUsername(String name);
	public void addUser(User user);
}
