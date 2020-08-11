package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.email.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sendemail")
	public void sendEmailController()
	{
		FileSystemResource file = 
				new FileSystemResource("C:\\Users\\KAKARALA BRO'S\\Pictures\\flower.jpg");
		boolean info=emailService.sendEmailService(
				"dhanamjaya.k@capgemini.com",
				 
				"This is the subject for program",
				new String[] {
						"vanumu.manognya@capgemini.com",
						"sadhana.kumari@capgemini.com",
				}, 
				new String[] {
						"vanumu.manognya@capgemini.com"						
				}, 
				"Springboot program TEXT Done", 
				file);
		if(info) {
			System.out.println("Email sent succesfully");
		}else {
			System.out.println("Email not sent succesfully");
		}
	}
	
}
