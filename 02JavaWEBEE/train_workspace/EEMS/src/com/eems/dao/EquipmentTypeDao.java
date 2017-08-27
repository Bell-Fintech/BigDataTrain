package com.eems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eems.entity.EquipmentType;
import com.eems.util.DBUtil;


public class EquipmentTypeDao extends DBUtil{
	//获取设备类型集合列表
	public List<EquipmentType> getList()
	{
		String sql="select * from equipmenttype";
		List<EquipmentType> list=new ArrayList<EquipmentType>();
		ResultSet rs=this.executeQuery(sql);
		try {
			while(rs.next())
			{
				list.add(new EquipmentType(rs.getInt(1),rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		return list.size()>0?list:null;
	}
}
