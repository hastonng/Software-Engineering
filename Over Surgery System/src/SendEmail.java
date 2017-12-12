import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.*;

import com.sun.net.httpserver.HttpServer;


public class SendEmail extends HttpServlet {

	
	private static String  
			
			emailUserName = "generalsystememail",
			emailPassword = "finalyear2017",
            host = "smtp.gmail.com";
	
    public void doPost(String patientEmail, String gpEmail, String nurseEmail,String nurseEmail2, String appDate, String startTime, String endTime)  {


        try {
            
        	

            String[] RECIPIENT = { patientEmail,gpEmail,nurseEmail,nurseEmail2 };
            
            for(int i = 0; i < RECIPIENT.length; i ++) {
            	
            	System.out.println(RECIPIENT[i]);
            }

            //set up the SMTP Server in Java
            Properties mail = new Properties();

            mail.put("mail.smtp.starttls.enable", "true"); //<-- Start/Setup TLS Server
            mail.put("mail.smtp.host", host); //<-- Setup the SMTP for Gmail
            mail.put("mail.smtp.port", "587"); //<-- TLS Port for Gmail
            mail.put("mail.smtp.auth", "true");
            
            

            Session session = Session.getDefaultInstance(mail,    
            		           new javax.mail.Authenticator() {    
            		           protected PasswordAuthentication getPasswordAuthentication() {    
            		           return new PasswordAuthentication(emailUserName,emailPassword);  
            		           }    
            		          });    
            
            MimeMessage message = new MimeMessage(session);
            
            message.addRecipients(Message.RecipientType.TO, patientEmail);
            message.addRecipients(Message.RecipientType.TO, gpEmail);
            message.addRecipients(Message.RecipientType.TO, nurseEmail);
            message.addRecipients(Message.RecipientType.TO, nurseEmail2);
            
            message.setFrom(new InternetAddress("generalsystememail@gmail.com"));
            System.out.println("I'm HERE!!");
                        
            String bodyText =
                    "<b>NEW NOTIFICATION: </b>"+
                    "APPOINTMENT DATE: "+appDate+"<br>"+
                    "APPOINTMENT TIME FROM: "+startTime+"<br>"+
                    "APPOINTMENT TO: "+endTime+"<br>"+
                    "<br><br> Computer Generate: God Hospital System © 2017 All Rights Reserved. ";
            
            
            message.setSubject("New Appointment Notification from God Hospital.");
            message.setText(bodyText);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, emailUserName, emailPassword);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

       
            
        } catch (Exception e) {
        	
        	e.printStackTrace();
        }


    }
}
