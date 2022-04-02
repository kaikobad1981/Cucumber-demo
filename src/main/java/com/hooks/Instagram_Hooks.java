package com.hooks;

import com.baseclass.Base_Instagram;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Instagram_Hooks extends Base_Instagram {
	
	@Before
	public void setUp() {
		
		//setUp();	
	}

	@After
	public void teardown() {
		
		driver.quit();
	}
	
}
