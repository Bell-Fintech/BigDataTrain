package zd.test;

import org.junit.Test;

import zd.model.User;
import zd.service.UserService;
import zd.service.impl.UserServiceImpl;

public class Test1 {
	@Test
	public void test1(){
		UserService userService=new UserServiceImpl();
		User user=userService.findUserById(3);
		System.out.println(user);
	}

}
