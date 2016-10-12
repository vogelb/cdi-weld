package com.github.vogelb.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.slf4j.LoggerFactory;

public class Main {
	
	public static void main(String[] args) {
		Weld weld = new Weld();
		// Configure Weld Context: Add all classes in the same package to class path
  	   	
  	   	// Start container
  	   	WeldContainer container = weld.initialize();
  	   	
  	   	// Get managed bean instance
  	   	Service main = container.select(Service.class).get();
		LoggerFactory.getLogger(Main.class).info("VERSION = " + main.getVersion());
		
		// Clean up
		container.shutdown();
	}
}
