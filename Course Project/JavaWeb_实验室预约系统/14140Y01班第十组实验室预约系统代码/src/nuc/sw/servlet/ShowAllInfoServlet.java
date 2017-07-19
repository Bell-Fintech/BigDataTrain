package nuc.sw.servlet;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.manager;
import nuc.sw.dao.ManagerDao;
/**
 * Servlet implementation class ShowAllInfoServlet
 */
public class ShowAllInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //设置编码
		request.setCharacterEncoding("utf-8");
		//将用户名密码封装到LoginBean中
		manager m=new manager();
		ManagerDao mDao=new ManagerDao();
		 List<manager> mlist=new ArrayList<manager>();
	     mlist=mDao.findAll();
		//查找成功，显示信息
	    for(int i=0;i<mlist.size();i++){
	    m=mlist.get(i);
		request.setAttribute("username",m.getUsername());
		request.setAttribute("password",m.getPassword());
		request.setAttribute("dept",m.getDept());
		request.setAttribute("name",m.getName());
		request.setAttribute("scount",m.getScount());
	     
		//服务器跳转到userShowPage.jsp
		request.getRequestDispatcher("userAllShowPage.jsp").forward(request,response);

	  }
	}
}



