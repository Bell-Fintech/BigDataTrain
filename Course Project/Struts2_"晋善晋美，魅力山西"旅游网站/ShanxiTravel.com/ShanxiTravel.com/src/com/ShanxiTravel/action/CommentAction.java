package com.ShanxiTravel.action;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.usercomment;
import com.ShanxiTravel.service.CommentServiceMl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class CommentAction extends ActionSupport {
	usercomment comment=new usercomment();
	mainspot spot=new mainspot(); 
	private List<usercomment> CommentList=new ArrayList<usercomment>();
	private String id;
	private String mainspotId;
	private String content;
	private Timestamp contentDate;
	
	public usercomment getComment() {
		return comment;
	}

	public void setComment(usercomment comment) {
		this.comment = comment;
	}

	public mainspot getSpot() {
		return spot;
	}

	public void setSpot(mainspot spot) {
		this.spot = spot;
	}

	public List<usercomment> getCommentList() {
		return CommentList;
	}

	public void setCommentList(List<usercomment> commentList) {
		CommentList = commentList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMainspotId() {
		return mainspotId;
	}

	public void setMainspotId(String mainspotId) {
		this.mainspotId = mainspotId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getContentDate() {
		return contentDate;
	}

	public void setContentDate(Timestamp contentDate) {
		this.contentDate = contentDate;
	}

	//添加信息
	public String addComment() throws Exception{
		comment.setId(id);
		comment.setMainspotId(mainspotId);
		comment.setContent(content);
	    spot.setComment(content);
		
		CommentServiceMl ss=new CommentServiceMl();
		ss.addSpot(spot);
		ss.addComment(comment);
		return "addCommentListOK";
	}
	
	public String findAllComments(){
		CommentServiceMl bs=new CommentServiceMl();
		CommentList=bs.findAll();
		return "CommentListOK";
	}
	
	public String findMainspotComments(){
		CommentServiceMl bs=new CommentServiceMl();
		CommentList=bs.findBySpotId(mainspotId);
		return "CommentListOK";
	}
	//删景点信息方法
	public String deleteComment(){
		CommentServiceMl bs=new CommentServiceMl();
		//先找到对应的才能修改
		comment=bs.findById(id);	
		bs.deleteComment(comment);
		//因为findById找到的是一个对象，所以不能返回空或者其他
		//bs.deleteById(Comment.getId());
		//删除后，应该查找所有
		CommentList=bs.findAll();
		ActionContext.getContext().getSession().put("Comment",CommentList);		
		return "deleteOK";
	}
}
