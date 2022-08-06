package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update Record</title>\n");
      out.write("                <style>\n");
      out.write("             .new {\n");
      out.write("  text-align: center;   \n");
      out.write("  margin: auto;\n");
      out.write("  width: 50%;\n");
      out.write("  border: 3px solid green;\n");
      out.write("  padding: 10px;}\n");
      out.write("        </style>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Update\" method=\"Get\">\n");
      out.write("        <div class=\"new\">\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td><center><h1>Update Record</h1></center></td></tr>\n");
      out.write("                <tr><td><br/><br/></td></tr> \n");
      out.write("                <tr><td>Student PRN: <input type=\"text\" name=\"prnno\" class=\"val\" placeholder=\"Enter Prn no.\"></td></tr>\n");
      out.write("                <tr><td><br/><br/></td></tr>\n");
      out.write("                <tr><td>\n");
      out.write("                           Choose to Update : \n");
      out.write("                           <select name=\"field\">\n");
      out.write("                                    <option value=\"name\">Name</option> \n");
      out.write("                                    <option value=\"email\">E-mail</option> \n");
      out.write("                                    <option value=\"gender\">Gender</option> \n");
      out.write("                                    <option value=\"dob\">Date Of Birth</option> \n");
      out.write("                                    <option value=\"phnum\">Phone Number</option> \n");
      out.write("                           </select>\n");
      out.write("                </td></tr>\n");
      out.write("                <tr><td><br/><br/></td></tr>\n");
      out.write("                <tr><td>Enter Value: <input type=\"text\" name=\"val\" class=\"val\" placeholder=\"Enter Value\"></td></tr>\n");
      out.write("                <tr><td><br/><br/></td></tr>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"option\" value=\"Update\"></td> </tr>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"option\" value=\"Back to CRUD operation\"></td></tr>\n");
      out.write("                <tr><td><br/><br/></td></tr>\n");
      out.write("                <tr><td><span style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td></tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
