package com.spring;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.beans.WelComeMessage;

@SpringBootApplication
public class Application {
	
	@Bean(name = "dateTime")
	public LocalDateTime dateTime() {
		System.out.println("Local Date Time .... Date...");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(Application.class, args);
		WelComeMessage welComeMessage=applicationContext.getBean("welcome",WelComeMessage.class);
		String string=welComeMessage.UserName("Zohan");
		System.out.println("======"+string);
		applicationContext.hashCode();
		
	}

}
