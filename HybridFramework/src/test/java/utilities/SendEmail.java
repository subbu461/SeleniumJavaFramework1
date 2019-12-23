package utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



public class SendEmail {
	
	
	public static void sendReport()
	
	{
		
	// Reciepient's Email ID needs to be mentioned 	
		String to ="venkatasubbareddy279@gmail.com";
	 	
		// Sender's Email ID  needs to be Mentioned 
		
		String from ="m.venky461@gmail.com";
		
		// Define email server host(this is mostly in the format 
		// mail.yourcompanyname.com)
		
		  String host="m.subbu461@gmail.com";
		
		
		  //  Get System Properties 
		  
	Properties properties = System.getProperties();
		
		// SetUP Mail Server 
	
	properties.put("mail.host", host);
	properties.put("mail.smtp.user", from);
	properties.put("mail.smtp.port", "25");	
		
		
	// Get The Default Session Object 	
		
		Session session = Session.getDefaultInstance(properties);
		
		try {
			  // create a default mimeMessage Object 
			MimeMessage message = new MimeMessage(session);
			
			
			// Set From : header field of header 
			message.setFrom(new InternetAddress(from));
			
			// Set From : header  field of Header 
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			 // Set Subject : header field 
			
			message.setSubject("Automaation Test  Report");
			// Now Set the actual  Message 
			// Create Message part
			
			BodyPart messageBodyPart = new MimeBodyPart();
			
			// Now set the actual Message
			messageBodyPart.setText("automation Results:");
			
			// Create a multipart Message
			Multipart multipart = new MimeMultipart();
			
			// Set text message part 
			multipart.addBodyPart(messageBodyPart);
		 	
			// part two is attachment 
			
			messageBodyPart = new MimeBodyPart();
			
			addAttachment(multipart,"C:\\Users\\M V SUBBAREDDY\\eclipse-workspace\\HybridFramework\\MyOwnReport", host);
			//addAttachment(multipart,"");
		 	
			// Send Complete Message Parts 
			message.setContent(multipart);
			
			// Send Message 
			Transport.send(message);
			System.out.println("Sent Email SuccessFully.......");
			
		} 
		catch (MessagingException mex)
         {
      mex.printStackTrace();
			 
			 
		}

	}
 
	//private static void addAttachment(Multipart multipart, String string) {
		// TODO Auto-generated method stub
		
//	}//



	private static void addAttachment(Multipart multipart, String filePath, String fileName) throws MessagingException {
	
		DataSource source = new FileDataSource(filePath);
		BodyPart messageBodypart = new MimeBodyPart();  
		messageBodypart.setDataHandler(new DataHandler(source));
		messageBodypart.setFileName(fileName);
		multipart.addBodyPart(messageBodypart);
	}
	

	

}
  