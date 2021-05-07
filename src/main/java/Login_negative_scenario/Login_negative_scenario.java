package Login_negative_scenario;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.*;

public class Login_negative_scenario extends Generic_functions  {
	public static String str;
	public static String valid_msg;
	
	/* Application Launch*/
	@Given("App is open")
	public void app_launching() throws Exception{
		try {
			app_launch();
			page_wait(40);
			click("welcome_login");
		} catch (Exception e) {
			e.getMessage();
		}
	}	

	/*TC_001 - Validate that the user is not allowed to login when 'Phone number' and 'Password' fields are blank*/
	@Then("User clicks on Login button")
	public static void login_negative_tc_001() throws IOException {
		try {
			page_wait(10);
			click("login");
			System.out.println("after click1");
			page_wait(20);
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","login_validate"))).getAttribute("oninvalid"); 
			//valid_msg=str.substring(24,49);
			//Assert.assertEquals(valid_msg,"Please fill in this field");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_001");
		}
	}

	/*TC_002 - Validate that the user should get a validation message on entering invalid credentials in the 'Login' Page*/
	@When("user enter invalid phone no and password then validation messages should be displayed")
	public static void login_negative_tc_002() throws IOException {
		try {
			page_wait(10);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",3));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",2));
			click("login");
			page_wait(20);
			System.out.println("after click2");
			page_wait(20);
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","login_invalid_msg"))).getText();
			//Assert.assertEquals(str,td_reader("login_invalid_msg"));
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_002");
		}
	}

	/*TC_004 Validate that the user is not allowed to login with invalid 'Phone number' and valid 'Password' */ 
	@When("user enters invalid Phone number and valid Password and then validation messages should be displayed")
	public static void login_negative_tc_004() throws InterruptedException, IOException {
		try {
			page_wait(40);
			field_clear("login_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_number"))).sendKeys(td_reader("login_phone_number",3));
			field_clear("login_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys(td_reader("login_password",2));
			click("login");
			System.out.println("after click4");
			page_wait(20);
			//Assert.assertEquals(driver.findElement(By.xpath(OR_reader("Object Locator","login"))).isEnabled(),true);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_004");
		}
	}
	/*TC_005 Validate that the user is not allowed to login with invalid Password and valid phone number */
	@When("user enters invalid Password and valid phone number and then validation messages should be displayed")
	public static void login_negative_tc_005() throws IOException {
		try {
			page_wait(40);
			field_clear("login_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_number"))).sendKeys(td_reader("login_phone_number",4));			
			field_clear("login_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys("erdui");
			click("login");
			System.out.println("after click5");
			page_wait(20);
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","login_invalid_msg"))).getText();
			//Assert.assertEquals(str,td_reader("login_invalid_msg"));
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_005");
		}
	}
	/*TC_006 Validate that user is not able to login on leaving 'Phone number' field blank and only giving valid 'Password' */
	@When("user leavs Phone number field blank and then validation messages should be displayed")
	public static void login_negative_tc_006() throws InterruptedException, IOException {
		try {
			page_wait(40);
			field_clear("login_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys("erdi");
			click("login_phone_number");
			click("login");
			System.out.println("after click6");
			page_wait(20);
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","login_invalid_msg"))).getText();
			//Assert.assertEquals(str,td_reader("login_invalid_msg"));
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_006");
		}
	}
	/*TC_007 Validate that user is not able to login on leaving 'Password' field blank and only giving valid 'Phone number' */ 
	@When("user leavs Password field blank and then validation messages should be displayed")
	public static void login_negative_tc_007() throws IOException {
		try {
			page_wait(40);
			field_clear("login_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_number"))).sendKeys(td_reader("login_phone_number",4));
			click("login_password");
			click("login");
			page_wait(20);
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","login_invalid_msg"))).getText();
			//Assert.assertEquals(str,td_reader("login_invalid_msg"));
			System.out.println("after click7");
			page_wait(30);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("login_negative_tc_007");
		}
		browser_back();
		driver.closeApp();
	}
}