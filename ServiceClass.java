package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	@Autowired
	private MailSender mailSender;
	
	 
		
		public void SendEmail(String toEmail,
				              String Subject,
				              String body) {
	    SimpleMailMessage message= new SimpleMailMessage();
	    message.setFrom("jagadeesh");
	    message.setTo(toEmail);
	    message.setText(body);
	    message.setSubject(Subject);
	    
	    mailSender.send(message);
	    
	    System.out.println("Mail Sent Succesfully............");
	    
	    
	    
	    
		}   

	

}
