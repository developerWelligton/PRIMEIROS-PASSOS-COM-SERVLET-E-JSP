package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/ServletVenda")
public class ServletVenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletVenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		float valor = Float.parseFloat(request.getParameter("valor"));
		int  quantidade = Integer.parseInt(request.getParameter("quantidade"));
		float valorTotal = valor * quantidade;
		String produto = request.getParameter("produto");
		
	 	out.println("<!DOCTYPE html>");
	 		out.println("<head>");
	 			out.println("<title>Servlet Venda</title>"); 
	 		out.println("</head>");
	 		out.println("<body>");
	 		out.println("<h1> Venda do produto "+produto+"</h1>");
	 		out.println("<h1> Total a pagar R$ "+valorTotal+"</h1>");
	 		
	 		out.println("</body>");
	 	out.println("</html>");
	}

}
