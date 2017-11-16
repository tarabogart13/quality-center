package de.logicline.splash.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/** 
 * Cross Origin Resource Sharing (CORS Filter) stuff for AJAX Calls
 * 
 * Servlet Filter
 */
public class ApiOriginFilter implements Filter {
 
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		
		chain.doFilter(request, response);

		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		res.addHeader("Access-Control-Allow-Headers", "Content-Type, token");
	}
 
	public void init(FilterConfig filterConfig) throws ServletException { }
 
	public void destroy() { }
 
}
