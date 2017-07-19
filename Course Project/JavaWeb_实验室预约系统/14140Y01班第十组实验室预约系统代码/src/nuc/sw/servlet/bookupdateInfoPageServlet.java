package nuc.sw.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.Member;
import nuc.sw.bean.manager;
import nuc.sw.dao.ManagerDao;
import nuc.sw.dao.MemberDao;

/**
 * Servlet implementation class updeteInfoPageServlet
 */
public class bookupdateInfoPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookupdateInfoPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//将用户名密码封装到LoginBean中
		Member m=new Member();
		m.setUsername(request.getParameter("username"));
		m.setPassword(request.getParameter("password"));
		m.setDept(request.getParameter("dept"));
		m.setName(request.getParameter("name"));
		m.setWeek(request.getParameter("week"));
		m.setDay(request.getParameter("day"));
		m.setTime(request.getParameter("time"));
		m.setSbook(request.getParameter("sbook"));
		
		
		MemberDao mDao=new MemberDao();
		if(mDao.doModify(m)){
		//注册信息,将信息放到session中
			request.getSession().setAttribute("username",request.getParameter("username"));
			request.getSession().setAttribute("password",request.getParameter("password"));
			request.getSession().setAttribute("dept",request.getParameter("dept"));
			request.getSession().setAttribute("name",request.getParameter("name"));
			request.getSession().setAttribute("week",request.getParameter("week"));
			request.getSession().setAttribute("day",request.getParameter("day"));
			request.getSession().setAttribute("time",request.getParameter("time"));
			request.getSession().setAttribute("sbook",request.getParameter("sbook"));
			
			//服务器跳转到userLoginPage.jsp
			//注册成功
			request.getRequestDispatcher("userLoginPage.jsp").forward(request,response);	
		}
		else{
			 //注册错误信息
			request.setAttribute("error", "修改错误，请重新输入");
			//服务器跳转到login.jsp
			request.getRequestDispatcher("bookupdateInfoPage.jsp").forward(request,response);	
		}
	}

}
