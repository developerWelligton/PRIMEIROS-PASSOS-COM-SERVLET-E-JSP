package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularSalario
 */
@WebServlet("/CalcularSalario")
public class CalcularSalario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularSalario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome"); 
		float salario =Float.parseFloat(request.getParameter("salario"));
		float percentual =Float.parseFloat(request.getParameter("percentual"));
		float novo_salario = salario + salario*percentual/100;
		
		PrintWriter out = response.getWriter();
	 	out.println("<!DOCTYPE html>");
	 		out.println("<head>");
	 			out.println("<title>Servlet calcular salario</title>");
	 				out.println("<h1> Nome do funcionario.....:" +nome+ "</h1>"); 
	 				out.println("<h1> Salario do funcionario.....:" +salario+ "</h1>"); 
	 				out.println("<h1> Percentual do aumento.....:" +percentual+ "</h1>");
	 				out.println("<h1> Novo Salario.....:" +novo_salario+ "</h1>");
	 		out.println("</head>");
	 	out.println("</html>");
	}

 

}
