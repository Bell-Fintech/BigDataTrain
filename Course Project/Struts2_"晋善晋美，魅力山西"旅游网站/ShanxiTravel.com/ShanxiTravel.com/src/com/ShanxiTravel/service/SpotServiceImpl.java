package com.ShanxiTravel.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import com.ShanxiTravel.dao.SpotDao;
import com.ShanxiTravel.dao.ImagesDao;
import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.images;

public class SpotServiceImpl implements ISpotService{

	public void addOne(mainspot Spot) throws UnsupportedEncodingException{
		SpotDao db=new SpotDao();
		db.addOne(Spot);
	}

	public void addImage(images image) {
		// TODO Auto-generated method stub
		ImagesDao idao=new ImagesDao();
		idao.addImage(image);
	}
	
	public mainspot findById(String spotId) {
		// TODO Auto-generated method stub
		mainspot Spot=new mainspot();
		SpotDao db=new SpotDao();
		Spot=db.findById(spotId);
		return Spot;
	}
	
	public List<mainspot> findAll() {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		SpotDao db=new SpotDao();
		Spots=db.findAll();
	
		/*
		ImagesDao idao=new ImagesDao();
		images image=null;
		for(int i=0;i<Spots.size();i++){
			image=idao.findById(Spots.get(i).getImage());
		//	System.out.print(Spots.get(i).getImage());
			Spots.get(i).setImageInfo(image);
		}
	*/
		return Spots;
	}

	
	public List<mainspot> findByName(String name) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		SpotDao db=new SpotDao();
		Spots=db.findByName(name);
		/*
		ImagesDao idao=new ImagesDao();
		images image=null;
		for(int i=0;i<Spots.size();i++){
			image=idao.findById(Spots.get(i).getImage());
			Spots.get(i).setImageInfo(image);
		}
		*/
		return Spots;
	}
	public List<mainspot> findByCity(String city) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		SpotDao db=new SpotDao();
		Spots=db.findByCity(city);
		/*
		ImagesDao idao=new ImagesDao();
		images image=null;
		for(int i=0;i<Spots.size();i++){
			image=idao.findById(Spots.get(i).getImage());
			Spots.get(i).setImageInfo(image);
		}
		*/
		return Spots;
	}
	public List<mainspot> findByType(String type) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		SpotDao db=new SpotDao();
		Spots=db.findByType(type);
		/*
		ImagesDao idao=new ImagesDao();
		images image=null;
		for(int i=0;i<Spots.size();i++){
			image=idao.findById(Spots.get(i).getImage());
			Spots.get(i).setImageInfo(image);
		}*/
		return Spots;
	}
	public List<mainspot> findByRoute(String route){
		List<mainspot> Spots=new ArrayList<mainspot>();
		SpotDao db=new SpotDao();
		Spots=db.findByRoute(route);
		/*
		ImagesDao idao=new ImagesDao();
		images image=null;
		for(int i=0;i<Spots.size();i++){
			image=idao.findById(Spots.get(i).getImage());
			Spots.get(i).setImageInfo(image);
		}*/
		return Spots;
	}
	public void updateById(mainspot Spot) {
		// TODO Auto-generated method stub
		SpotDao db=new SpotDao();
		db.updateById(Spot);
	}
	
	public void deleteSpot(mainspot Spot){
		SpotDao db=new SpotDao();
		db.deleteSpot(Spot);
	}

}
