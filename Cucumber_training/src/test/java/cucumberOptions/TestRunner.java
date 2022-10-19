package cucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
features = "src/test/java/features/Checkout.feature",
glue = "stepDefinitions",
monochrome = true,
stepNotifications = true,
plugin = {"html:target/cucumber.html", "json:target/cucumber.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

//dryRun = true -> is only for compilation, not for actual run
//tags "@Firsttag or @Secondtag"
//tags = "@Place order"
)

public class TestRunner {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
	
}
