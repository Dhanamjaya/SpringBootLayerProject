package com.app.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedule {

	// fixedRate-property is there is no waiting time ,no need to check method execution completed or not.
	  @Scheduled(fixedRate = 8000) public void fixedRateSch() { SimpleDateFormat
	  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	  
	  Date now = new Date(); String strDate = sdf.format(now);
	  System.out.println("Fixed Rate scheduler:: " + strDate); }
	 
		
	  // fixedDelay--property is wantedly give gap between previous execution method and next execution method gap provided
	  
		  @Scheduled(fixedDelay = 8000, initialDelay = 4000) public void
		  fixedDelaySch() { SimpleDateFormat sdf = new
		  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); Date now = new Date(); String
		  strDate = sdf.format(now); System.out.println("Fixed Delay scheduler:: " +
		  strDate); }
		 
		  //cron-property expression 
		  @Scheduled(cron = "0 15 10 15 * ?")
		  public void scheduleTaskUsingCronExpression() {
		   
		      long now = System.currentTimeMillis() / 1000;
		      System.out.println(
		        "schedule tasks using cron jobs - " + now);
		  }
	}
