package com.gtl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.gtl.beans.Hotal;

@SpringBootApplication
public class SpringBoot04ValueAnnotionSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBoot04ValueAnnotionSpelApplication.class, args);
	
		Hotal hotal= ctx.getBean("hotel",Hotal.class);
		System.out.println(hotal);
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
