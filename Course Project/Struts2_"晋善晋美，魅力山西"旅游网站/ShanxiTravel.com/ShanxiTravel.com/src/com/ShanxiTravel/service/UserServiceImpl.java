package com.ShanxiTravel.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IBinaryAnnotation;
import org.eclipse.jdt.internal.compiler.env.IBinaryField;
import org.eclipse.jdt.internal.compiler.impl.Constant;

import com.ShanxiTravel.dao.UserDao;
import com.ShanxiTravel.entity.images;
import com.ShanxiTravel.entity.user;

public class UserServiceImpl implements UserService{
	public List<user> findAll() {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		UserDao db=new UserDao();
		us=db.findAll();
		return us;
	}
	public List<user> findByName(String name) {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		UserDao db=new UserDao();
		us=db.findByName(name);
		return us;
	}
	public  user findByUsername(String name) {
		user u=new user();
		UserDao db=new UserDao();
		u=db.findByUsername(name);
		return u;
	}
	public List<user> findByType(String type) {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		UserDao db=new UserDao();
		us=db.findByType(type);
		return us;
	}
	public void addOne(user u){
		UserDao db=new UserDao();
		db.addOne(u);
	}
	
	
	public void updateByUsername(user Spot) {
		// TODO Auto-generated method stub
		UserDao db=new UserDao();
		db.updateByUsername(Spot);
	}
	public void deleteUser(user u) {
		// TODO Auto-generated method stub
		UserDao db=new UserDao();
		db.deleteByUsername(u);
	}
	public void deleteByUsername(user u) {
		// TODO Auto-generated method stub
		
	}





}
