package com.github.harunhasdal.livecycle;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProcessLoggerTest {

	@Test
	public void testLogWithNullParameters() {
		ProcessLogger logger = new ProcessLoggerImpl();
		try{
			logger.log(null, null, null);
		} catch (Exception e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testLogWithEmptyParameters() {
		ProcessLogger logger = new ProcessLoggerImpl();
		try{
			logger.log("", "", "");
		} catch (Exception e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testLogWithUnrecognisedLevel() {
		ProcessLogger logger = new ProcessLoggerImpl();
		try{
			logger.log("NonExistent", "", "");
		} catch (Exception e) {
			fail("Should not throw exception");
		}
	}

}
