package com.RunnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	
	features="/Cucumberr/Features/AcceptanceCriteria2.feature",
	glue= {"/Cucumberr/src/main/java/com/StepDefinitionClasses2"},
	plugin = { "pretty", "html:target/htmlreports" }

)

public class testRunner {

}
