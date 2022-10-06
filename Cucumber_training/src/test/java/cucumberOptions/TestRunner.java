package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		//glue = parameter of step definition file
		glue = "stepDefinitions", stepNotifications = true, tags = "@MobileTest") /* example: "not @RegTest */

public class TestRunner {

}
