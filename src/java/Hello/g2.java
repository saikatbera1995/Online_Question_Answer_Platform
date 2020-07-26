
package Hello;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class g2 
{
    public static void send(String to,String username,String userpass){  
  
 final String user="gdas64680@gmail.com";  
 final String pass="gopaldasalokdas";  
  
    
Properties props = new Properties();  

props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.port", "587");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
  
Session session = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
  protected javax.mail.PasswordAuthentication getPasswordAuthentication() {  
   return new javax.mail.PasswordAuthentication(user,pass);  
   }  
});  
  
try {  
 MimeMessage message = new MimeMessage(session);  
 message.setFrom(new InternetAddress(user));  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));   
   
message.setSubject("Online Question Answer..");
message.setText("Hello your username is "+username+" and password is "+userpass);
 Transport.send(message);  
  
 System.out.println("Done");  
}
  
  catch (MessagingException e) {  
    throw new RuntimeException(e);
          }
  
      
    } 
}
