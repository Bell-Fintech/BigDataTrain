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
		        //设置编码
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				//将用户名密码封装到LoginBean中
				manager m=new manager();
				ManagerDao mDao=new ManagerDao();
				m=mDao.findByUsername((String)request.getSession().getAttribute("username"));
				HttpSession session = request.getSession(); 
				if(mDao.findByUsername((String)session.getAttribute("username"))!=null){
				//查找成功，显示信息
				request.setAttribute("username",m.getUsername());
				request.setAttribute("password",m.getPassword());
				request.setAttribute("dept",m.getDept());
				request.setAttribute("name",m.getName());
				request.setAttribute("scount",m.getScount());
				//服务器跳转到userShowPage.jsp
				//PrintWriter out=new PrintWriter();
				request.getRequestDispatcher("showInfoPage.jsp").forward(request,response);
				}else{
					 //查找失败
				request.setAttribute("error", "查找信息错误，请重新查找");	
				}
		
	}

}
