package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	
	@FindBy (linkText = " Dashboard")
	public WebElement dashboard_tab;
	
	@FindBy (xpath = "//a[text()=' Customers']")
	public WebElement customers_tab;
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement items_tab;
	
	@FindBy (xpath = "//p[text()='Logged in successfully.']")
	public WebElement loggedInSuccess_message;
}
