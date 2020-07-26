
package org.question;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowQ extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
         try
         {
            response.setContentType("text/html");
            
            String ans="Reply";
            String v = "View Answer";
            
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");  
            PreparedStatement ps=conn.prepareStatement("select * from askquestions");
            ResultSet rs = ps.executeQuery();
            PrintWriter out = response.getWriter();
            out.println("<html> <link href='ShowQ_Style.css' rel='stylesheet' type='text/css' /><body style='background-image:url(images/slideshow/gradients-pink-blur-blue-simple-background-simple-abstract.jpg' ><center><h1 style='color:#993366'>Latest Questions in Online Question Answer Platform</h1> "
                    + "</br><div class='hav'><a href='home.jsp'><b>Home</b></a><a href='ask.jsp'><b>Ask Question</b></a> <a href='QuestionSetHere.html'><b>view answer</b></a></div><div class='table_header'><table style='text-align:center;width:1200px'><tr style='color:#660099'>"
                    + "<b><td>Question Number</td><td>Name</td><td>Email</td><td>Phone</td><td>Question</td><td>Your Reply Please</td></b></tr></div>");
            while(rs.next())
            {
                
                out.println("<tr style='color:#330033'><td> "+rs.getString(1)+"</td><td> "+rs.getString(2)+" </td><td> "+rs.getString(3)+" </td><td> "+rs.getString(4)+"</td><td>"+rs.getString(5)+" </td><td><a href='YourReply.html'>"+ans+"</a></td></tr>");
                
            }
            out.println("</table></center></body></html>");
        }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String href(String yourResponsehtml) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String v(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
