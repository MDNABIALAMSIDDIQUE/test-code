package com.spring.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("welcome")
public class WelComeMessage {
	
	@Autowired
	private LocalDateTime dateTime;
	
	public WelComeMessage() {
		System.out.println("Class loading");
	}
	
	public String UserName(String UserName) {
		int Time=dateTime.getHour();
		if (Time<12) {
			return"Good Moring"+UserName;
		}
		else if (Time<16) {
			return"Good After Noon"+UserName;
		}
		else if (Time<20) {
			return"Good Eveing"+UserName;
		}
		else {
			return "Good Night"+UserName;
		}
		
		
		
	}

}
