package nuc.sw.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.bean.Member;
import nuc.sw.dao.deptPaginDao;

/**
 * Servlet implementation class deptPaginationServlet
 */
public class deptPaginationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deptPaginationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");		
		int currentPage=1;//��ǰҳ�� 
		if(request.getParameter("page")!=null){//�жϴ���ҳ���Ƿ���Ч
			currentPage=Integer.parseInt(request.getParameter("page"));//�Ե�ǰҳ�븳ֵ
          }
		deptPaginDao Dao=new deptPaginDao();//ʵ����paginDao
		List<Member> list = Dao.find(currentPage);//��ѯ������Ϣ
		request.setAttribute("list", list);//��list���õ�request��
		int pages;
		int count=Dao.findCount();
		if(count % Member.PAGE_SIZE==0){
			pages=count/(Member.PAGE_SIZE);
		}else{
			pages=count/(Member.PAGE_SIZE)+1;
		}
		
		StringBuffer sb=new StringBuffer();//ʵ����StringBuffer
		for(int i=1;i<=pages;i++){
			if(i==currentPage){
				sb.append("["+i+"]");
			}else{
				sb.append("<a href='deptPaginationServlet?page="+i+"'>"+i+"</a>");
			}
			sb.append(" ");
		}
		
		request.setAttribute("bar", sb.toString());
		request.getRequestDispatcher("pageshow.jsp").forward(request, response);
	 
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
