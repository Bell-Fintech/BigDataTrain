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
		//���ñ���
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//���û��������װ��LoginBean��
		manager m=new manager();
		ManagerDao mDao=new ManagerDao();
		m=mDao.doDelete((String)request.getSession().getAttribute("username"));
		HttpSession session = request.getSession(); 
		//PrintWriter out = response.getWriter();
		if(mDao.doDelete((String)session.getAttribute("username"))==null){
			//���ô�����Ϣ
			request.getSession().setAttribute("username",request.getParameter("username"));
			
			request.setAttribute("yes","ɾ���ɹ���");
			//��������ת��useloginpage.jsp
			request.getRequestDispatcher("manShowPage.jsp").forward(request,response);	
		}else{
			request.setAttribute("error","ɾ��ʧ�ܣ�");
			//��������ת��web.jsp
			request.getRequestDispatcher("manShowPage.jsp").forward(request,response);
		}
	}

}
