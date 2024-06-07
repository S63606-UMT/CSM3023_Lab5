package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerTraining_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register IT Training</h1>\n");
      out.write("        <form action=\"processTraining.jsp\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Training Registration</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"IC_No\">IC No</label></td>\n");
      out.write("                        <td><input id=\"IC_No\" name=\"IC_No\" placeholder=\"E.g. 911210-05-1234\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"name\">Name</label></td>\n");
      out.write("                        <td><input id=\"name\" name=\"name\" placeholder=\"Enter your name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"name\">Type of Training</label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"training\" id=\"training\">\n");
      out.write("                                <option value=\"c++\">C++ Training</option>\n");
      out.write("                                <option value=\"java\">Java Training</option>\n");
      out.write("                                <option value=\"python\">Python Training</option>\n");
      out.write("                                <option value=\"rust\">Rust Training</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"noPax\">No of Pax</label></td>\n");
      out.write("                        <td><input id=\"noPax\" name=\"noPax\" placeholder=\"No of pax\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"student\">Student</label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" id=\"isStudent\" name=\"student\" value=\"yes\">\n");
      out.write("                            <label for=\"isStudent\">Yes</label>\n");
      out.write("                            <input type=\"radio\" id=\"notStudent\" name=\"student\" value=\"no\">\n");
      out.write("                            <label for=\"notStudent\">No</label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Submit\">\n");
      out.write("                            <input type=\"reset\" value=\"Cancel\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
