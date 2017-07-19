package com.mi.action;

import java.util.List;

import com.mi.domain.Comment;
import com.mi.service.impl.CommentServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {
	private Comment comment;
	private int pid;
	private int cid;
	private List<Comment> comments;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	private CommentServiceImpl s = new CommentServiceImpl();

	public String listComment() {
		this.comments = s.findAllComment(pid);
		return SUCCESS;
	}

	public String delComment() {
		s.deleteComment(cid);
		return "delOk";
	}
}
