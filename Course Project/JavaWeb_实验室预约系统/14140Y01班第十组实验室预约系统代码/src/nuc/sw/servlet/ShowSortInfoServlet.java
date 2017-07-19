package nuc.sw.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.manager;
import nuc.sw.dao.ManagerDao;

/**
 * Servlet implementation class ShowSortInfoServlet
 */
@WebServlet("/ShowSortInfoServlet")
public class ShowSortInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowSortInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//将用户名密码封装到LoginBean中
		manager m=new manager();
		ManagerDao mDao=new ManagerDao();
	    List<manager> mlist=new ArrayList<manager>();
	     mlist=mDao.findAll((String)request.getSession().getAttribute("dept"));
	     mlist=mDao.findAll(request.getParameter("dept"));
		//查找成功，显示信息
	    for(int i=0;i<mlist.size();i++){
	    m=mlist.get(i);
		request.setAttribute("username",m.getUsername());
		request.setAttribute("password",m.getPassword());
		request.setAttribute("dept",m.getDept());
		request.setAttribute("name",m.getName());
		request.setAttribute("scount",m.getScount());
	     
		//服务器跳转到userShowPage.jsp
		request.getRequestDispatcher("stuSelect.jsp").forward(request,response);

	    }
}
}