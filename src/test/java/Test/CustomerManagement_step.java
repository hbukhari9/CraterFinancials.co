package Test;

import org.junit.Assert;

import Utils.BrowserUtils;
import Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.DashboardPage;
import pages.CustomerPage;
public class CustomerManagement_step {
	BrowserUtils utils = new BrowserUtils();
	DashboardPage dashPage = new DashboardPage();
	CustomerPage customerPage = new CustomerPage();

	@When("I navigate to the customers tab")
	public void i_navigate_to_the_customers_tab() {
		utils.waitForElementToBeVisible(dashPage.customers_tab);
		dashPage.customers_tab.click();
		utils.waitForElementToBeVisible(customerPage.customer_page_Customers_TextHeader);
		Assert.assertTrue(customerPage.customer_page_Customers_TextHeader.isDisplayed());
	}
	@Then("I should see the New Customer button displayed")
	public void i_should_see_the_new_customer_button_displayed() {
		Assert.assertTrue(customerPage.customer_page_NewCustomerBTN.isDisplayed());
		
	}
		// @newCustomerBTNTest scenario end - 
		
		// @newCustomerBasicInfoFormLabel start - 
		@When("I click on the New Customer button")
		public void i_click_on_the_new_customer_button() {
			customerPage.customer_page_NewCustomerBTN.click();
			utils.waitForElementToBeVisible(customerPage.customer_page_NewCustomer_TextHeader);
			Assert.assertTrue(customerPage.customer_page_NewCustomer_TextHeader.isDisplayed());
		}
		@Then("I should see the Basic Info form label")
		public void i_should_see_the_basic_info_form_label() {
			utils.waitForElementToBeVisible(customerPage.customer_page_Basiv_info_form_Label);
			Assert.assertTrue(customerPage.customer_page_Basiv_info_form_Label.isDisplayed());
		}
		
		// @newCustomerBasicInfoFormLabel end - 
		
		// @newCustomerBasicInfoFields start -
		@Then("I should see the fields Display Name, Primary Contact Name, Email, Primary Currency, Website, and Prefix")
		public void i_should_see_the_fields_display_name_primary_contact_name_email_primary_currency_website_and_prefix() {
			utils.waitForElementToBeVisible(customerPage.customer_page_BasicInfo_DisplayName_Field);
			if(customerPage.customer_page_BasicInfo_DisplayName_Field.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Display Name Field visible, PASS");
			} else {
				Assert.assertTrue(false);
				System.out.println("Display Name Field not visible, FAIL");
			}
			Assert.assertTrue(customerPage.customer_page_BasicInfo_DisplayName_Field.isDisplayed());
			Assert.assertTrue(customerPage.customer_page_BasicInfo_PrimaryContactName_Field.isDisplayed());
			Assert.assertTrue(customerPage.customer_page_BasicInfo_Email_Field.isDisplayed());
			Assert.assertTrue(customerPage.customer_page_BasicInfo_PrimaryCurrency_Field.isDisplayed());
			Assert.assertTrue(customerPage.customer_page_BasicInfo_Website_Field.isDisplayed());
			Assert.assertTrue(customerPage.customer_page_BasicInfo_Prefix_Field.isDisplayed());
			Driver.quitDriver();
		}

		// @newCustomerBasicInfoFields end -
		
		// @newCustomerTableList start -
		@Then("I should see the Customer List Table")
		public void i_should_see_the_customer_list_table() throws InterruptedException {
			Thread.sleep(2000);
			
			if (customerPage.customer_page_NoCustomersYet_text.isDisplayed()) {
				customerPage.customer_page_NewCustomerBTN.click();
				utils.waitForElementToBeVisible(customerPage.customer_page_BasicInfo_DisplayName_Field);
				customerPage.customer_page_BasicInfo_DisplayName_Field.sendKeys("Student");
				customerPage.customer_page_NewCustomerSubmit_BTN.click();
				Thread.sleep(1000);
				dashPage.customers_tab.click();
//				Thread.sleep(1000);
				utils.waitForElementToBeVisible(customerPage.customer_page_Customers_TextHeader);
				Assert.assertTrue(customerPage.customer_page_CustomerTable.isDisplayed());
			} else {
				Assert.assertTrue(customerPage.customer_page_CustomerTable.isDisplayed());
			}
//			Driver.quitDriver();
		}
		
	   
}