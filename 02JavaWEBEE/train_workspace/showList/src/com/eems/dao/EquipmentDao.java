package com.eems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.eems.entity.Equipment;
import com.eems.util.DBUtil;
import com.eems.util.PageUtil;


public class EquipmentDao extends DBUtil{
	//查询所有的实验设备
		public List<Equipment> getAll()
		{
			List<Equipment> list= new ArrayList<Equipment>();
			String sql="select * from equipment";
			//做查询操作
			try {
				ResultSet rs=this.executeQuery(sql);
				while(rs.next())
				{
					list.add(new Equipment());
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				this.close();
			}
			return list;
		}
	//查询所有的设备  分页
	public List<Equipment> getAll(PageUtil pu)
	{
		List<Equipment> list= new ArrayList<Equipment>();
		String sql="select * from equipment limit ?,?";
		//做查询操作
		try {
			ResultSet rs=this.executeQuery(sql,(pu.getCurrentPage()-1)*pu.getPageSize(),pu.getPageSize());
			while(rs.next())
			{
				list.add(new Equipment(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		return list;
	}
	//获取总的记录数
	public int count()
	{
		String sql="select count(1) from equipment";
		try {
			ResultSet rs=this.executeQuery(sql);
			if(rs.next())
			{
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		return 0;
	}
	//通过id查找设备
	public Equipment getById(int id)
	{
			String sql="select * from equipment where equipmentNo=?";
			//做查询操作
			try {
				ResultSet rs=this.executeQuery(sql,id);
				if(rs.next())
				{
					return new Equipment(rs.getInt(1),rs.getString(2),rs.getString(3),
							rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				this.close();
			}
			return null;
	}
	//添加设备
	public int add(Equipment b)
	{
		String sql="insert into equipment values(?,?,?,?,?,?,?)";
		return this.executeUpdate(sql,b.getEquipmentNo(),b.getEquipmentName(),
				b.getPerson(),b.getEquipmentTypeId(),b.getEquipmentStatusId(),b.getIsScrapId(),b.getChangeMoney());
	}
	//修改设备
	public int update(Equipment b)
	{
		String sql="update equipment set equipmentName=?,person=?,equipmentTypeId=?,equipmentStatusId=?,isScrapId=?,changeMoney=? where equipmentNo=?";
		return this.executeUpdate(sql, b.getEquipmentName(),b.getPerson(),b.getEquipmentTypeId(),
				b.getEquipmentStatusId(),b.getIsScrapId(),b.getChangeMoney(),b.getEquipmentNo());
	}
	//删除设备
	public int delete(int id)
	{
		String sql="delete from equipment where equipmentNo=?";
		return this.executeUpdate(sql, id);
	}
	//查询所有的状态已借出的设备
	public String getNoReturn()
	{
		List<String> list = new ArrayList<String>();
		String sql = "select equipmentName from equipment where equipmentStatusId=2";
		// 做查询操作
		try {
			ResultSet rs = this.executeQuery(sql);
			while (rs.next()) {
				list.add(new String(rs.getString(1)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		
		int i;
		String str="";
		
			for (i = 0; i < list.size() ; i++) 
			{
				str += list.get(i) + " ";
			}	
		return str;
	}
}
