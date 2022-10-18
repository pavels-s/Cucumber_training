package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
features = "src/test/java/features/SearchProduct.feature",
glue = "stepDefinitions",
monochrome = true,
stepNotifications = true
//dryRun = true -> is only for compilation, not for actual run
)

public class TestRunner {

	
}
