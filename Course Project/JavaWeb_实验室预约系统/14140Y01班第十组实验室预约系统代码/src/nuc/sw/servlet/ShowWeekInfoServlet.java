package nuc.sw.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.Member;
import nuc.sw.dao.MemberDao;

/**
 * Servlet implementation class ShowWeekInfoServlet
 */
@WebServlet("/ShowWeekInfoServlet")
public class ShowWeekInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowWeekInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("utf-8");
		//���û��������װ��LoginBean��
		Member m=new Member();
		MemberDao mDao=new MemberDao();
	    List<Member> mlist=new ArrayList<Member>();
	     mlist=mDao.findAllWeek((String)request.getSession().getAttribute("week"));
	     mlist=mDao.findAllWeek(request.getParameter("week"));
		//���ҳɹ�����ʾ��Ϣ
	    for(int i=0;i<mlist.size();i++){
	    m=mlist.get(i);
		request.setAttribute("username",m.getUsername());
		request.setAttribute("password",m.getPassword());
		request.setAttribute("dept",m.getDept());
		request.setAttribute("name",m.getName());
		request.setAttribute("week",m.getWeek());
		request.setAttribute("day",m.getDay());
		request.setAttribute("time",m.getTime());
		request.setAttribute("scount",m.getSbook());
		//��������ת��userShowPage.jsp
		request.getRequestDispatcher("deptSelectWeek.jsp").forward(request,response);

	    }
	}

}
