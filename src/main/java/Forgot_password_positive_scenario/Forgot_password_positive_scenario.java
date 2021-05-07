package Forgot_password_positive_scenario;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Forgot_password_positive_scenario extends Generic_functions{
	static boolean value;

	/* Application  is launching using appium, navigating to Landing Welcome Page and clicking on login button  */
	@Given("App is open")
	public void app_launching() throws Exception {
		try {
			app_launch();
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* TC_001 -Validate that the  user should  able to enter 10 digit number in "Phone Number" field*/
	@Then("Click on Login button then click on Forgot Password link and enter phone number in Phone number field")
	public static void forgot_positive_tc_001(){
		page_wait(20);
		try {
			click("welcome_login");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("forgot_password_link");
			click("forgot_phone_number");
			page_wait(6);
			driver.findElement(By.xpath(OR_reader("Object Locator","forgot_phone_number"))).sendKeys(td_reader("forgot_phone_number",0));
			value = driver.findElement(By.xpath(OR_reader("Object Locator","forgot_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* TC_002 -Validate that the user should able to click on the  Send Reset Link button on entering valid phone number in Phone number field*/
	@Given("Verify that Send Reset Link button gets enabled and user can click on it")
	public static void forgot_positive_tc_002(){
		page_wait(10);
		try {
			field_clear("forgot_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator","forgot_phone_number"))).sendKeys(td_reader("forgot_phone_number",0));
			page_wait(30);
			click("send_resend_link");
			click("send_resend_link");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* TC_003 -Validate that the user is navigated to sign up page on clicking Sign up link*/
	@Given("Click on Sign up link then should be navigated  to  Sign up page")
	public static void forgot_positive_tc_003(){
		try {
			click("forgot_signup_link");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "signup_first_name"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.closeApp();
	}
}
