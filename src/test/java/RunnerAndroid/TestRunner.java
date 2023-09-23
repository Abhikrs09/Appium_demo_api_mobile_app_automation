package RunnerAndroid;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/Features/Animation_Page.feature",
		glue	 = "StepDefinitions",
		plugin = {"pretty"}
		//tags= {"@test"}

	)

	public class TestRunner extends AbstractTestNGCucumberTests{

	}
