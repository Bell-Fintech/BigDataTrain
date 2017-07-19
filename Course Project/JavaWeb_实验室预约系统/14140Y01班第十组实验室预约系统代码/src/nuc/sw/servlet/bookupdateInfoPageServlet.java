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
		//���û��������װ��LoginBean��
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
		//ע����Ϣ,����Ϣ�ŵ�session��
			request.getSession().setAttribute("username",request.getParameter("username"));
			request.getSession().setAttribute("password",request.getParameter("password"));
			request.getSession().setAttribute("dept",request.getParameter("dept"));
			request.getSession().setAttribute("name",request.getParameter("name"));
			request.getSession().setAttribute("week",request.getParameter("week"));
			request.getSession().setAttribute("day",request.getParameter("day"));
			request.getSession().setAttribute("time",request.getParameter("time"));
			request.getSession().setAttribute("sbook",request.getParameter("sbook"));
			
			//��������ת��userLoginPage.jsp
			//ע��ɹ�
			request.getRequestDispatcher("userLoginPage.jsp").forward(request,response);	
		}
		else{
			 //ע�������Ϣ
			request.setAttribute("error", "�޸Ĵ�������������");
			//��������ת��login.jsp
			request.getRequestDispatcher("bookupdateInfoPage.jsp").forward(request,response);	
		}
	}

}
