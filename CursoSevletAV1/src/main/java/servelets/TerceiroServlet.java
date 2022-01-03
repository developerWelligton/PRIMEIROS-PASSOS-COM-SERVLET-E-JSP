package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TerceiroServlet
 */
@WebServlet(name="TerceiroServlet",urlPatterns = {"/TerceiroServlet","/terceiroservlet","/saudacao"})
public class TerceiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public TerceiroServlet() {
        super();
 
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		
		PrintWriter out = response.getWriter();
	 	out.println("<!DOCTYPE html>");
	 		out.println("<head>");
	 			out.println("<title>Primeiro Servlet</title>");
	 				out.println("<h1> Ola " + nome+", seja bem vindo a programação web em java com Sevlets</h1>"); 
	 		out.println("</head>");
	 	out.println("</html>");
	} 

}
