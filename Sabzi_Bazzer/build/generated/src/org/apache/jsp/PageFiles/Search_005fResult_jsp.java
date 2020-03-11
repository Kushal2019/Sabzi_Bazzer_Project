package org.apache.jsp.PageFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_005fResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two equal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("/* Style the buttons */\n");
      out.write(".btn {\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn.active {\n");
      out.write("  background-color: #666;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"btnContainer\">\n");
      out.write("  <button class=\"btn\" onclick=\"listView()\"><i class=\"fa fa-bars\"></i> List</button> \n");
      out.write("  <button class=\"btn active\" onclick=\"gridView()\"><i class=\"fa fa-th-large\"></i> Grid</button>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Column 1</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Column 2</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#ccc;\">\n");
      out.write("    <h2>Column 3</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#ddd;\">\n");
      out.write("    <h2>Column 4</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the elements with class=\"column\"\n");
      out.write("var elements = document.getElementsByClassName(\"column\");\n");
      out.write("\n");
      out.write("// Declare a loop variable\n");
      out.write("var i;\n");
      out.write("\n");
      out.write("// List View\n");
      out.write("function listView() {\n");
      out.write("  for (i = 0; i < elements.length; i++) {\n");
      out.write("    elements[i].style.width = \"100%\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Grid View\n");
      out.write("function gridView() {\n");
      out.write("  for (i = 0; i < elements.length; i++) {\n");
      out.write("    elements[i].style.width = \"50%\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Optional: Add active class to the current button (highlight it) */\n");
      out.write("var container = document.getElementById(\"btnContainer\");\n");
      out.write("var btns = container.getElementsByClassName(\"btn\");\n");
      out.write("for (var i = 0; i < btns.length; i++) {\n");
      out.write("  btns[i].addEventListener(\"click\", function() {\n");
      out.write("    var current = document.getElementsByClassName(\"active\");\n");
      out.write("    current[0].className = current[0].className.replace(\" active\", \"\");\n");
      out.write("    this.className += \" active\";\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
