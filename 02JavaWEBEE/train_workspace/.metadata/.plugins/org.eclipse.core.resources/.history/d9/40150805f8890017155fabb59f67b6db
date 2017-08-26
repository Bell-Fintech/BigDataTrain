package zd.response;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Response2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        //获取输入流
        InputStream in = this.getServletContext().getResourceAsStream("logo.png");
        ServletOutputStream out = response.getOutputStream();
        //响应之前设置响应头信息
        response.setContentType("image/png");
        //定义一个字节数组
        byte[] bs=new byte[1024];
        //定义一个长度
        int len=0;
        //读取输入流
        while((len=in.read(bs))!=-1){
        		out.write(bs, 0, len);
        }
    }

}