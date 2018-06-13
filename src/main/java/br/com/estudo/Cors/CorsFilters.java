package br.com.estudo.Cors;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CorsFilters implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	//CORS //
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Methods", "POST, PUT, DELETE, GET, PATCH, OPTIONS");
		res.setHeader("Access-Control-Allow-Headers", "X-PINGOTHER,Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
        res.addHeader("Access-Control-Expose-Headers", "xsrf-token");
        res.addHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("Access-Control-Max-Age", "3600");
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {}

}
