package zd.context;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletContext extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    	@SuppressWarnings("resource")
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        javax.servlet.ServletContext context =this.getServletContext();
        // 真实路径
        //String path = context.getRealPath("/WEB-INF/classes/db.properties");
        //inf
       // String path = context.getRealPath("/WEB-INF/db.properties");
        //content
       // String path = context.getRealPath("/db.properties");
        //System.out.println(path);
        //FileInputStream in=new FileInputStream(path);
        InputStream in=context.getResourceAsStream("/db.properties");
        Properties p=new Properties();
        p.load(in);
        String src = p.getProperty("aaa");
        System.out.println(src);
        
        
    }

}