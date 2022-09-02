package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Онлайн библиотека</title>\n");
      out.write("    <link href=\"css/main_style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
if (request.getParameter("session") !=null && request.getParameter("session").equals("0")) {
            session.invalidate();
            request.getSession(true);
        } 
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p class=\"title\"><img src=\"images/lib.png\" width=\"320\" height=\"217\" alt=\"lib\"/>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"title\">Онлайн библиотека</p>\n");
      out.write("                <p class=\"text\">Добро пожаловать в онлайн библиотеку, где вы сможете найти любую книгу на ваш вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>\n");
      out.write("                <p class=\"text\">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>\n");
      out.write("                <p class=\"text\">По всем вопросам обращайтесь по адресу <a href=\"mailto:support@testlibrary.com\">support@testlibrary.com</a></p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login_div\">\n");
      out.write("                <p class=\"title\">Для входа введите свои данные:</p>                \n");
      out.write("                <form name=\"username\" action=\"pages/main.jsp\" method=\"POST\">\n");
      out.write("                    Имя: <input type=\"text\" name=\"username\" value=\"\" size=\"20\" />\n");
      out.write("                    <input type=\"submit\" value=\"Войти\" />\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                Юлия Семенова, 2022\n");
      out.write("            </div>\n");
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
