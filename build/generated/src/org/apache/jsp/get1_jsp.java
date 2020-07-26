package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.sun.org.apache.bcel.internal.generic.Select;

public final class get1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static int count1=0; 
 static int total=0; 
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

if(session.getAttribute("count")!=null){
String name=(String)session.getAttribute("quizname");
String ans= (String)session.getAttribute("ans");
Integer count=(Integer)session.getAttribute("count");
try{
if(count1==0)
{
count1=count-1;

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
PreparedStatement ps=con.prepareStatement("select answer from quizques where quizname='"+name+"' and qid='"+count1+"' ");
ResultSet rs=ps.executeQuery();
if(rs.next()){
String ans1=rs.getString(1);
System.out.println("ans1 on c10="+ans1);
System.out.println("ans on get1="+ans);
if(ans1.equals(ans)){
total=total+1;
System.out.println("total="+total);
}

}

con.close();
}



else{
count1=count-2;
System.out.print("count at get1:"+count);

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
PreparedStatement ps=con.prepareStatement("select answer from quizques where quizname='"+name+"' and qid='"+count1+"' ");
ResultSet rs=ps.executeQuery();
if(rs.next()){
String ans1=rs.getString(1);
System.out.println("ans1="+ans1);
System.out.println("ans on get1="+ans);
if(ans1.equals(ans)){
total=total+1;
System.out.println("total="+total);

}

}
con.close();
}
if(count>(Integer)session.getAttribute("max"))
{
Integer max=(Integer)session.getAttribute("max");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
PreparedStatement ps=con.prepareStatement("select answer from quizques where quizname='"+name+"' and qid='"+max+"' ");
ResultSet rs=ps.executeQuery();
if(rs.next()){
String ans1=rs.getString(1);
System.out.println("ans1 on c1="+ans1);
String ans2=(String) session.getAttribute("ans");
System.out.println("ans on get1="+ans2);
if(ans1.equals(ans2)){
total=total+1;
System.out.println("total="+total);
}

}

con.close();
request.setAttribute("total",total);
total=0;

      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("result.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
 

 
}

}catch(Exception e){e.printStackTrace();}

}

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("get.jsp");
        return;
      }
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
