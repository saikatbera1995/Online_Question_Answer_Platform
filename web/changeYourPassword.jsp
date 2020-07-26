
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
Statement st=con.createStatement();
String username2=request.getParameter("username");
String userpass2=request.getParameter("newpass");
PreparedStatement ps=con.prepareStatement("update register set userpass=? where username=? ");
                ps.setString(1,userpass2);
                ps.setString(2,username2);
                int i = ps.executeUpdate();
                
%>
<jsp:forward page="home.jsp"></jsp:forward>
<%
}
catch(Exception e)
{
e.printStackTrace();
}
%>

