package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("var request;\r\n");
      out.write("function get1(){\r\n");
      out.write("window.location='get1.jsp';\r\n");
      out.write("}\r\n");
      out.write("function get(){\r\n");
      out.write("var v=document.getElementsByName('radio').value;\r\n");
      out.write("window.location=\"get.jsp?ans=\"+v;\r\n");
      out.write("}\r\n");
      out.write("function sendInfo()\r\n");
      out.write("{\r\n");
      out.write("var v=document.myform.subject.value;\r\n");
      out.write("var url=\"findname2.jsp?val=\"+v;\r\n");
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
      out.write("function viewAll(name)\r\n");
      out.write("{\r\n");
      out.write("var v=name;\r\n");
      out.write("var url=\"findname3.jsp?val=\"+v;\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=viewInfo;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function viewInfo(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('location').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"left_content\">\r\n");
      out.write("             ");
 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t");
 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");

					if(request.getAttribute("finished")!=null){
					   out.print("<font size='2' color='navy'>");
                   out.print("<B>");
					out.print(request.getAttribute("finished"));
					  out.print("<B>");
   						out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            \t<div class=\"calendar_box2\">\r\n");
      out.write("            \t\r\n");
      out.write("                \t<div class=\"calendar_box_content\">\r\n");
      out.write("               \r\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\r\n");
      out.write("                \t\t              \t\t<marquee direction=\"left\" style=\"color: navy;\" onmouseover=\"stop()\" onmouseout=\"start()\"><B>Assess Yourself by taking quizs on various sunject</B></marquee>\r\n");
      out.write("                \t\t   \r\n");
      out.write("                \t\t<form method=\"post\" action=\"get1.jsp\">\r\n");
      out.write("\t\t\t\t\t<table><tr><td>\r\n");
      out.write("\t\t\t\t\t");
 
					String question=(String)session.getAttribute("question");
					String option1= (String)session.getAttribute("option1");
					String option2= (String)session.getAttribute("option2");
					String option3= (String)session.getAttribute("option3");
					String option4= (String)session.getAttribute("option4");
					out.print(question);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");

                    if((String)request.getParameter("radio")!=null){
               			  String ans=(String)request.getParameter("radio");
  							System.out.println("ans on set"+ans);
               			  session.setAttribute("ans",ans);
                    	
                    } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input type=\"radio\" name=\"radio\" value=\"");
      out.print(option1);
      out.write("\" />");
      out.print(option1);
      out.write("</td></tr>\t\r\n");
      out.write("\t\t\t\t\t<tr><td><input type=\"radio\" name=\"radio\" value=\"");
      out.print(option2);
      out.write("\"/>");
      out.print(option2 );
      out.write("</td></tr>\t\r\n");
      out.write("\t\t\t\t\t<tr><td><input type=\"radio\" name=\"radio\" value=\"");
      out.print(option3);
      out.write("\"/>");
      out.print(option3 );
      out.write("</td></tr>\t\r\n");
      out.write("\t\t\t\t\t<tr><td><input type=\"radio\" name=\"radio\" value=\"");
      out.print(option4);
      out.write("\"/>");
      out.print(option4 );
      out.write("</td></tr>\t\t\t\r\n");
      out.write("                    \r\n");
      out.write("                    <tr><td></td><td><input type=\"submit\" value=\"Next\"/></td></tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                     </form>\r\n");
      out.write("                     \r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"news_left\">\r\n");
      out.write("                \r\n");
      out.write("                \t<div class=\"news_box\">\r\n");
      out.write("                    \t<div class=\"calendar\">1</div>\r\n");
      out.write("                        <div class=\"news_content\">\r\n");
      out.write("\t\t\t\t\t\t                     \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                \t<div class=\"news_box\">\r\n");
      out.write("                    \t<div class=\"calendar\">2</div>\r\n");
      out.write("                        <div class=\"news_content\">\r\n");
      out.write("\t\t\t\t\t\t                       \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                    \r\n");
      out.write("              \r\n");
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
      out.write("</body></html>\r\n");
      out.write("\r\n");
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
