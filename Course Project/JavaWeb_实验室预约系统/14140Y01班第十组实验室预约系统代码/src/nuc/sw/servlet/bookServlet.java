package nuc.sw.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.Member;
import nuc.sw.dao.MemberDao;

/**
 * Servlet implementation class bookServlet
 */
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookServlet() {
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
		response.setCharacterEncoding("utf-8");
		//��������Ϣ��װ��user
	     Member m=new Member();
		   m.setUsername(request.getParameter("username"));
		   m.setPassword(request.getParameter("password"));
		   m.setDept(request.getParameter("dept"));
		   m.setName(request.getParameter("name"));
		   m.setName(request.getParameter("name"));
		   m.setWeek(request.getParameter("week"));
		   m.setDay(request.getParameter("day"));
		   m.setTime(request.getParameter("time"));
		   m.setSbook(request.getParameter("sbook"));
		   
		  
		   MemberDao mDao=new MemberDao();
		   if(mDao.doInsert(m))
		   {    request.getSession().setAttribute("username", request.getParameter("username"));
			 //������������userLoginPage.jsp
			   request.getRequestDispatcher("userLoginPage.jsp").forward(request,response);
		   }
		    else {//���ô�����Ϣ
				   request.setAttribute("error","�û������������������ԤԼ" );
				 //������������register.jsp
				    } 
	
	}
	}


