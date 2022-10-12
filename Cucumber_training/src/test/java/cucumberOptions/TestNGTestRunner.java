package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
features = "src/test/java/features/searchProduct.feature",
glue = "stepDefinitions",
monochrome = true,
stepNotifications = true
//dryRun = true
)

public class TestNGTestRunner {

	
}
