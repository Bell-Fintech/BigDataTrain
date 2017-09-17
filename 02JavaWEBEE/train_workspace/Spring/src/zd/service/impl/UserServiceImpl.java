package zd.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import zd.dao.UserDao;
import zd.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	//private UserDao userDao=new ()....
		//@autoWired自动注入的注解，spring容器会查找容器中是否含有一个类型是UserDao的对象,找到该对象之后
		//注入到该属性中
		//@Resource是jdk提供的，默认会按照对象的唯一标示去查找，如果没有找到的话，会按照类型再去查找
    @Resource
	private UserDao userDao;

	@Override
	public void sayHello() {
		userDao.sayHello();

	}
	

}
