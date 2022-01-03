package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Formulario() {
        super();
        
    } 
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome"); 
		String idade = request.getParameter("idade"); 
		PrintWriter out = response.getWriter();
	 	out.println("<!DOCTYPE html>");
	 		out.println("<head>");
	 			out.println("<title>Primeiro Servlet</title>");
	 				out.println("<h1> Ola " + nome+", seja bem vindo a programação web em java com Sevlets</h1>"); 
	 				out.println("<h1> Sua idade é " + idade+"</h1>"); 
	 		out.println("</head>");
	 	out.println("</html>");
	 
	}

}
