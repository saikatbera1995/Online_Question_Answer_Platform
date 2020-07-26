package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n");
      out.write("<title>Registration Form</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("<script>\n");
      out.write("var request;\n");
      out.write("function sendInfoEmail1()\n");
      out.write("{\n");
      out.write("var v=document.myform.email.value;\n");
      out.write("var url=\"findname6.jsp?val=\"+v;\n");
      out.write("if(window.XMLHttpRequest){\n");
      out.write("request=new XMLHttpRequest();\n");
      out.write("}\n");
      out.write("else if(window.ActiveXObject){\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("}\n");
      out.write("try\n");
      out.write("{\n");
      out.write("request.onreadystatechange=getInfo;\n");
      out.write("request.open(\"GET\",url,true);\n");
      out.write("request.send();\n");
      out.write("}\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getInfoEmail1(){\n");
      out.write("if(request.readyState==4){\n");
      out.write("var val=request.responseText;\n");
      out.write("document.getElementById('location').innerHTML=val;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head><body>\n");
      out.write("  \n");
      out.write("<div id=\"main_container\">\n");
      out.write("\t<div class=\"main_content\">\n");
      out.write("    \t<div id=\"header\">\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("        <div class=\"top_center_box\"></div>\n");
      out.write("        <div class=\"center_box\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("            <div id=\"menu_tab\">                                     \n");
      out.write("                    <ul class=\"menu\">                                                                              \n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         \n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li> \n");
      out.write("\t\t\t\t\t\t <li class=\"divider\"></li>\n");
      out.write("<li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\n");
      out.write("<li class=\"divider\"></li>\n");
      out.write(" <li><a href=\"register.jsp\" class=\"nav\">Registration</a></li>\n");
      out.write("                         \t   \n");
      out.write("                         \t \n");
      out.write("                    </ul>\n");
      out.write("            </div> \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <div class=\"middle_box\">\n");
      out.write("            \t<div class=\"middle_box_text_content\">\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\n");
      out.write("                    <p class=\"middle_text\">\n");
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"left_content\">\n");
      out.write("            \n");
      out.write("            \t<div class=\"calendar_box\">\n");
      out.write("            \t\n");
      out.write("                \t<div class=\"calendar_box_content1\">\n");
      out.write("                \t\n");
      out.write("                \t\t\n");
      out.write("                \t\t   <p><div id=\"location\"></div>\n");
      out.write("                \t\t<div class=\"changepassword\">\n");
      out.write("                                   <h1 style=\"color:#990000\">Forgot Password?</h1>\n");
      out.write("                <form action=\"g1\" name=\"myform\" method=\"post\" >\n");
      out.write("                    <h4 style=\"color:#0066FF\">Submit Username and Password</h4>\n");
      out.write("                    <table>\n");
      out.write("                        <tr><td>Enter Your Email:</td><td><input type=\"email\" name=\"email\" onkeyup=\"sendInfoEmail1()\"/></td></tr>\n");
      out.write("                        \n");
      out.write("                        <tr><td></td><td><input type=\"submit\" value=\"click\" /></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                \t</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("             <div class=\"news_left\">\n");
      out.write("                \n");
      out.write("                \t<div class=\"news_box\">\n");
      out.write("                    \t\n");
      out.write("                    <br>\n");
      out.write("                \t\n");
      out.write("                    </div>                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <!--end of left content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right_content\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                            \n");
      out.write("                \n");
      out.write("            \n");
      out.write("         \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("            </div><!--end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div> <!--end of center box-->\n");
      out.write("\t</div> <!--end of main content-->\n");
      out.write("</div> <!--end of main container-->\n");
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
