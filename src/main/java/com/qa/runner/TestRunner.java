package com.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:com/qa/features/"}, 
		glue = {"com.qa.stepDefinitions" }, // the path of the step definition files
		plugin = { "pretty", "html:target/cucumber-reports.html" },
//		tags = "@smoke",
		monochrome = true,
		dryRun = false,
		stepNotifications = true
		)

public class TestRunner {

}
