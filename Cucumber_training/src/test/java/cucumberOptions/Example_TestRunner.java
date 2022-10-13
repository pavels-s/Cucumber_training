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
		//example: "not @RegTest" "@SmokeTest and(or) @RegTest"
		tags = "@PortalTest",
		//Way to validate if all steps are properly mapped in step definition
		dryRun = true,
		//Way to make console results looks more attractive
		monochrome = true,
		//things to generate a specific reports in given directory
		plugin = {"pretty", "html:target/cucumber_html_report.html", "json:target/cucumber_json_report.json", "junit:target/cucumber_xml_report.xml"}) 

public class Example_TestRunner {

}
