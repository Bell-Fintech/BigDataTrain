package zd.dao.impl;

import org.springframework.stereotype.Repository;

import zd.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void sayHello() {
		System.out.println("hello world");

	}

}
