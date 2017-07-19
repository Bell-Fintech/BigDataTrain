package com.mi.action;

import java.io.Serializable;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.mi.domain.Announce;
import com.mi.service.impl.AnnounceServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AnnounceAction extends ActionSupport implements Serializable{
	private AnnounceServiceImpl s =  new AnnounceServiceImpl();
    private Announce announce;
    private int aid;
    
	public Announce getAnnounce() {
		return announce;
	}
	public void setAnnounce(Announce announce) {
		this.announce = announce;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String listAnnounce(){
		List<Announce> announce = s.findAllAnnounce();
		ActionContext.getContext().put("announce", announce);// #announce
		return SUCCESS;
	}
	
	 public String updateAnnounce(){
  		s.updateAnnounce(announce);
  		ActionContext.getContext().put("message", "保存成功！");
  		return "editOK";
     }
	 
    public String addAnnounce(){
 		s.addAnnounce(announce);
 		ActionContext.getContext().put("message", "保存成功！");
 		return "addOK";
    }
    
    public String delAnnounce(){
 		s.delAnnounce(aid);
 		return "delOK";
 	}
    
     public String editAnnounceUI(){
    	String id = ServletActionContext.getRequest().getParameter("aid");
    	int aid = Integer.parseInt(id);
    	Announce announce = s.findAnnounceById(aid);
 		ActionContext.getContext().put("announce", announce);
 		return "editUI";
     }
       
}
