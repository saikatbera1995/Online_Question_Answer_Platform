
package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class g1 extends HttpServlet {
     Connection con;
      Statement stat;
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        PrintWriter out = response.getWriter();
        
       
        String email=request.getParameter("email");
        String name=null;
        String password=null;
        String next;
        
        if(email!=null)
        {
            try
            {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
                stat=con.createStatement();
                String sql="Select username from register where email='"+email+"'";
                ResultSet rs1=stat.executeQuery(sql);
                while(rs1.next())
                    name=rs1.getString("username");
                
                String query="Select userpass from register where email='"+email+"'";
                                ResultSet rs2=stat.executeQuery(query);
                while(rs2.next())
                    password=rs2.getString("userpass");
                
                
                g2.send(email,name,password);
                
                response.setContentType("text/html");
            
            
                    
  
            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body><center>");
            out.println("<h1>Your Username and Password is send your gmail account<br/></h1>");
            out.println("<h4>Click here to <a href='index.jsp'>login</a><h4>");
            out.println("</center></body>");
            out.println("</html>");
                
            }
            catch(SQLException se)
            {
               
            
                out.println(se);
                
            } catch (ClassNotFoundException ex) {
                
               
                Logger.getLogger(g1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            
            request.getRequestDispatcher("Forgot.jsp").include(request, response);
              
        }
        
       
       
    }

  
   
}
