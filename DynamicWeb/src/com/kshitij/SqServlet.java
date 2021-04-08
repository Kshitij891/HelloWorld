package com.kshitij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException // method name should be service compulsory
	  {                                                                                       //doPost method dont show data in url
		  
		int x=(int) req.getAttribute("num");
		/*  int x=Integer.parseInt(req.getParameter("k");  */
		x=x*x;
		PrintWriter out=res.getWriter();  // Below 2 steps print on webpage
		out.println("Square of added number is" +x);
		
		
	  }
}
