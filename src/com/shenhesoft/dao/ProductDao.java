package com.shenhesoft.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.shenhesoft.domain.Product;
import com.shenhesoft.utils.DataSourceUtils;

/**
 * 数据库处理
 * 
 * @Date 2018-10-30
 * @author zhu
 * @version 1.0
 * 
 *
 */
public class ProductDao {

	public List<Product> findProduct() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product";
		List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));
		return list;
	}

}
