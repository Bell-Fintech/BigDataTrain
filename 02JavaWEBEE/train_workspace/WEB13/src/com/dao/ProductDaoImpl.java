package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.domain.Product;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ProductDaoImpl {
	
	//查询所有的商品
	public List<Product> getAllP() throws SQLException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select * from products";
		List<Product> list = runner.query(sql, new BeanListHandler<Product>(Product.class));
		return list;
	};
	
	//按条件查询
	public List<Product> getProductsByName(String name) throws SQLException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select * from products where name like ?";
		List<Product> list = runner.query(sql, new BeanListHandler<Product>(Product.class),"%"+name+"%");
		return list;
	}
	
	
	/**
	 * 指定删除一个商品
	 * @throws SQLException 
	 */
	public int deleteProductById(String id) throws SQLException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "delete from products where id = ?";
		int i = runner.update(sql, id);
		return i;
	}
	

}
