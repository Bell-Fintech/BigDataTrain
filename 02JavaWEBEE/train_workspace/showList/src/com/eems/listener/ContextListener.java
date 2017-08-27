package com.eems.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.eems.dao.EquipmentStatusDao;
import com.eems.dao.EquipmentTypeDao;
import com.eems.dao.IsScrapDao;
import com.eems.entity.EquipmentStatus;
import com.eems.entity.EquipmentType;
import com.eems.entity.IsScrap;

/*
 * ServletContext 的最大应用是Web缓存----
 * 把不经常更改的内容读入内存，所以服务器响应请求的时候就不需要进行慢速的磁盘I/O了。 
 */
@WebListener
public class ContextListener implements ServletContextListener{
	private EquipmentTypeDao equipmentTypeDao=new EquipmentTypeDao();
	private EquipmentStatusDao equipmentStatusDao=new EquipmentStatusDao();
	private IsScrapDao isScrapDao=new IsScrapDao();
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent sc) {
		List<EquipmentType> typelist=equipmentTypeDao.getList();
		sc.getServletContext().setAttribute("typelist", typelist);
		List<EquipmentStatus> statuslist=equipmentStatusDao.getList();
		sc.getServletContext().setAttribute("statuslist", statuslist);	
		List<IsScrap> slist=isScrapDao.getList();
		sc.getServletContext().setAttribute("slist", slist);
	}
	/*
	 * contextInitialized(ServletContextEvent sce):
	 * 当Servlet容器启动Web应用时调用该方法，在调用该方法之后容器再对Filter初始化
	 * ，并且对那些再Web应用启动时就需要被初始化的Servlet初始化
	 * 
	 * contextDestroyed(ServletContextEvent sce):
	 * 当Serlvet容器终止Web应用时调用该方法，
	 * 在调用该方法之前容器会销毁所有的Serlvet和Filter过滤器
	 */
}
