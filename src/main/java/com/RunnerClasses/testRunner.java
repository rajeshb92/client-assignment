package com.RunnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	
	features="Features",
	glue= {"com.StepDefinitionClasses"}
	
)

public class testRunner {

}
