package Test;

import java.time.Duration;

import Utils.BrowserUtils;
import Utils.Driver;
import Utils.TestDataReder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class UserManagementTests {

	
		
		public static void main(String[] args) {
			//invalidEmailLoginTest();
			//invalidpasswordloginTest();
			
		}
		
		
		static BrowserUtils utils;
		static LoginPage loginpage;

		public static void invalidEmailLoginTest() {
			utils = new BrowserUtils();
			loginpage = new LoginPage();
			// invalid email login test
			// go to crater
			Driver.getDriver().get(TestDataReder.getProperty("appurl"));
			Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Driver.getDriver().manage().window().maximize();
			
			utils.waitForElementToBeVisible(loginpage.login_page_email_box);
			// click on login button without filling out the credential fields
			loginpage.login_page_login_btn.click();
			
			// then verify there are 2 fields required messages display
			utils.waitForAllElementsToBeVisible(loginpage.login_page_fieldRequired_Messages);
			if (loginpage.login_page_fieldRequired_Messages.size() == 2) {
				System.out.println("There are 2 required field messages displayed");
			}else {
				System.out.println("Something is wrong with required field messages.");
			}
			
			// enter invalid email yummy@primetechschool.com and valid password primetech@school
			utils.sendkeysWithActionsClass(loginpage.login_page_email_box, "yummy@primetechschool.com");
			//loginpage.login_page_email_box.sendKeys("yummy@primetechschool.com");
			utils.sendkeysWithActionsClass(loginpage.login_page_password_box, TestDataReder.getProperty("password"));
			//loginpage.login_page_password_box.sendKeys(TestDataReader.getProperty("password"));
			
			// click login button
			loginpage.login_page_login_btn.click();
			
			// then verify that an error message  "These credentials do not match our records." displays
			utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
			if (loginpage.login_page_invalidLogin_message.isDisplayed()) {
				System.out.println("Credential invalid Error message displayed");
			}else {
				System.out.println("Credential invalid Error message not displayed"); 
			}
		}
		public static void invalidpasswordloginTest(){
			utils = new BrowserUtils();
			loginpage = new LoginPage();

		//1. go to crater
			Driver.getDriver().get(TestDataReder.getProperty("appurl"));
			Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Driver.getDriver().manage().window().maximize();
		//2. click on login button without filling out the credential fields 
			loginpage.login_page_login_btn.click();
			
		//3. then verify there are 2 fields required messages display
			utils.waitForAllElementsToBeVisible(loginpage.login_page_fieldRequired_Messages);
			if (loginpage.login_page_fieldRequired_Messages.size() == 2) {
				System.out.println("There are 2 required field messages displayed");
			}else {
				System.out.println("Something is wrong with required field messages.");
			}
			//4. enter valid email dummy@primetechschool.com and invalid password primeschool
			utils.sendkeysWithActionsClass(loginpage.login_page_email_box, TestDataReder.getProperty("email"));
			utils.sendkeysWithActionsClass(loginpage.login_page_password_box, ("primeschool"));
			//5. click login button
			loginpage.login_page_login_btn.click();
			//6. then veirfy that an error message  "These credentials do not match our records." dis
			utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
			if (loginpage.login_page_invalidLogin_message.isDisplayed()) {
				System.out.println("Credential invalid Error message displayed");
			}else {
				System.out.println("Credential invalid Error message not displayed"); 
			}
		}
			
			@Given("As a user, I am on the login page")
			public void as_a_user_i_am_on_the_login_page() {
				Driver.getDriver().get("www.google.com");
				Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				Driver.getDriver().manage().window().maximize();
			}
			@When("I enter invalid user name and valid password")
			public void i_enter_invalid_user_name_and_valid_password() {
			}
			@When("Click on login button")
			public void click_on_login_button() {
			   
			



		}
}
