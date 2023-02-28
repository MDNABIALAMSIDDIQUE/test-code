package com.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.curd.modal.Employee;
import com.curd.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<Employee> showEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception {
		
		System.out.println("Payroll show Employee by Desgs...");
		List<Employee> list=service.fatchEmployeeByDesgs(desg1, desg2, desg3);
		return list;
	}
	
	
}
