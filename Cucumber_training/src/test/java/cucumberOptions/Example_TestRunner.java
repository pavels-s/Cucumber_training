package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		//glue = parameter of step definition file
		glue = "stepDefinitions", 
		stepNotifications = true, 
		tags = "@PortalTest",
		plugin = {"pretty", "html:target/cucumber.html"}) /* example: "not @RegTest" "@SmokeTest and(or) @RegTest */

public class Example_TestRunner {

}
