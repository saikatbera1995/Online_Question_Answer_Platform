
package ans;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class answ extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     */

    protected void service(HttpServletRequest request, HttpServletResponse response)
    {
        
        try
        {
             response.setContentType("text/html");
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","");
             String id=request.getParameter("id");
             PreparedStatement ps=conn.prepareStatement("select * from answerreply where id=?");
             ps.setString(1,id);
             ResultSet rs = ps.executeQuery();
             PrintWriter out = response.getWriter();
             out.println("<html><link href='ShowQ_Style.css' rel='stylesheet' type='text/css' /><body style='background-image:url(images/slideshow/white-particles-loop-background-animation-can-be-used-for-title-animations-presentations-slideshow-or-other-projects_4ky5s_4qx__F0000.png'><center><h1 style='color:#993366'>Latest  Answer in Online Question Answer Platform</h1><div class='hav'><a href='home.jsp'><b>Home</b></a><a href='ask.jsp'><b>Ask Question</b></a> <a href='QuestionSetHere.html'><b>view answer</b></a></div>"
                     + "<table style='text-align:center;width:1200px;font-size:19px'><tr style='color:#FFFF00'><td>Quenstion Number</td><td>Name</td><td>Email</td><td>Phone</td><td>Answer</td></tr>");
             while(rs.next())
            {
                
                out.println("<tr style='color:#330033'><td> "+rs.getString(1)+"</td>"
                + "<td> "+rs.getString(2)+" </td><td> "+rs.getString(3)+" </td>"
                 + "<td> "+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");
                
            }
             out.println("</table></center></body></html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        }
    
    

    private String href(String yourResponsehtml) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    


