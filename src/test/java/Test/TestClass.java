package Test;

import java.time.Duration;

import Utils.Driver;
import Utils.TestDataReder;
import pages.AmazonHomepage;

public class TestClass {
	
public static void main(String[]arg) {
	// in order to read something from the env.properties, 
			// we need to use the utility class TestDataReader to read with the key.
			
			Driver.getDriver().get(TestDataReder.getProperty("amazonurl"));
			Driver.getDriver().manage().window().maximize();
			Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			// in order to use the page objects stored in the page classes, 
			// we need to create an object of that class, then call the web element object for use.
			AmazonHomepage azpage = new AmazonHomepage();
			azpage.amazonSearchBox.sendKeys("Coffee mug");
			azpage.amazonSearchButton.click();
}

}
