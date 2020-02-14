package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
//@Cucumber.options(features={"CucumberFeature"})


//@CucumberOptions(features= "CucumberFeature")

@CucumberOptions(features= "CucumberFeature",glue= {"/Cucumber/src/main/java/stepDefinition"})


public class TestRunner 
{
	

	
}
