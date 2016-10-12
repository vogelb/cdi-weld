package com.github.vogelb.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jglue.cdiunit.AdditionalPackages;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;

@RunWith(CdiRunner.class)
@AdditionalPackages(ConstantsProvider.class)
public class CDITest {
	
	@Inject
	ServiceBean service;
	
	@Test
	public void testInjection() {
		String version = service.getVersion();
		LoggerFactory.getLogger(getClass()).info("VERSION = " + version);
		assertEquals(Constants.VERSION, version);
	}

}
