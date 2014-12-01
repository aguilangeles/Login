package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import sun.swing.AccumulativeRunnable;

import dao.impl.PersonaDao;
import entidad.Persona;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       private PersonaDao pd = new PersonaDao();
       private Persona p = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if (username.equals("admin") && password.equals("admin")) {
				
				request.setAttribute("username", username);
				request.setAttribute("personadao", pd );
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			
			} else {
				response.sendRedirect("Error.jsp");
			}
			if(p!=null){
				doPost(request, response);
			}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String nombre = request.getParameter("name"); 
//		String apellido = request.getParameter("surname");
//		String domicilio = request.getParameter("address");
//		String edad = request.getParameter("age");
//		int age = Integer.parseInt(edad);
		p = new Persona("nombre", "apellido", "domicilio",0);
//		p = (Persona) request.getSession().getAttribute("pna");
		pd.insertarPersona(p);
		request.setAttribute("personadao", pd );
		request.getRequestDispatcher("Home.jsp").forward(request, response);

	}

}
