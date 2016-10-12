package com.github.vogelb.cdi;

import javax.inject.Inject;

public class SomeService {
	@Inject
	ConstantsProvider constants;
	
	public String getVersion() {
		return constants.getVersion();
	}
}
