package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class AmazonHomepage {
  

public AmazonHomepage() {
	PageFactory.initElements(Driver.getDriver(),this);
}
	@FindBy (id = "twotabsearchtextbox")
	public WebElement amazonSearchBox;
	
	@FindBy (xpath = "//*[@id=\"nav-search-submit-button\"]")
	public WebElement amazonSearchButton;
}

