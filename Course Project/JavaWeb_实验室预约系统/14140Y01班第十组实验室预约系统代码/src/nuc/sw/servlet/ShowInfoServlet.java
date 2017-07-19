package nuc.sw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nuc.sw.bean.manager;
import nuc.sw.dao.ManagerDao;

/**
 * Servlet implementation class ShowInfoServlet
 */
public class ShowInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowInfoServlet() {
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
				m=mDao.findByUsername((String)request.getSession().getAttribute("username"));
				HttpSession session = request.getSession(); 
				if(mDao.findByUsername((String)session.getAttribute("username"))!=null){
				//���ҳɹ�����ʾ��Ϣ
				request.setAttribute("username",m.getUsername());
				request.setAttribute("password",m.getPassword());
				request.setAttribute("dept",m.getDept());
				request.setAttribute("name",m.getName());
				request.setAttribute("scount",m.getScount());
				//��������ת��userShowPage.jsp
				//PrintWriter out=new PrintWriter();
				request.getRequestDispatcher("showInfoPage.jsp").forward(request,response);
				}else{
					 //����ʧ��
				request.setAttribute("error", "������Ϣ���������²���");	
				}
		
	}

}
