package com.shenhesoft.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shenhesoft.domain.Product;
import com.shenhesoft.service.ProductService;

public class ProductListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//传递请求到service层
		List<Product> list=null;
		ProductService productService=new ProductService();
		try {
			 list=productService.findAllProduct();
			 //将获取到的数据设置成list属性
			 request.setAttribute("list", list);
			//将获取的数据转发给jsp页面进行显示
			 request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
