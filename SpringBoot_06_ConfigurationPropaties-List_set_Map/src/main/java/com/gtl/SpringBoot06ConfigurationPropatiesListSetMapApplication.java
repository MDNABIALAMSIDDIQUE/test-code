package com.gtl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gtl.sbean.Employee;

@SpringBootApplication
public class SpringBoot06ConfigurationPropatiesListSetMapApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBoot06ConfigurationPropatiesListSetMapApplication.class, args);
	
	Employee employee=ctx.getBean("emp",Employee.class);
	System.out.println("============================================");
	System.out.println(employee);
	System.out.println("============================================");
	}

}
