package zd.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory factory;
	static{
		try {
			InputStream in=Resources.getResourceAsStream("mybatis.xml");
			factory=new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSessionFactory getFactory() {
		return factory;
	}
  
   	
}
