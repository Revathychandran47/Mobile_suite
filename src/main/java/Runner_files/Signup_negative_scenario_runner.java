package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	features = "src\\main\\java\\Signup_negative_scenario\\Signup_negative_scenario.feature",
	glue= {"Signup_negative_scenario"},
	monochrome = true,publish = true)
public class Signup_negative_scenario_runner extends AbstractTestNGCucumberTests {

}
