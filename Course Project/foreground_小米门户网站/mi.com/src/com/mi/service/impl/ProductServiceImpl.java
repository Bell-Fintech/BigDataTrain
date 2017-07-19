package com.mi.service.impl;

import java.util.List;

import com.mi.dao.impl.ProductDaoImpl;
import com.mi.domain.Product;

public class ProductServiceImpl {
    private ProductDaoImpl dao = new ProductDaoImpl(); 
	
	public List<Product> findAllProduct() {
		return dao.findAllProduct();
	}

	public List<Product> findAllProductByLocation(String location) {
		return dao.findAllProductByLocation(location);
	}
	
	public void addProduct(Product product) {
         dao.addProduct(product);
	}

	
	public void editProduct(Product product , boolean flag) {
		dao.updateProduct(product,flag);
	}

	
	public Product findProductById(int pid) {
		return dao.findProductById(pid);
	}

	
	public void delProduct(int pid) {
		dao.deleteProduct(pid);
	}


	public List<Product> findALL(int currentPage, int pageSize) {
		return dao.findALL(currentPage, pageSize);
	}

	
	
}
