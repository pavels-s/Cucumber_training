package cucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

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

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
	
}
