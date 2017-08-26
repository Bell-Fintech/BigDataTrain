package zd.test;

import java.io.InputStream;
import java.util.Properties;

public class MyServlet {
	/**
	 * @param args
	 * @throws Exception
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException {
		InputStream in = MyServlet.class.getClassLoader().getResourceAsStream("bean.properties");
		Properties p = new Properties();
		p.load(in);
		String userDao = p.getProperty("userDao");
		//c3p0
		UserDao dao = (UserDao)Class.forName(userDao).newInstance() ;
		//c4p0
		//UserDaoImpl2 impl = new UserDaoImpl2() ;
		dao.add();
	}

}
