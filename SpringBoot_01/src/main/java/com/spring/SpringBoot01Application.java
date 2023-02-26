package com.spring;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.beans.DesktopMessage;

@SpringBootApplication
public class SpringBoot01Application {
	
	@Bean(name = "LDT")
	public LocalDateTime LDT() {
		System.out.println("Today Date And Time.....");
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBoot01Application.class, args);
	DesktopMessage desktopMessage=ctx.getBean("Desktop",DesktopMessage.class);	
	String resut= desktopMessage.showDesktokMeagges("     MD NABI ALAM");
	System.out.println("Result::::      "+resut);
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
