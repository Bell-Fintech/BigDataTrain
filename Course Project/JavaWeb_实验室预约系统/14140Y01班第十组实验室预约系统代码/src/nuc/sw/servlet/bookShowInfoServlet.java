package nuc.sw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nuc.sw.dao.*;
import nuc.sw.bean.*;
/**
 * Servlet implementation class bookShowInfoServlet
 */
@WebServlet("/bookShowInfoServlet")
public class bookShowInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookShowInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			Member m=new Member();
			  MemberDao mDao=new MemberDao();
				m=mDao.findByUsername((String)request.getSession().getAttribute("username"));
			   HttpSession session= request.getSession(); 
				if(mDao.findByUsername((String)session.getAttribute("username"))!=null){
			   request.setAttribute("username",m.getUsername());
				request.setAttribute("password",m.getPassword());
				request.setAttribute("dept",m.getDept());
				request.setAttribute("name",m.getName());
				request.setAttribute("week",m.getWeek());
				request.setAttribute("day",m.getDay());
				request.setAttribute("time",m.getTime());
				request.setAttribute("sbook",m.getSbook());
				
			request.getRequestDispatcher("bookshowInfoAction.jsp").forward(request,response);
				}else{
					 //查找失败
				request.setAttribute("error", "查找信息错误，请重新查找");	
				}	
	}

}
