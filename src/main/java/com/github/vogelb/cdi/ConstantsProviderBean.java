package com.github.vogelb.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConstantsProviderBean implements ConstantsProvider {

	public String getVersion() {
		return Constants.VERSION;
	}

}
