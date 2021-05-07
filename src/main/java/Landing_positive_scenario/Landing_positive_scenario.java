package Landing_positive_scenario;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Landing_positive_scenario extends Generic_functions{
	static boolean value;
	
	/*TC_001 Validate that the user is navigated to Welcome page */
	@Given("User opens application and User should be navigated to Welcome page")
	public static void landing_welcome_positive_tc_001() throws Exception {
		try {
			app_launch();
			page_wait(40);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_welcome_positive_tc_001");
		}
	}

	/*TC_002 Validate that the user is able to click on 'Sign Up' button and navigate to 'Sign Up' page */
	@When("User clicks on the Sign Up button and navigate to Sign Up page")
	public static void landing_welcome_positive_tc_002() throws Exception {
		try {
			page_wait(60);
			click("welcome_signup");
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "signup_first_name"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(50);
			click("signup_page_back");		
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_welcome_positive_tc_002");
		}
	}

	/*TC_003 Validate that the  user is able to click on 'Login' button and navigated to login page*/
	@When("User clicks on Login button and navigate to Login page")
	public static void landing_welcome_positive_tc_003() throws Exception {
		try {
			page_wait(40);
			click("welcome_login");
			page_wait(60);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("landing_welcome_positive_tc_003");
		}
		browser_back();
		driver.closeApp();
	}
}