package com.app.email;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	boolean status=true;
	public boolean sendEmailService(String to,String subject,String[] cc,String[] bcc,String text,FileSystemResource file)
	{
		try {
		
			//step 1: create mime message Object
			MimeMessage mailobj=javaMailSender.createMimeMessage();
			
			//step 2 :provide details like to,cc,sub,attachment
			MimeMessageHelper helper=new MimeMessageHelper(mailobj,file!=null?true:false);
			if(to!=null)
			helper.setTo(to);
			
			helper.setSubject(subject);
			
			if(cc!=null?true:false)
			helper.setCc(cc);
			
			if(bcc!=null?true:false)
			helper.setBcc(bcc);
			helper.setText(text);
			if(file!=null)
			{
			helper.addAttachment(file.getFilename(), file);
			}
			javaMailSender.send(mailobj);
			status=true;
			
		} catch (Exception e) {

		status=false;
		e.printStackTrace();
		
		}
		
		return status;
	}
	
	
}
