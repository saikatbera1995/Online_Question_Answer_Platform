<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
Statement st=con.createStatement();
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String username=request.getParameter("username");
String userpass=request.getParameter("userpass");
String category=request.getParameter("category");
String email=request.getParameter("email");
String strQuery = "SELECT COUNT(*) FROM register where email='"+email+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
System.out.println(Countrow);
if(Countrow.equals("0")){
    PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,username);
ps.setString(4,userpass);
ps.setString(5,category);
ps.setString(6,email);
ps.setString(7,null);

int s= ps.executeUpdate();
%>

<jsp:forward page="home.jsp"></jsp:forward>
<%
}
else{



}
}
catch (Exception e){
e.printStackTrace();
}
%>

<jsp:forward page="register.jsp"></jsp:forward>

