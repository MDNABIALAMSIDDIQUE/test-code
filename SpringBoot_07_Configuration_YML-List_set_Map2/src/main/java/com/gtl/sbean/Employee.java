package com.gtl.sbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix ="git.com")
public class Employee {
	
	private Integer eno;
	private String ename;
	
	// array type
	private String[] favColor;
	// list
	private List<String>nickName;
	//set
	private Set<Long> phoneNumber;
	// Map
	private Map<String,Object> idDetails;
	
	private Comapany comapany;
	

}
