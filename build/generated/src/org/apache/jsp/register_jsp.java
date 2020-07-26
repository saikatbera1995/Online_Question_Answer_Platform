package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>Registration Form</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<script>\r\n");
      out.write("var request;\r\n");
      out.write("function sendInfo()\r\n");
      out.write("{\r\n");
      out.write("var v=document.myform.username.value;\r\n");
      out.write("var url=\"findname.jsp?val=\"+v;\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=getInfo;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getInfo(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('location').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head><body>\r\n");
      out.write("  \r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("\t<div class=\"main_content\">\r\n");
      out.write("    \t<div id=\"header\">\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top_center_box\"></div>\r\n");
      out.write("        <div class=\"center_box\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            <div id=\"menu_tab\">                                     \r\n");
      out.write("                    <ul class=\"menu\">                                                                              \r\n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         \r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li> \r\n");
      out.write("\t\t\t\t\t\t <li class=\"divider\"></li>\r\n");
      out.write("<li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\r\n");
      out.write("<li class=\"divider\"></li>\r\n");
      out.write(" <li><a href=\"register.jsp\" class=\"nav\">Registration</a></li>\r\n");
      out.write("                         \t   \r\n");
      out.write("                         \t \r\n");
      out.write("                    </ul>\r\n");
      out.write("            </div> \r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"middle_box\">\r\n");
      out.write("            \t<div class=\"middle_box_text_content\">\r\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\r\n");
      out.write("                    <p class=\"middle_text\">\r\n");
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"left_content\">\r\n");
      out.write("            \r\n");
      out.write("            \t<div class=\"calendar_box\">\r\n");
      out.write("            \t\r\n");
      out.write("                \t<div class=\"calendar_box_content1\">\r\n");
      out.write("                \t\r\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\r\n");
      out.write("                \t\t   <p><div id=\"location\"></div>\r\n");
      out.write("                \t\t<form method=\"post\" action=\"registerprocess.jsp\" name=\"myform\" >\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td style=\"color:navy;\"><B>Registration</B></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>User Name:</td><td><input type=\"text\" name=\"username\" onkeyup=\"sendInfo()\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td>Password:</td><td><input type=\"password\" name=\"userpass\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Category:</td><td><select name=\"category\">\r\n");
      out.write("\t\t\t\t\t<option>Select a Category</option>\r\n");
      out.write("\t\t\t\t\t<option>Male</option>\r\n");
      out.write("\t\t\t\t\t<option>Female</option>\r\n");
      out.write("                                        <option>Others</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Email:</td><td><input type=\"text\" name=\"email\"/></td></tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td>      </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"Register\"></td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("                     </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("             <div class=\"news_left\">\r\n");
      out.write("                \r\n");
      out.write("                \t<div class=\"news_box\">\r\n");
      out.write("                    \t\r\n");
      out.write("                    <br>\r\n");
      out.write("                \t\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            <!--end of left content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"right_content\">\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("            \r\n");
      out.write("            </div><!--end of right content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div> <!--end of center box-->\r\n");
      out.write("\t</div> <!--end of main content-->\r\n");
      out.write("</div> <!--end of main container-->\r\n");
      out.write("</body></html>");
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
