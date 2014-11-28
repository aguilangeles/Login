package myservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.PersonaDao;
import entidad.Persona;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("surname");
		String domicilio = request.getParameter("address");
		String edad = request.getParameter("age"); 
		if (!nombre.isEmpty() && !apellido.isEmpty() && !domicilio.isEmpty() && !edad.isEmpty()){
			int eda= Integer.parseInt(edad);
			Persona persona = new Persona(nombre, apellido, domicilio, eda);
			
			response.sendRedirect("Home.jsp");
		}else{
			response.sendRedirect("Error.jsp");
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
