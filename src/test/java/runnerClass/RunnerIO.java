package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features={".\\src\\test\\java\\featureFiles\\new.feature"},
		glue={"stepDefinition"},
//		tags ="@Smoke",
		dryRun=false,  //true: when feature file is newly created, browser will not launch but
				     //all the scenarios will get annotation methods. 
				     //It is going to match feature file and step definition file
				     //false: execute
		monochrome = true      // Readable console output

		)


public class RunnerIO extends AbstractTestNGCucumberTests
{
	
}
