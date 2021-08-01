import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailWithAttachment {
 
 public void Send() throws IOException {
  String to = "kennjuguna17@gmail.com"; // to address.
  final String from = "kennenjugush17@gmail.com"; // from address.
  final String password = "0758392852"; // password for from mail address. 
 
  Properties prop = new Properties();
  prop.put("mail.smtp.host", "smtp.gmail.com");
  prop.put("mail.smtp.port", "465");
  prop.put("mail.smtp.auth", "true");
  prop.put("mail.smtp.socketFactory.port", "465");
  prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 
  Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(from, password);
   }
  });
 
  try {
 
   Message message = new MimeMessage(session);
   message.setFrom(new InternetAddress(from));
   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
   message.setSubject("OTDR DISTANCE NOTIFICATION ERROR");//email subject
   
   App app = new App();
	
   System.out.printf(" %8s %10s %15s %n","Date", "Time", "Distance (km)");
   String msg = app.errorResult();// the return value of errorResult is called here, and later sent as an email text
   System.out.println(msg);
    
   MimeBodyPart mimeBodyPart = new MimeBodyPart();
   mimeBodyPart.setContent(msg, "text/html");
     
   Multipart multipart = new MimeMultipart();
   multipart.addBodyPart(mimeBodyPart);
    
   MimeBodyPart attachmentBodyPart = new MimeBodyPart();
   attachmentBodyPart.attachFile("otdrDistances.txt");//file to be attached
   multipart.addBodyPart(attachmentBodyPart);
   message.setContent(multipart);
 
   Transport.send(message);
 
   System.out.println("Mail successfully sent..");
 
  } catch (MessagingException e) {
   e.printStackTrace();
  }
 }
}