package cucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src//test//java1//featureLayer"
		 ,glue="StepDefinitions"
	     ,monochrome=true
		 ,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
	//	,dryRun=true	
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

	

}
