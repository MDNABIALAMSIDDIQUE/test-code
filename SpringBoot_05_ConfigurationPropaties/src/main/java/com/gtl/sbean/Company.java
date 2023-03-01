package com.gtl.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("company")
@Setter
@ToString
@ConfigurationProperties(prefix="org.gt")
public class Company {
	
	private String name;
	private String addres;
	private Long pincode;
	private String email;
	private long  contact;
	
	

}
