package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailsApplication {

	@Autowired
	private ServiceClass mailSender;
	
	public static void main(String[] args) {
		SpringApplication.run(SendEmailsApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void Sendmail() {
		mailSender.SendEmail("happyvision1821@gmail.com",
				" mail recevied....",
				"paduko pooo....");
	}

}
