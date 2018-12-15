package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:/Users/Masood Sidiqui/Documents/workspace/CucumberProjectDec9/"
		+ "src/test/resources/features/SignUpWithDataTable.feature" 
		, glue = ""
		, plugin = {"pretty", "html:test-output"}
		, dryRun = false)
		
public class SignUpWithDataTableRunner {

}
