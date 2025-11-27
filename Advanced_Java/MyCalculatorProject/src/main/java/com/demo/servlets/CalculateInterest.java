package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateInterest extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		double principal = Double.parseDouble(req.getParameter("principal"));
		Float rate = Float.parseFloat(req.getParameter("rate"));
		int years = Integer.parseInt(req.getParameter("years"));
		double ans = (principal*rate*years)/100;
		out.println("<h3>Interest : " +ans+"<h3/>");
	}

}
