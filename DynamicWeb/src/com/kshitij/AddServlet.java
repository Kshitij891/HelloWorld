package com.kshitij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException // method name should be service compulsory
, ServletException
  {                                                                                       //doPost method dont show data in url
	  int i=Integer.parseInt(req.getParameter("num1"));                                   //doGet method show data in url
      int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
      System.out.print(k);  // Print on console
	  PrintWriter out=res.getWriter();  // Below 2 steps print on webpage
	  res.getWriter().println(k);
	  
	  //----------------------------------------------------------------------------------------------------------------------------/
	  
	  //Calling other servlet from one servlet using Request Dispatcher
	  req.setAttribute("num",k);                               
	  RequestDispatcher rd=req.getRequestDispatcher("sq");      //While executing add servlet below 2 steps call SqServlet      
	  rd.forward(req, res);                                    // num=k passed from here to SqServlet
	                                                          //req & res are object
      
	  //Calling other servlet from one servlet using URL rewriting
	 /*  res.sendRedirect("sq?k="+k);    */                  // Tells client to go to SQ servlet and pass k value. In bracket is URL
  }                                                            
}
