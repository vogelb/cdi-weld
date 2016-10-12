package com.github.vogelb.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ServiceBean implements Service {
	@Inject
	ConstantsProvider constants;
	
	public String getVersion() {
		return constants.getVersion();
	}
}
