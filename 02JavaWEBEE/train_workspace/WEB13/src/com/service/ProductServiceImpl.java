package com.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dao.ProductDaoImpl;
import com.domain.Product;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ProductServiceImpl {
	
	     ProductDaoImpl daoImpl = new ProductDaoImpl();
	    //查询所有的商品
		public List<Product> getAllP() throws SQLException{
			return daoImpl.getAllP();
		};
		//按条件查询
		public List<Product> getProductsByName(String name) throws SQLException{
			return daoImpl.getProductsByName(name);
		}
		/**
		 * 删除一个商品
		 * @throws SQLException 
		 */
		public int deleteProductById(String id) throws SQLException{
			return daoImpl.deleteProductById(id);
		}

}
