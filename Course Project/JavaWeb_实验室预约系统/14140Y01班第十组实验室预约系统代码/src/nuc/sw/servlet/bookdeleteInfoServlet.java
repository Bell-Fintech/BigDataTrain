package nuc.sw.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.Member;
import nuc.sw.dao.MemberDao;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class DeleteInfoServlet
 */
public class bookdeleteInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookdeleteInfoServlet() {
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
		Member m=new Member();
		MemberDao mDao=new MemberDao();
		m=mDao.doDelete((String)request.getSession().getAttribute("username"));
		HttpSession session = request.getSession(); 
		//PrintWriter out = response.getWriter();
		if(mDao.doDelete((String)session.getAttribute("username"))==null){
			//设置错误信息
			request.getSession().setAttribute("username",request.getParameter("username"));
			request.setAttribute("yes","删除成功！");
			//服务器跳转到useloginpage.jsp
			request.getRequestDispatcher("userLoginPage.jsp").forward(request,response);	
		}else{
			request.setAttribute("error","删除失败！");
			//服务器跳转到web.jsp
			request.getRequestDispatcher("userLoginPage.jsp").forward(request,response);
		}
	}

}
