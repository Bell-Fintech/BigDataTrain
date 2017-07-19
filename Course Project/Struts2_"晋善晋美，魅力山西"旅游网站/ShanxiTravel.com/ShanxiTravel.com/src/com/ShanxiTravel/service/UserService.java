package com.ShanxiTravel.service;

import java.util.List;

import com.ShanxiTravel.entity.user;
public interface UserService {
	public List<user> findAll();
	public List<user> findByName(String name);
	public user findByUsername(String name);
	public List<user> findByType(String type);
	public void addOne(user u);
	public void updateByUsername(user u);
	public void deleteByUsername(user u);
}
