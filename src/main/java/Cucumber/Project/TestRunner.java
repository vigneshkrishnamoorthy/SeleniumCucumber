package Cucumber.Project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
//@Cucumber.options(features={"CucumberFeature"})

//@CucumberOptions(features= "CucumberFeature",glue= {"/Cucumber/src/main/java/stepDefinition"})

@CucumberOptions(features= "CucumberFeature")


public class TestRunner 
{
	

	
}
