package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Login_negative_scenario\\Login_negative_scenario.feature",
glue= {"Login_negative_scenario"},
monochrome = true,publish = true)
public class Login_negative_scenario_runner extends AbstractTestNGCucumberTests {

}
