package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources"}, 
		glue = { "stepDefination"}, 
		tags= "@LoginTest", 
		dryRun = false, 
		plugin = {"pretty",}
	)

public class RunnerClass {

	public static void main(String args[]) {

	}

}
