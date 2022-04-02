package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features/",	//
		glue= {"com.stepdef","com.hooks"},
		plugin=("json:target/cucumber.json"),
		dryRun=true,
		monochrome=true,
		strict=true
		
		)


public class Instagram_Runner extends AbstractTestNGCucumberTests {

}
