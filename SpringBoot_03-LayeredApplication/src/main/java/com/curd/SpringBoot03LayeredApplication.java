package com.curd;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.curd.controller.PayrollOperationController;
import com.curd.modal.Employee;

@SpringBootApplication
public class SpringBoot03LayeredApplication {

	public static void main(String[] args) {
	ApplicationContext ctx	= SpringApplication.run(SpringBoot03LayeredApplication.class, args);
	PayrollOperationController controller=ctx.getBean("payroll",PayrollOperationController.class);
	try {
		List<Employee> list=controller.showEmployeesByDesgs("CLERK", "MANAGER", "SALESMAN");
		list.forEach(emp->{
			System.out.println(emp);
		});
	} 
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("Internal Probeml try agin::"+e.getMessage());
	}
		((ConfigurableApplicationContext) ctx).close();
	}

}
