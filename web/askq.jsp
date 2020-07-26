<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>


<%

 try {
 
String name= request.getParameter("name");
String email= request.getParameter("email");
String phone= request.getParameter("phone");
String question= request.getParameter("question");
 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");

PreparedStatement ps=con.prepareStatement("insert into askquestions values(?,?,?,?,?)");
ps.setString(1,null);
ps.setString(2,name);
ps.setString(3,email);
ps.setString(4,phone);
ps.setString(5,question);

int s= ps.executeUpdate();


}
catch(Exception e){e.printStackTrace();}

%>
<jsp:forward page="home.jsp"></jsp:forward>
