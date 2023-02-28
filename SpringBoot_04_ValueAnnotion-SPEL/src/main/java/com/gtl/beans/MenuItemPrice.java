package com.gtl.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("menu")
public class MenuItemPrice {
	
	@Value("${menu.dosaPrice}")
	public float dosaPrice;
	@Value("${menu.idlyPrice}")
	public float idllyPrice;
	@Value("${menu.pohaPrice}")
	public float pohaPrice;
	@Value("${menu.vodaPrice}")
	public float vodaPrice;
	
	
	@Override
	public String toString() {
		return "MenuItemPrice [dosaPrice=" + dosaPrice + ", idllyPrice=" + idllyPrice + ", pohaPrice=" + pohaPrice
				+ ", vodaPrice=" + vodaPrice + "]";
	}
	
	
	
	
}
