package com.boot.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private  LocalDateTime ldt;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0 Constracter...........(1)");
	}
	
	public String showWishMeassge(String user) {
		
		
		System.out.println("WishMessageGenerator.showWishMeassge()...................(2)");
		
		int hour=ldt.getHour();
		
		if (hour<12)
			return"Good Moring"+user;
		else if(hour<16)
			return"Good After Noon"+user;
		else if(hour<19)
			return "Good Evening"+user;
		else 
			return"Good Night"+user;
	}
	
}
