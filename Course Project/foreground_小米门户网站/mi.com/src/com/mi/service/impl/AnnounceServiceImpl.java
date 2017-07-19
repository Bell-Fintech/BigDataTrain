package com.mi.service.impl;

import java.util.List;

import com.mi.dao.impl.AnnounceDaoImpl;
import com.mi.domain.Announce;

public class AnnounceServiceImpl  {
	private AnnounceDaoImpl dao = new AnnounceDaoImpl(); 
	
	public List<Announce> findAllAnnounce() {
		return dao.findAllAnnounce();
	}

	
	public void addAnnounce(Announce announce) {
         dao.addAnnounce(announce);
	}

	
	public Announce findAnnounceById(int aid) {
		return dao.findAnnounceById(aid);
	}

	
	public void updateAnnounce(Announce announce) {
       dao.updateAnnounce(announce);
	}


	
	public void delAnnounce(int aid) {
		dao.deleteAnnounce(aid);
	}

}
