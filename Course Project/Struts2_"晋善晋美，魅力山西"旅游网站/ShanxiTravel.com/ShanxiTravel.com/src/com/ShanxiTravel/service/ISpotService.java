package com.ShanxiTravel.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.images;

public interface ISpotService {
	public List<mainspot> findAll();
	public List<mainspot> findByName(String name);
	public List<mainspot> findByCity(String city);
	public List<mainspot> findByType(String type);
	public void updateById(mainspot Spot);
	public void deleteSpot(mainspot Spot);
	public void addOne(mainspot Spot) throws UnsupportedEncodingException;
	public void addImage(images image);
}
