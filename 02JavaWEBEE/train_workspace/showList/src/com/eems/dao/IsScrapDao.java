package com.eems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eems.entity.IsScrap;
import com.eems.util.DBUtil;

public class IsScrapDao extends DBUtil{
	//获取是否报废集合列表
	public List<IsScrap> getList()
	{
		String sql="select * from isscrap";
		List<IsScrap> list=new ArrayList<IsScrap>();
		ResultSet rs=this.executeQuery(sql);
		try {
			while(rs.next())
			{
				list.add(new IsScrap(rs.getInt(1),rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		return list.size()>0?list:null;
	}
}
