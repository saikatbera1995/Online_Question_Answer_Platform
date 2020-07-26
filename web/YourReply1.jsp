<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>


<%

 try {
     
String id= request.getParameter("id");
String name= request.getParameter("name");
String email= request.getParameter("email");
String phone= request.getParameter("phone");
String answer= request.getParameter("answer");
 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");

PreparedStatement ps=con.prepareStatement("insert into answerreply values(?,?,?,?,?)");
ps.setString(1,id);
ps.setString(2,name);
ps.setString(3,email);
ps.setString(4,phone);
ps.setString(5,answer);

int s= ps.executeUpdate();


}
catch(Exception e){e.printStackTrace();}

%>
<jsp:forward page="ShowQ"></jsp:forward>


