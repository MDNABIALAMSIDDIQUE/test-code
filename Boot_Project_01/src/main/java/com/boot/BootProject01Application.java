package com.boot;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProject01Application {
	
	
	@Bean(name = "ldt")
	
	public LocalDateTime createdLDT() {
		System.out.println("BootProject01Application.createdLDT()............(3)");
		return LocalDateTime.now();
	}
	

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootProject01Application.class, args);
	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
	String result=generator.showWishMeassge("ALAM");
	System.out.println("Print...."+result);
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
