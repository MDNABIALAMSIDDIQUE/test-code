package com.spring.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Desktop")
public class DesktopMessage {
	
	@Autowired
	private LocalDateTime LDT;
	
	public DesktopMessage() {
	System.out.println("Class Loading.... Desktop... ");	
	}
	
	public String showDesktokMeagges(String user) {
		
		System.out.println("SHOW Desktop Message... Message....");
		int hour=LDT.getHour();
		System.out.println("=========== Hour =======");
		System.out.println(hour);
		System.out.println("=========== Month =======");
		int day=LDT.getDayOfMonth();
		System.out.println(day);
		System.out.println("=========== day =======");
		int Mom=LDT.getHour();
		System.out.println(Mom);
		
		if (hour<12) {
			return"Good Moring"+user;
		}
		else if (hour<16) {
			return"Good After Noon"+user;
		}
		else if (hour<20) {
			return"Good Evening"+user;
		}
		else {
			return"Good Night"+user;
		}
		
	}
}
