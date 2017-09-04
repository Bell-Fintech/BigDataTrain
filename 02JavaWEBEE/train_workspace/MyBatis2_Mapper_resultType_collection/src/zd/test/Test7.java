package zd.test;

import java.util.List;

import org.junit.Test;

import zd.model.User;
import zd.service.UserService;
import zd.service.impl.UserServiceImpl;

public class Test7 {
	@Test
	public void test(){
		UserService userService=new UserServiceImpl();
		List<User> list=userService.findUsersAndOrders();
		for(User user:list){
			System.out.println(user);
		}
		
	}

}
