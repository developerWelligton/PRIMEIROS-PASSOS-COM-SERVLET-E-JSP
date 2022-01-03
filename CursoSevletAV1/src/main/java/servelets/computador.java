package servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/computador")
public class computador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public computador() {
        super();
      
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 float totalLitros = Float.parseFloat(request.getParameter("total"));
	 float precoLitros = Float.parseFloat(request.getParameter("preco")); 
	 float consumo = Float.parseFloat(request.getParameter("consumo"));  
	 
	 float valor = totalLitros/precoLitros;
	 float distancia = totalLitros * consumo;
	 
	 request.setAttribute("valor", valor);
	 request.setAttribute("distancia", distancia);
	 
	 request.getRequestDispatcher("ResComputador.jsp").forward(request, response);
	 
	}

}
