package zd.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Response extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().write("<html>");
        response.getWriter().write("<head>");
        response.getWriter().write("<body>");
        response.getWriter().write("<form action=''>");
        for(int i=0;i<5;i++){
        	 response.getWriter().write("<input type='text' name='account'/>");
        }
        response.getWriter().write("</form>");
        response.getWriter().write("</body>");
        response.getWriter().write("</head>");
        response.getWriter().write("</html>");
        
    }

}