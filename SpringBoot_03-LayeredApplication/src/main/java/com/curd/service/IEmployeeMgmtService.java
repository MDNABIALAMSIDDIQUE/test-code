package com.curd.service;

import java.util.List;

import com.curd.modal.Employee;

public interface IEmployeeMgmtService {

	public List<Employee> fatchEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception;
	
}
