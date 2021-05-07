package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Forgot_password_negative_scenario\\Forgot_password_negative_scenario.feature",
glue= {"Forgot_password_negative_scenario"},
monochrome = true,publish = true)
public class Forgot_negative_scenario_runner extends AbstractTestNGCucumberTests{

}
