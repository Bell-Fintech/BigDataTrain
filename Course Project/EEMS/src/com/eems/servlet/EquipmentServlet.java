package com.eems.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eems.dao.EquipmentDao;
import com.eems.dao.EquipmentTypeDao;
import com.eems.dao.UserDao;
import com.eems.entity.Equipment;
import com.eems.util.PageUtil;


@WebServlet({"/equipment","/equip"})
public class EquipmentServlet extends HttpServlet{
	private UserDao userDao=new UserDao();
	private EquipmentDao equipmentDao=new EquipmentDao();
	private EquipmentTypeDao equipmentTypeDao=new EquipmentTypeDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取即将要执行的操作  ，该参数指明直接进行的动作
		/*
		 * op=list 查询所有
		 * op=add   添加
		 * op=delete 删除
		 * op=update 更新
		 * op=getById 查询单个
		 * op=toAdd 到添加的页面
		 */
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//获取请求类型
		String action=req.getParameter("op");
		System.out.println(action);
		if(action==null||"list".equals(action))
		{
			list(req,resp);
		}else if("toAdd".equals(action))
		{
			toAdd(req,resp);
		}else if("add".equals(action))
		{
			add(req,resp);
		}else if("delete".equals(action))
		{
			delete(req,resp);
		}else if("getById".equals(action))
		{
			getById(req,resp);
		}else if("update".equals(action))
		{
			update(req,resp);
		}else if("getByIdSingle".equals(action))
		{
			getByIdSingle(req,resp);
		}
	}
	
	//更新处理
	private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int equipmentNo=0;
		System.out.println(req.getParameter("id1"));
		if(req.getParameter("id1")!=null)
		{
			equipmentNo=Integer.parseInt(req.getParameter("id1"));
		}
		String equipmentName=req.getParameter("equipmentName");
		String person=req.getParameter("person");
		int equipmentTypeId=Integer.parseInt(req.getParameter("equipmentTypeId"));
		int equipmentStatusId=Integer.parseInt(req.getParameter("equipmentStatusId"));
		int isScrapId=Integer.parseInt(req.getParameter("isScrapId"));
	
		Equipment equipment=new Equipment(equipmentNo,equipmentName,person,equipmentTypeId,equipmentStatusId,isScrapId);
		if(equipmentDao.update(equipment)>0)
		{
			resp.sendRedirect("equipment?op=list");
		}else{
			System.out.println("更新失败");
			resp.getWriter().print("修改失败!");
		}
	}
	//通过id获取实验设备对象    主要用来处理更新
	private void getById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取id
		int id=0;
		if(req.getParameter("id")!=null)
		id=Integer.parseInt(req.getParameter("id"));
		//根据id查询记录
		Equipment equipment=equipmentDao.getById(id);
		req.setAttribute("equipment", equipment);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}

	// 通过id获取实验设备对象 主要用来处理单个查询
	private void getByIdSingle(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 获取id
		int id = 0;
		if ((req.getParameter("id") != null)&&req.getParameter("id") != "")
			id = Integer.parseInt(req.getParameter("id"));
		// 根据id查询记录
		Equipment equipment = equipmentDao.getById(id);
		if (equipment != null) {
			req.setAttribute("equipment", equipment);
			String NoReturn = equipmentDao.getNoReturn();
			if ("".equals(NoReturn)) {
				NoReturn = "当前无设备借出";
				req.setAttribute("NoReturn", NoReturn);
			} else {
				NoReturn = "当前设备" + NoReturn + "已借出";
				req.setAttribute("NoReturn", NoReturn);
			}
			req.getRequestDispatcher("id.jsp").forward(req, resp);
		}else{
			req.setAttribute("errormessage", "没有这个实验设备");
			req.getRequestDispatcher("id1.jsp").forward(req, resp);
		}
	}
	//删除处理
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id=0;
		if(req.getParameter("id")!=null)
		     id=Integer.parseInt(req.getParameter("id"));
		if(equipmentDao.delete(id)>0)
		{
			resp.sendRedirect("equipment?op=list");
		}else{
			resp.getWriter().print("删除失败");
		}
		
	}
	//添加处理
	private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int equipmentNo=0;
		if(req.getParameter("id")!=null)
			equipmentNo=Integer.parseInt(req.getParameter("id"));
		String equipmentName=req.getParameter("equipmentName");
		String person=req.getParameter("person");
		int equipmentTypeId=Integer.parseInt(req.getParameter("equipmentTypeId"));
		int equipmentStatusId=Integer.parseInt(req.getParameter("equipmentStatusId"));
		int isScrapId=Integer.parseInt(req.getParameter("isScrapId"));
		
		Equipment equipment=new Equipment(equipmentNo,equipmentName,person,equipmentTypeId,equipmentStatusId,isScrapId);
		if(equipmentDao.add(equipment)>0)
		{
			resp.sendRedirect("equipment?op=list");
		}else{
			resp.getWriter().print("添加失败!");
		}
		
	}
	//跳转到添加页面
	private void toAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("add.jsp").forward(req, resp);
	}
	//查询所有（带分页）的处理
	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PageUtil pageUtil=new PageUtil();
		//设置总共记录数
		pageUtil.setTotalCount(equipmentDao.count());
		//设置每页记录数
		pageUtil.setPageSize(3);
		//获取当前页
		int currentPage=1;
		if(req.getParameter("currentPage")!=null)
		{
			currentPage=Integer.parseInt(req.getParameter("currentPage"));
		}
		pageUtil.setCurrentPage(currentPage);
		//调用dao直接查询
		List<Equipment> list=equipmentDao.getAll(pageUtil);
		
		req.setAttribute("list", list);
		req.setAttribute("page", pageUtil);
		
		String NoReturn =equipmentDao.getNoReturn();
		if("".equals(NoReturn))
		{
			NoReturn="当前无设备借出";
			req.setAttribute("NoReturn", NoReturn);
		}
		else
		{
			NoReturn="当前设备"+NoReturn+"已借出";
		    req.setAttribute("NoReturn", NoReturn);
		}
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
