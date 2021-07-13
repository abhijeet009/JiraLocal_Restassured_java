package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/Auser.feature",
				"src/test/java/features/BprojectTesting.feature",//need to code for xsrf token
				"src/test/java/features/issueValidation.feature"
				},
				
		plugin = "json:target/jsonReports/cucumber-report.json",
		glue = "stepDefinations"
		//tags = {"@DeletePlace"}//when you want to run only one case
		)
public class TestRunner {

}


