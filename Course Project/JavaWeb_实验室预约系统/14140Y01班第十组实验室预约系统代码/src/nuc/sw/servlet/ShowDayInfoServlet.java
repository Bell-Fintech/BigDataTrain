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
import nuc.sw.bean.Member;
import nuc.sw.dao.MemberDao;
/**
 * Servlet implementation class ShowDayInfoServlet
 */
@WebServlet("/ShowDayInfoServlet")
public class ShowDayInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDayInfoServlet() {
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
		//doGet(request, response);
		request.setCharacterEncoding("utf-8");
		//将用户名密码封装到LoginBean中
		Member m=new Member();
		MemberDao mDao=new MemberDao();
	    List<Member> mlistday=new ArrayList<Member>();
	     mlistday=mDao.findAllDay((String)request.getSession().getAttribute("day"));
	     mlistday=mDao.findAllDay(request.getParameter("day"));
		//查找成功，显示信息
	    for(int i=0;i<mlistday.size();i++){
	    m=mlistday.get(i);
		request.setAttribute("username",m.getUsername());
		request.setAttribute("password",m.getPassword());
		request.setAttribute("dept",m.getDept());
		request.setAttribute("name",m.getName());
		request.setAttribute("week",m.getWeek());
		request.setAttribute("day",m.getDay());
		request.setAttribute("time",m.getTime());
		request.setAttribute("book",m.getSbook());
		//服务器跳转到userShowPage.jsp
		request.getRequestDispatcher("deptSelectDay.jsp").forward(request,response);

	    }
	}

}
