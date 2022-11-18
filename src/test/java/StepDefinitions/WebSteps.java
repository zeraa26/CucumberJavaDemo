package StepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import io.cucumber.java.en.And;

public class WebSteps {
	
	
	public static WebDriver driver;
	private String Application = "https://www.n11.com";
	
	 public WebSteps() {
	        this.driver = Hooks.driver;
	     
	    }
	 
	 @And("^I open to my application$")
	    public void openToApplication()  {
		 try {
			  driver.navigate().to(Application);
		 }catch (Exception ee) {
			Assert.fail("COULD NOT OPEN APPLICATION");
		 }
	 		}
	 
	 
	   @And("^switch to new window$")
	    public void switchTab() {
	        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs2.get(1));
	    }
}

