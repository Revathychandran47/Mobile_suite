package Runner_files;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Services_positive_scenario\\Services_positive_scenario.feature",
glue= {"Services_positive_scenario"},
monochrome = true,publish = true)
public class Services_positive_scenario_runner extends AbstractTestNGCucumberTests{

}
