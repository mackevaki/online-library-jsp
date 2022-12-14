package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Author;
import beans.AuthorList;
import testconnection.TestConnection;
import beans.Genre;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/pages/../WEB-INF/jspf/left_menu.jspf");
    _jspx_dependants.add("/pages/../WEB-INF/jspf/letters.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>???????????? ????????????????????</title>\n");
      out.write("        <link href=\"../css/lib_style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
            
            String searchString = "";

            if (request.getParameter("search_string") != null) {
                searchString = request.getParameter("search_string");
                session.setAttribute("search_string", searchString);
            } else if (session.getAttribute("search_string") != null) {
                searchString = session.getAttribute("search_string").toString();
            } else {
                session.setAttribute("search_string", searchString);
            }
            
            if (request.getParameter("username") != null) {
                session.setAttribute("username", request.getParameter("username"));
            }

      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"../images/logo.png\" alt=\"??????????????\" name=\"logo\" width=\"100\" height=\"100\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h3>???????????? ???????????????????? <br/> ?????? ?????????? - ?? ?????????????????????? ????????!</h3>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"welcome\">\n");
      out.write("                    <h5>?????????? ????????????????????, ");
      out.print(session.getAttribute("username"));
      out.write(" !</h5>\n");
      out.write("                    <h6><a href=\"../index.jsp\">??????????</a></h6>\n");
      out.write("                </div>            \n");
      out.write("                    <form class=\"search_form\" name=\"search_form\" method=\"GET\" action=\"books.jsp\">\n");
      out.write("                    <!--<img alt=\"??????????\" src=\"../images/search.jpg\">--> \n");
      out.write("                    <input type=\"text\" name=\"search_string\" value=\"");
      out.print(searchString);
      out.write("\"  size=\"100\"/>\n");
      out.write("                    <input class=\"search_button\" type=\"submit\" value=\"??????????\" name=\"search_button\" />\n");
      out.write("                    <select name=\"search_option\">\n");
      out.write("                        <option>????????????????</option>\n");
      out.write("                        <option>??????????</option>\n");
      out.write("                    </select>\n");
      out.write("                </form>                \n");
      out.write("            </div>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"sidebar1\">\n");
      out.write("    <h4>??????????:</h4>\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("        ");
      beans.GenreList genreList = null;
      synchronized (application) {
        genreList = (beans.GenreList) _jspx_page_context.getAttribute("genreList", PageContext.APPLICATION_SCOPE);
        if (genreList == null){
          genreList = new beans.GenreList();
          _jspx_page_context.setAttribute("genreList", genreList, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            long selectedGenreId = 0;

            if (request.getParameter("genre_id") != null) {
                selectedGenreId = Long.valueOf(request.getParameter("genre_id"));
            } else if (session.getAttribute("genre_id") != null) {
                selectedGenreId = Long.valueOf(session.getAttribute("genreId").toString());
            }
            
            session.setAttribute("genreId", selectedGenreId);
        
      out.write("\n");
      out.write("\n");
      out.write("        <li><a href=\"books.jsp?genre_id=0\">?????? ??????????</a></li>\n");
      out.write("        \n");
      out.write("        ");

            for (Genre genre : genreList.getGenres()) {
                if (selectedGenreId != 0 && selectedGenreId == genre.getId()) {
        
      out.write("\n");
      out.write("        <li><a style=\"color:darkcyan;\" href=\"books.jsp?genre_id=");
      out.print(genre.getId());
      out.write("&name=");
      out.print(genre.getName());
      out.write('"');
      out.write('>');
      out.print(genre.getName());
      out.write("</a></li>\n");
              } else {                   
        
      out.write("\n");
      out.write("        <li><a href=\"books.jsp?genre_id=");
      out.print(genre.getId());
      out.write('"');
      out.write('>');
      out.print(genre.getName());
      out.write("</a></li>\n");
      out.write("        ");
      }
            }
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      beans.LetterList letterList = null;
      synchronized (application) {
        letterList = (beans.LetterList) _jspx_page_context.getAttribute("letterList", PageContext.APPLICATION_SCOPE);
        if (letterList == null){
          letterList = new beans.LetterList();
          _jspx_page_context.setAttribute("letterList", letterList, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write(" \n");
      out.write("\n");
      out.write("<div class=\"letters\">\n");
      out.write("    ");
 
        String searchLetter = null;
        
        if (request.getParameter("letter") != null) {
            searchLetter = request.getParameter("letter");
            session.setAttribute("letter", searchLetter);
        } else if (session.getAttribute("letter") != null) {
            searchLetter = session.getAttribute("letter").toString();
        }    
        
    char[] letters = letterList.getRussianLetters();
    for (int i = 0; i < letters.length; i++) {
        if (searchLetter != null && searchLetter.toString().toUpperCase().charAt(0) == letters[i]) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <a style=\"color:darkcyan;\" href=\"books.jsp?letter=");
      out.print(letters[i]);
      out.write('"');
      out.write('>');
      out.print(letters[i]);
      out.write("</a>\n");
      out.write("    ");

        } else {
    
      out.write("\n");
      out.write("    <a  href=\"books.jsp?letter=");
      out.print(letters[i]);
      out.write('"');
      out.write('>');
      out.print(letters[i]);
      out.write("</a>\n");
      out.write("    ");

            }
    }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"float:left; margin-top: 20px;\">\n");
      out.write("<h3>???????????????? ???????????? ?????? ?????????????????????? ?????????? ??????????</h3>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("                    ");
      out.write('\n');
      out.write("\n");
      out.write("\n");
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
