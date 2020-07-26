<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>


<jsp:include page="header.jsp"></jsp:include>

<%
String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");

%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
}
%>



<div class="left_content">
             <% 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					%>
				<% 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					%>
					<%
					if(request.getAttribute("finished")!=null){
					   out.print("<font size='2' color='navy'>");
                   out.print("<B>");
					out.print(request.getAttribute("finished"));
					  out.print("<B>");
   						out.print("</font>");
					}
				if(request.getAttribute("category")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("category"));
					out.print("</font>");
					}
				
					%>
            	<div class="calendar_box">
            	
                	<div class="calendar_box_content">
               
                            <h1 style="color:#CC00CC">welcome to Home Page</h1>
                		              		<marquee direction="left" style="color: navy;" onmouseover="stop()" onmouseout="start()"><B>Latest Asked Questions in Quiz Contest Forum</B></marquee>
                	<p>
                	<font style="color: navy;"> </font>
                	</p>
                        <h3 style="color:#CC0033"> Welcome to Online Quize Contest </h3>
                        <a href="QuestionSetHere.html" style="color:#009900"> <b>click here to see Ask Questions</b> </a>
                        		


                     
                	</div>
                </div>
                
                <div class="news_left">
                
                	<div class="news_box">
                    	<div class="calendar"></div>
                        <div class="news_content">
						                    
                        </div>
                    </div>
                    <br>
                	<div class="news_box">
                    	<div class="calendar"></div>
                        <div class="news_content">
						
                                              
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div>
            <!--end of left content-->


            <div class="right_content">
                
                
                <h3 color="#993399">if you want to change your password then</h3>
                <a href="ChangePassword.jsp"><p style="color:green;text-align: center;font-size: 13px;"> <b>click here</b></P> </a>
            
         
               
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>

