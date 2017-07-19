package com.ShanxiTravel.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import com.ShanxiTravel.dao.UserCommentDao;
import com.ShanxiTravel.dao.SpotDao;
import com.ShanxiTravel.entity.usercomment;
import com.ShanxiTravel.entity.mainspot;

public class CommentServiceMl implements MCommentService{
	public void addSpot(mainspot spot) throws UnsupportedEncodingException{
		SpotDao db=new SpotDao();
		db.addComment(spot);	
	}
	public void addComment(usercomment comment) throws UnsupportedEncodingException{
		UserCommentDao db=new UserCommentDao();
		db.addOne(comment);
	}
	public usercomment findById(String id) {
		// TODO Auto-generated method stub
		usercomment UserComment=new usercomment();
		UserCommentDao db=new UserCommentDao();
		UserComment=db.findById(id);
		return UserComment;
	}
	public List<usercomment> findAll() {
		// TODO Auto-generated method stub
		List<usercomment> UserComments=new ArrayList<usercomment>();
		UserCommentDao db=new UserCommentDao();
		UserComments=db.findAll();
		SpotDao idao=new SpotDao();
		mainspot spot=null;
		for(int i=0;i<UserComments.size();i++){
			spot=idao.findById(UserComments.get(i).getMainspotId());
		//	System.out.print(UserComments.get(i).getImage());
			UserComments.get(i).setImageInfo(spot);
		}
		return UserComments;
	}

	
	public List<usercomment> findBySpotId(String id){
		// TODO Auto-generated method stub
		List<usercomment> UserComments=new ArrayList<usercomment>();
		UserCommentDao db=new UserCommentDao();
		UserComments=db.findBySpotId(id);
		SpotDao idao=new SpotDao();
		mainspot spot=null;
		for(int i=0;i<UserComments.size();i++){
			spot=idao.findById(UserComments.get(i).getMainspotId());
			UserComments.get(i).setImageInfo(spot);
		}
		return UserComments;
	}
	public void  deleteComment(usercomment comment){
		UserCommentDao db=new UserCommentDao();
		db.deleteOne(comment);
	}



}
