package Login_positive_scenario;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_positive_scenario extends Generic_functions{
	public static boolean value;
	
	/* Application Launch*/
	@Given("App is open")
	public void app_launching() throws Exception {
		try {
			app_launch();
		} catch (Exception e) {
			e.getMessage();
		}
		}	
	
	@Then("check  the  Phone number  field is prefixed with country code")
	/*TC 001 - Validate that the'Phone number' field is prefixed with '+1' country code*/
	public static void login_positive_tc_001() throws Exception {
		try {
			page_wait(2);
			click("welcome_login");
			page_wait(30);
			//value = driver.findElement(By.xpath(OR_reader("Object Locator","plus_one"))).isDisplayed();
			//Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.getMessage();
			takeScreenShot("login_positive_tc_001");
		}
		}
	
	@Given("User click on Forgot password")
	/*TC 002 - Validate that the user is able to click on the 'Forgot password?' link*/
	public static void login_positive_tc_002() throws IOException {
		try {
			page_wait(10);
			click("forgot_password_link");
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "send_resend_link"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(10);
		} catch (Exception e) {
			e.getMessage();
			takeScreenShot("login_positive_tc_002");
			}
	}

	@Given("User click on Sign up")
	/*TC 003 - Validate that the user is able click on the 'Sign up' link*/
	public static void login_positive_tc_003() throws IOException {
		try {
			page_wait(2);
			click("forgot_signup_link");
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "signup_first_name"))).isDisplayed();
			Assert.assertEquals(true,value);
			} catch (Exception e) {
			e.getMessage();
			takeScreenShot("login_positive_tc_003");
		}
	}
	
	@Given("User enter  the Password")
	/*TC 004 - Validate that the user is able to enter password on the Password field*/
	public static void login_positive_tc_004() throws IOException {
		try {
			page_wait(10);
			click("login_link");
			page_wait(10);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",1));		
		     page_wait(10);
		} catch (Exception e) {
			e.getMessage();
			takeScreenShot("login_positive_tc_004");
		}
	}

	@When("User enters valid phonenumber and password and User click on login")
	/*TC 005 - Validate that the user User enters valid phonenumber and password and User click on login*/
	public static void login_positive_tc_005() throws IOException {		
		try {
			page_wait(10);
			field_clear("login_password");
			page_wait(10);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			click("login");
			page_wait(30);
		} catch (Exception e) {
			e.getMessage();
			takeScreenShot("login_positive_tc_005");
		}
		}
	
	@Given("User click on Logout")
	/*TC 006 - Validate that the user is navigated to 'Landing page' on clicking the 'Log out' option*/
	public static void login_positive_tc_006() throws Exception {
		try {
			page_wait(20);
			click("hamburger");
			page_wait(20);
		    click("logout");
			browser_back();
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_006");
		}
	}
}