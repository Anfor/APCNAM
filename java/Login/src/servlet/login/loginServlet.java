package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private HashMap<String, String> loginPassword = new HashMap<>();
	
	private boolean mal;
	
	public void init(){
		
	    this.loginPassword.put("angel", "12345");
		this.loginPassword.put("rocio", "123456");
		this.loginPassword.put("alvaro", "1234567");
		this.loginPassword.put("alberto", "12345678");
		
		
		
	}
	
	

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
	

	    PrintWriter out = response.getWriter();

	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\" />");
	    out.println("<title>Connection</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form method=\"post\" action=\"http://localhost:8080/Login/login\">");
	    out.println("<fieldset>");
	    out.println("<legend>Bienvenue</legend>");
	   /* if (mal) {
			out.println("<p><strong>Erreur Identifiant ou MDP incorrécte </strong></p>");
		}*/
	    
	    out.println("<p>Entrez votre login et votre mot de passe pour acceder a votre espace prive</p>");
	    out.println(" <label for=\"loginClient\">Login<span class=\"requis\">*</span></label>");
	    out.println("<input type=\"text\" id=\"loginClient\" name=\"loginClient\" value=\"\" size=\"20\" maxlength=\"20\" /><br/>");
	    out.println("<br />");
	    out.println("<label for=\"Mdp\">mot de passe <span class=\"requis\">*</span></label>");
	    out.println("<input type=\"password\" id=\"Mdp\" name=\"Mdp\" value=\"\" size=\"20\" maxlength=\"20\" />");
	    out.println("<br/>");
	    out.println("</fieldset><br/>");
	    out.println("<input type=\"submit\" value=\"Valider\"/>");
	    out.println("<input type=\"reset\" value=\"Remettre a zero\" /> <br />");
	    out.println("</form");
	    if(request.getAttribute("mensaje")!=null)out.println("<p><strong>"+request.getAttribute("mensaje")+"</strong></p>");
	    out.println("</body>");
	    out.println("</html>");
	

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		
		String user = request.getParameter("loginClient");
		System.out.println("usuario "+user);
		String password = request.getParameter("Mdp");
		System.out.println("contra "+password);
							
		String mdp = (String)loginPassword.get(user);
		
	
			
		if(loginPassword.containsKey(user)){
			if (password.equals(mdp)) {
				System.out.println("comparacion correcta");
				    RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			    rd.forward(request, response); // otra forma de hacer el envio
			    
			   /* request.getRequestDispatcher("/welcome").forward(request, response);*/
			}
						
				
			 else {
				String error = "Le MDP est incorrecte";
				request.setAttribute("mensaje", error);
				
					//System.out.println("contra  incorrecta");
				mal=true;
				
				doGet(request, response);
	
			}
			
			
		}
		else {
			String error = "Le identifiant est incorrecte";
			request.setAttribute("mensaje", error);
			
				//System.out.println("identificacion incorrecta");
			mal=true;
			
			doGet(request, response);
			
		}

	}}
