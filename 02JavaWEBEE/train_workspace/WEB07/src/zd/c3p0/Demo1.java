package zd.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import zd.beans.Product;
import zd.demo.MyDbUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
		//获取c3p0的数据库元数据
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		//获取数据库连接
		Connection conn = dataSource.getConnection();
		String sql = "select * from products" ;
		//获取执行SQL语句的对象
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet resultSet = ps.executeQuery();
		List<Product> list = new ArrayList<>();
		while(resultSet.next()){
			Product product = new Product();
			//封装结果集
			String id = resultSet.getString(1);
			String name = resultSet.getString(2);
			String price = resultSet.getString(3);
			String category = resultSet.getString(4);
			String pnum = resultSet.getString(5);
			String description = resultSet.getString(6);
			product.setId(Integer.parseInt(id));
			product.setName(name);
			//product.setPrice(Double.parseDouble(price));
			product.setCategory(category);
			product.setPnum(Integer.parseInt(pnum));
			product.setDescription(description);
			list.add(product);
			System.out.println(price);
		}
		System.out.println(list.size());
		//释放连接资源
		MyDbUtils.release(conn, ps, resultSet);
	}

}
