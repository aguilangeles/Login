package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import entidad.Persona;
import dao.impl.PersonaDao;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//Dth HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dth\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Potencial tabla</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <br/><br/><br/><br/><br/>\n");
      out.write("        <center>\n");
      out.write("            <h2>\n");
      out.write("           ");

            String a=(String)session.getAttribute("username");
            out.println("Hello  "+a);
            PersonaDao personadao = (PersonaDao)request.getAttribute("personadao");
			List<Persona> personas = personadao.getPersonas();
            
      out.write("\n");
      out.write("            </h2>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t");

					out.println("<tr>"
							+"<th>nombre</th>"
							+"<th>apellido</th>"
							+"<th>domicilio</th>"
							+"<th>edad</th>"
							+"</tr>");
					for(Persona p : personas){
					out.println("<tr><td>"+p.getNombre()+"</td>");
					out.println("<td>"+p.getApellido()+"</td>");
					out.println("<td>"+p.getDomicilio()+"</td>");
					out.println("<td>"+p.getEdad()+"</td></tr>");
					}
					
					request.setAttribute("persona_dao", personadao);
					//request.getRequestDispatcher("Insert.jsp").forward(request,response);
					
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("            <br/>\n");
      out.write("             <br/><a href=\"Insert.jsp\"><input type=\"submit\" value=\"Insertar\"></a>\n");
      out.write("            <br/><br/><br/><br/><br/>\n");
      out.write("        <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("        </center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
