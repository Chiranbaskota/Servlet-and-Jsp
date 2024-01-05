package com.telusko;

import jakarta.servlet.Filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


@WebFilter("/addAlien")
public class IdFilter extends HttpFilter implements Filter {
       

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int aid= Integer.parseInt(request.getParameter("aid"));
		String aname= request.getParameter("aname");
		
		if(aname.length()>=3) {
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Invalid Input");
		}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
