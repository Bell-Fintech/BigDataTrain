package com.mi.service.impl;

import java.util.List;

import com.mi.dao.impl.CommentDaoImpl;
import com.mi.domain.Comment;

public class CommentServiceImpl {
    private CommentDaoImpl dao = new CommentDaoImpl();
	
	public List<Comment> findAllComment(int pid) {
		return dao.findAllComment(pid);
	}

	
	public void deleteComment(int cid) {
        dao.deleteComment(cid);
	}

}
