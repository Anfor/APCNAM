package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	    PrintWriter out = response.getWriter();

	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\" />");
	    out.println("<title>Welcome</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form method=\"post\" action=\"http://localhost:8080/Login/welcome\">");
	    
	    out.println("<p>Bienvenue sur votre site</p>");
	   
	    out.println("</body>");
	    out.println("</html>");
		
	}
	

	

}
