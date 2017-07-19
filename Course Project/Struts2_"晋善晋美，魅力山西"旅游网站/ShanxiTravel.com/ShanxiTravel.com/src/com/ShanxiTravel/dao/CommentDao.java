package com.ShanxiTravel.dao;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.ShanxiTravel.entity.usercomment;

public interface CommentDao<T> {
	public void  addOne(usercomment comment) throws UnsupportedEncodingException;
	public T findById(String id);
	public List<T> findAll();
	public List<T> findBySpotId(String id);
	public void deleteOne(usercomment comment);
}
