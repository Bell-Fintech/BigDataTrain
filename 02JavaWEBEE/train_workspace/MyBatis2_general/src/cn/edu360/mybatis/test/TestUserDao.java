package cn.edu360.mybatis.test;

import java.util.List;

import org.junit.Test;

import cn.edu360.mybatis.model.User;
import cn.edu360.mybatis.service.UserService;
import cn.edu360.mybatis.service.impl.UserServiceImpl;

public class TestUserDao {
	UserService userService=new UserServiceImpl();
	@Test
	public void testFindUserById(){
		User user=userService.findUserById(3);
		System.out.println(user);
	}
	
	@Test
	public void testFindUserByUsername(){
		List<User> list=userService.findUserByUsername("张");
		System.out.println(list);
	}
	@Test
	public void testAddUser(){
		User user =new User();
		user.setName("z");
		user.setPwd("");
		userService.addUser(user);
	}

}
