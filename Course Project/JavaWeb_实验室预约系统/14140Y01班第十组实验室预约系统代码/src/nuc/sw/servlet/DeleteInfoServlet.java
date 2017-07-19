package nuc.sw.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.manager;
import nuc.sw.dao.ManagerDao;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class DeleteInfoServlet
 */
public class DeleteInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//将用户名密码封装到LoginBean中
		manager m=new manager();
		ManagerDao mDao=new ManagerDao();
		m=mDao.doDelete((String)request.getSession().getAttribute("username"));
		HttpSession session = request.getSession(); 
		//PrintWriter out = response.getWriter();
		if(mDao.doDelete((String)session.getAttribute("username"))==null){
			//设置错误信息
			request.getSession().setAttribute("username",request.getParameter("username"));
			
			request.setAttribute("yes","删除成功！");
			//服务器跳转到useloginpage.jsp
			request.getRequestDispatcher("manShowPage.jsp").forward(request,response);	
		}else{
			request.setAttribute("error","删除失败！");
			//服务器跳转到web.jsp
			request.getRequestDispatcher("manShowPage.jsp").forward(request,response);
		}
	}

}
