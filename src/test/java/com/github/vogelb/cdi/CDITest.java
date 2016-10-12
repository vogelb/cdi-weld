package com.github.vogelb.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jglue.cdiunit.AdditionalPackages;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;

import com.github.vogelb.cdi.Constants;
import com.github.vogelb.cdi.ConstantsProvider;
import com.github.vogelb.cdi.SomeService;

@RunWith(CdiRunner.class)
@AdditionalPackages(ConstantsProvider.class)
public class CDITest {
	
	@Inject
	SomeService service;
	
	@Test
	public void testInjection() {
		String version = service.getVersion();
		LoggerFactory.getLogger(getClass()).info("Got Version: " + version);
		assertEquals(Constants.VERSION, version);
	}

}
