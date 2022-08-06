package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Delete Record</title>\n");
      out.write("                        <style>\n");
      out.write("             .new {\n");
      out.write("  text-align: center;   \n");
      out.write("  margin: auto;\n");
      out.write("  width: 50%;\n");
      out.write("  border: 3px solid green;\n");
      out.write("  padding: 10px;}\n");
      out.write("        </style>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"new\">\n");
      out.write("        <form action=\"delete\" method=\"get\">\n");
      out.write("            <h1>Delete Record</h1>    \n");
      out.write("        <div class=\"center\">\n");
      out.write("            <label for=\"PRN no.:\"><b>PRN no:<sup class=\"ast\">*</sup></b></label>\n");
      out.write("            <input type=\"text\" name=\"prn\" id=\"prn\" placeholder=\"Enter PRN no.\"> \n");
      out.write("        </div>\n");
      out.write("        <br> \n");
      out.write("        <div  class=\"center\">\n");
      out.write("                <input type=\"submit\" name=\"option\" value=\"Submit\"> \n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <div  class=\"center\">\n");
      out.write("                <input type=\"submit\" name=\"option\" value=\"Back to CRUD operation\"> \n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <span style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
