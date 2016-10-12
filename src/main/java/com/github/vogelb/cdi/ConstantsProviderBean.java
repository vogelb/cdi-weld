package com.github.vogelb.cdi;

public class ConstantsProviderBean implements ConstantsProvider {

	public String getVersion() {
		return Constants.VERSION;
	}

}
