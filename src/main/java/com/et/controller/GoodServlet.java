package com.et.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.et.entity.Good;
import com.et.service.GoodService;


public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GoodServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//获取容器在取service
		GoodService gs=(GoodService)ac.getBean("goodServiceImpl");
		String myName=request.getParameter("myName");
		request.setAttribute("myName", myName);
		List<Good> list=gs.queryGoodByName(myName);
		request.setAttribute("goodsList", list);
	
		request.getRequestDispatcher("/good.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
