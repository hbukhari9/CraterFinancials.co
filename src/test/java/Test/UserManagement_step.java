package Test;

import org.junit.Assert;

import Utils.BrowserUtils;
import Utils.TestDataReder;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class UserManagement_step {
	
	
	BrowserUtils utils = new BrowserUtils();
	LoginPage loginpage = new LoginPage();
	
//invalid email login attempt - start
	@When("I enter invalid username and valid password")
	public void i_enter_invalid_username_and_valid_password() {
		utils.sendkeysWithActionsClass(loginpage.login_page_email_box, "yummy@primetechschool.com");
		utils.sendkeysWithActionsClass(loginpage.login_page_password_box, TestDataReder.getProperty("password"));
	}

	@Then("I should see an error message {string} displays")
	public void i_should_see_an_error_message_displays(String errorMessage) {
	    utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
	    Assert.assertEquals(errorMessage, loginpage.login_page_invalidLogin_message.getText());
	    Assert.assertEquals(5, 5);
	}

	@Then("I should not be logged in")
	public void i_should_not_be_logged_in() {
	   Assert.assertTrue(loginpage.login_page_login_btn.isDisplayed());
	}
	// invalid email login attempt - end
}
