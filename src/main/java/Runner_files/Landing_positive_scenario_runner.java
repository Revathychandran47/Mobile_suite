package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Landing_positive_scenario\\Landing_positive_scenario.feature",
glue= {"Landing_positive_scenario"},
monochrome = true,publish = true)
public class Landing_positive_scenario_runner extends AbstractTestNGCucumberTests {

}
