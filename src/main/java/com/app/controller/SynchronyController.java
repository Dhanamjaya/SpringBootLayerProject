package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Synchrony;
import com.app.service.ISynchronyService;

@Controller
public class SynchronyController {

	@Autowired
	private ISynchronyService iSynchronyService;

	// JPA Operations
	@RequestMapping("/save")
	public void jpaSynchrony() {
		iSynchronyService.saveAll(Arrays.asList(
				new Synchrony(10,"Hyderabad"),
				new Synchrony(20,"chennai"),
				new Synchrony(30,"Bangalore")
				
				
				));
		
		iSynchronyService.findAllById(List.of(10,20,30)).forEach(System.out::println);
		iSynchronyService.findAll().forEach(System.out::println);
	
		Long l=iSynchronyService.count();
		System.out.println(l);
		System.out.println("==========");
	
		
	}

}
