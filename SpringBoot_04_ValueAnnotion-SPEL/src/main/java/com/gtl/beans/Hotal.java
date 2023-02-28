package com.gtl.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")

public class Hotal {
	@Value("12345")
	private Integer hotelid;
	
	@Value("${hotal.Name}")
	private String hotalName;
	
	@Value("${hotal.Address}")
	private String hotalAddress;
	
	@Value("${hotal.Contactno}")
	private String mobileNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menu.dosaPrice + menu.idllyPrice}")
	private float BillAmount;
	
	@Value("${os.name}")
	private  String osName;
	
	@Value("${user.name}")
	private String windowUser;
	
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "Hotal [hotelid=" + hotelid + ", hotalName=" + hotalName + ", hotalAddress=" + hotalAddress
				+ ", mobileNo=" + mobileNo + ", custName=" + custName + ", BillAmount=" + BillAmount + ", osName="
				+ osName + ", windowUser=" + windowUser + ", pathData=" + pathData + "]";
	}
	
	
	
}
