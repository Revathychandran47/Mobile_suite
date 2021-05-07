package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	features = "src\\main\\java\\Login_positive_scenario\\Login_positive_scenario.feature",
	glue= {"Login_positive_scenario"},
	monochrome = true,publish = true)
public class Login_positive_scenario_runner extends AbstractTestNGCucumberTests {

}