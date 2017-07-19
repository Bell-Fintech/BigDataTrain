package com.ShanxiTravel.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.usercomment;

public interface MCommentService {
	public void addComment(usercomment comment) throws UnsupportedEncodingException;
	public void addSpot(mainspot spot) throws UnsupportedEncodingException;
	public usercomment findById(String id);
	public List<usercomment> findAll();
	public List<usercomment> findBySpotId(String id);
	public void deleteComment(usercomment comment);
	
}
