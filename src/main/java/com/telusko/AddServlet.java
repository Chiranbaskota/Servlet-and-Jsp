package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		  int i=Integer.parseInt(req.getParameter("first_num")); 
		  int j=Integer.parseInt(req.getParameter("second_num")); 
		  int k=i+j;
		  
		  // req.setAttribute("k", k);
		  
		  // HttpSession session = req.getSession(); // session.setAttribute("k", k);
		  
		  
		  Cookie cookie =new Cookie("k", k + ""); 
		  res.addCookie(cookie);
		  
		  res.sendRedirect("sq");
		  
		  
		  
		  
		  
		 // RequestDispatcher rd= req.getRequestDispatcher("sq");
		//  rd.forward(req, res);
		 
		/*
		 * PrintWriter out = res.getWriter(); out.println("Hi "); ServletContext ctx =
		 * getServletContext(); String str = ctx.getInitParameter("phone");
		 * out.println(str);
		 * 
		 * ServletConfig ptx = getServletConfig(); String prt =
		 * ptx.getInitParameter("name"); out.println(prt);
		 */

	}

}
