package com.github.vogelb.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
	
	public static void main(String[] args) {
		Weld weld = new Weld();
		// Configure Weld Context: Add all classes in the same package to class path
  	   	
  	   	// Start container
  	   	WeldContainer container = weld.initialize();
  	   	
  	   	// Get managed bean instance
  	   	SomeService main = container.select(SomeService.class).get();
		System.out.println(main.getVersion());
		
		// Clean up
		container.shutdown();
	}
}
