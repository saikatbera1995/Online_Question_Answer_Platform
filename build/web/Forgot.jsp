<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="style.css">
<script>
var request;
function sendInfoEmail1()
{
var v=document.myform.email.value;
var url="findname6.jsp?val="+v;
if(window.XMLHttpRequest){
request=new XMLHttpRequest();
}
else if(window.ActiveXObject){
request=new ActiveXObject("Microsoft.XMLHTTP");
}
try
{
request.onreadystatechange=getInfo;
request.open("GET",url,true);
request.send();
}
catch(e){alert("Unable to connect to server");}
}

function getInfo(){
if(request.readyState==4){
var val=request.responseText;
document.getElementById('location').innerHTML=val;
}
}
</script>
</head><body>
  
<div id="main_container">
	<div class="main_content">
    	<div id="header">
      
        </div>
        <div class="top_center_box"></div>
        <div class="center_box">

    
            <div id="menu_tab">                                     
                    <ul class="menu">                                                                              
                         <li><a href="home.jsp" class="nav">Home</a></li>
                         <li class="divider"></li>
                         <li><a href="takequiz.jsp" class="nav">Take Quiz</a></li>
                         <li class="divider"></li>
                         <li><a href="ask.jsp" class="nav">Ask Ques.</a></li>
                         <li class="divider"></li>
                         
						 <li><a href="makequiz.jsp" class="nav">Make quiz</a></li> 
						 <li class="divider"></li>
<li><a href="contact.html" class="nav">Contact</a></li>
<li class="divider"></li>
 <li><a href="register.jsp" class="nav">Registration</a></li>
                         	   
                         	 
                    </ul>
            </div> 
          
            
            <div class="middle_box">
            	<div class="middle_box_text_content">
                	<div class="middle_box_title"></div>
                    <p class="middle_text">
</p>
                </div>
            
            
            </div>
            
            
            <div class="left_content">
            
            	<div class="calendar_box">
            	
                	<div class="calendar_box_content1">
                	
                		
                		   <p><div id="location"></div>
                		<div class="changepassword">
                                   <h1 style="color:#990000">Forgot Password?</h1>
                <form action="g1" name="myform" method="post" >
                    <h4 style="color:#0066FF">Submit Username and Password</h4>
                    <table>
                        <tr><td>Enter Your Email:</td><td><input type="email" name="email" onkeyup="sendInfoEmail1()"/></td></tr>
                        
                        <tr><td></td><td><input type="submit" value="click" /></td></tr>
                    </table>
                
                </form>
            </form>
        </div>


                        </p>
                	</div>
                </div>
                
             <div class="news_left">
                
                	<div class="news_box">
                    	
                    <br>
                	
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div>
            <!--end of left content-->


            <div class="right_content">
                
                
                            
                
            
         
                
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>