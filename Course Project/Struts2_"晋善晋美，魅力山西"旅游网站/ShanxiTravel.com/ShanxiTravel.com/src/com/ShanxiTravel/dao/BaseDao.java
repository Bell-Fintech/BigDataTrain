package com.ShanxiTravel.dao;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.user;
import com.ShanxiTravel.entity.images;

public interface BaseDao<T> {
	public List<T> findAll();
	public List<T> findByName(String name);
	public List<T> findByCity(String city);
	public List<T> findByType(String type);
	public List<T> findByRoute(String route);
	public void updateById(mainspot Spot);
	public void deleteSpot(mainspot Spot);
	public T findById(Long id);
	public void updateByUsername(user u);
	public void deleteByUsername(user u);
	public void  addOne(mainspot Spot) throws UnsupportedEncodingException;
	public void addImage(images image);
}
