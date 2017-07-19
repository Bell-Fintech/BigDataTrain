package nuc.sw.servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nuc.sw.bean.LoginBean;
import nuc.sw.dbc.DBUtil;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		this.doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ñ���
		HttpSession session=request.getSession();//ʵ����session
        request.setCharacterEncoding("utf-8");
		response.setContentType("text/html,utf-8");
		//���û�����װ��loginBean
		LoginBean lb=new LoginBean();
		lb.setUsername(request.getParameter("username"));
		lb.setPassword(request.getParameter("password"));
		lb.setType(request.getParameter("type"));
		ResultSet rs=null;
	   Connection  conn=DBUtil.getConn();
		String sql="select username,password,type from login where username=? and password=? and type=?";
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, lb.getUsername());
					ps.setString(2, lb.getPassword());
					ps.setString(3, lb.getType());
					rs=ps.executeQuery();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		//�ж��û��������Ƿ����
					try {
						if(rs.next()){
							
								try {
									if(rs.getString(3).equals("�ܹ���Ա")){
										response.sendRedirect("manShowPage.jsp");
    } else
										try {
											if(rs.getString(3).equals("Ժ����Ա")){
															
																try {
																	session.setAttribute("username",rs.getString("username"));
																} catch (SQLException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																response.sendRedirect("deptSelect.jsp");
															 
															
														} else
												try {
													if(rs.getString(3).equals("ѧ��")){
														response.sendRedirect("book.jsp");
													}
													else   {
														request.setAttribute("error", "�û�����������������µ�½");
													//request.getRequestDispatcher("login.jsp").forward(request, response);
														
													}
												} catch (SQLException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				
			
		}	
	}


		

	
	

									 
									
							
			
			
			
