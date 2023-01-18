package com.crudopeartions.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender javamailsender;
	
	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo(to);
		smm.setSubject(subject);
		smm.setText(message);
		javamailsender.send(smm);

	}

}
