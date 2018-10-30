package com.shenhesoft.service;

import java.sql.SQLException;
import java.util.List;

import com.shenhesoft.dao.ProductDao;
import com.shenhesoft.domain.Product;

public class ProductService {
	/*
	 * ´«µÝÇëÇóµ½dao²ã
	 */
	public List<Product> findAllProduct() throws SQLException {
		ProductDao productDao = new ProductDao();
		List<Product> list = productDao.findProduct();
		return list;

	}

}
