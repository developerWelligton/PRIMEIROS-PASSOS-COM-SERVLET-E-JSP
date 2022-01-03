package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/SegundoServlet")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public SegundoServlet() {
        super();
      
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	 	out.println("<!DOCTYPE html>");
	 		out.println("<head>");
	 			out.println("<title>Primeiro Servlet</title>");
	 				out.println("<h5>Nome do servlet...........:"+request.getContextPath()+"</h5>"); 
	 				out.println("<h5>Nome da Marquina local....:"+request.getLocalName()+"</h5>"); 
	 				out.println("<h5>Endereço da Maquina local...."+request.getLocalAddr()+"</h5>"); 
	 				out.println("<h5>Porta da Maquina local...."+request.getLocalPort()+"</h5>");
	 				out.println("<h5>Endereço do servidor...."+request.getRemoteHost()+"</h5>");
	 				out.println("<h5>Porta do servidor...."+request.getRemotePort()+"</h5>");
	 				out.println("<h5>Metodo de requisicao...."+request.getMethod()+"</h5>");
	 				out.println("<h5>Protoco utilizado......:"+request.getProtocol()+"</h5>");
	 				
	 		out.println("</head>");
	 	out.println("</html>");
	}
 

}
