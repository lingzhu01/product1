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
		//��������service��
		List<Product> list=null;
		ProductService productService=new ProductService();
		try {
			 list=productService.findAllProduct();
			 //����ȡ�����������ó�list����
			 request.setAttribute("list", list);
			//����ȡ������ת����jspҳ�������ʾ
			 request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
