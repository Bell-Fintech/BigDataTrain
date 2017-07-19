package com.mi.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mi.Exception.DaoException;
import com.mi.domain.Product;
import com.mi.util.DBCPUtil;

public class ProductDaoImpl{
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	
	public List<Product> findAllProduct() {
		try {
			String sql = "select * from product";
			return qr.query(sql,new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	public List<Product> findAllProductByLocation(String location) {
		try {
			String sql = "select * from product where location = '" + location + "'";
			return qr.query(sql,new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	
	public void addProduct(Product product) {
		try {
        String sql="insert into product(pid,name,note,price,pamount,photo,type)values(?,?,?,?,?,?,?)";
	    Object params[] = {product.getPid(),product.getName(),product.getNote(),product.getPrice(),product.getPamount(),product.getPhoto(),product.getType()};
		qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e);
		}
	}
	
	public Product findProductById(int pid) {
		try {
			return qr.query("select * from Product where pid=?", new BeanHandler<Product>(Product.class), pid);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


	public void updateProduct(Product product ,boolean flag) {
		if(flag == true){
			try {
		        String sql="update product set name=?,note=?,price=?,pamount=?,photo=?,type=? where pid=?";
			    Object params[] = {product.getName(),product.getNote(),product.getPrice(),product.getPamount(),product.getPhoto(),product.getType(),product.getPid()};
				qr.update(sql,params);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new DaoException(e);
				}
		}else{
			try {
		        String sql="update product set name=?,note=?,price=?,pamount=?,type=? where pid=?";
			    Object params[] = {product.getName(),product.getNote(),product.getPrice(),product.getPamount(),product.getType(),product.getPid()};
				qr.update(sql,params);
				} catch (SQLException e) {
					throw new DaoException(e);
				}
		}
	}

	
	public void deleteProduct(int pid) {
		try {
			String sql = "delete from product where pid=?";
			qr.update(sql,pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e);
		}
	}
//分页显示
	
	public List<Product> findALL(int currentPage, int pageSize) {
		List<Product> ProductList=new ArrayList<Product>();
		ProductList=this.findAllProduct();
		int listLength=ProductList.size();
		int startIndex=(currentPage-1)*pageSize;
		int endIndex=startIndex+pageSize;
		
		if(endIndex>=listLength)
			endIndex=listLength;
		ProductList=ProductList.subList(startIndex, endIndex);//返回一个子集合从startIndex到endIndex
		return ProductList;
	}

}
