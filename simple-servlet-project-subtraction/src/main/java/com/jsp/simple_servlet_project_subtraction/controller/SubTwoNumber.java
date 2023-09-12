package com.jsp.simple_servlet_project_subtraction.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SubTwoNumber implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printWriter =res.getWriter();
		
		printWriter.write("<html><body>");
		
		
		int num_1=Integer.parseInt(req.getParameter("num1"));
		int num_2=Integer.parseInt(req.getParameter("num2"));
		
		System.out.println(num_1-num_2);
		printWriter.write("<p>the subtraction of "+num_1+" and "+num_2+" = "+(num_1-num_2)+"</p>");
		
		printWriter.write("</html></body>");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
