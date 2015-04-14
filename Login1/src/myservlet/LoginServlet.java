package myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.PersonaDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       private PersonaDao pd = PersonaDao.getInstance();
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
			// username.equals.("unvalor") --> null pointer exception X
			// "unvalor".equals.(username) --> booleano V
			if ("admin".equals(username) && "admin".equals(password)) {
				request.setAttribute("personasResult", pd.getPersonas() );
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			
			} else {
				response.sendRedirect("Error.jsp");
			}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// si llega a llegar por post, no importa,
		// realiza la misma acción
		doGet(request, response);
	}

}
