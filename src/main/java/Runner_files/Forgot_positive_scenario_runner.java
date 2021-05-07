package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Forgot_password_positive_scenario\\Forgot_password_positive_scenario.feature",
glue= {"Forgot_password_positive_scenario"},
monochrome = true,publish = true)
public class Forgot_positive_scenario_runner extends AbstractTestNGCucumberTests{

}
