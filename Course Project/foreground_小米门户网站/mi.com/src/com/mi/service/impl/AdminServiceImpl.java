package com.mi.service.impl;

import java.util.List;

import com.mi.dao.impl.AdminDaoImpl;
import com.mi.domain.Admin;


public class AdminServiceImpl{
    private AdminDaoImpl dao = new AdminDaoImpl();
    
	
	public Admin login(String aname, String apassword) {
		if(aname==null||apassword==null)
			throw new IllegalArgumentException();
		List<Admin> a2 = dao.findAdminByCondition("where aname='"+aname+"' and apassword='"+apassword+"'");
		if(a2!=null&&a2.size()==1)
			return a2.get(0);
		else
			return null;
	}
}
	
