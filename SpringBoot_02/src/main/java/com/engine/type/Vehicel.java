package com.engine.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicel")
public class Vehicel {
	
	@Autowired
	@Qualifier("pEngine")
	private IEngine iengine;
	
	public Vehicel() {
		// TODO Auto-generated constructor stub
		System.out.println(" Class load... ");
	}
	
	public void jounery(String pickplace,String dropplace) {
		
		iengine.start();
		System.out.println("Jounery is Started at ..."+pickplace);
		System.out.println("Happy Jounery....");
		
		iengine.stop();
		System.out.println("Yuor Jounery is Complaed... in"+dropplace);
		
		
	}

}
