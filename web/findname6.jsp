<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%
String n=request.getParameter("val");
if(n.length()>0){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
PreparedStatement ps=con.prepareStatement("select email from register where email='"+n+"'");
ResultSet rs=ps.executeQuery();
if(rs.next()){
    out.print("<font style='color:green'>Your email is match</font>");

}
else
{
out.print("<font style='color:red'>Your email is not match</font>");
}
con.close();
}catch(Exception e){e.printStackTrace();}
}//end of if
%>