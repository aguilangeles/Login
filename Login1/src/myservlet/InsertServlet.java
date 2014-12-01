package myservlet;

import java.io.IOException;
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
 		int age=0;
 		try {
 			 age = Integer.parseInt(edad);	
		} catch (Exception e) {

		}
 		Persona persona = new Persona(nombre, apellido, domicilio,age);
 		PersonaDao personaDao = PersonaDao.getInstance();
 		personaDao.insertarPersona(persona);
 		
 	 	request.setAttribute("personasResult", PersonaDao.getInstance().getPersonas() );
 		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
