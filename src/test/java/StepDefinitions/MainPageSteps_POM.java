package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.mainPage;


public class MainPageSteps_POM {
	
	
	
	public static WebDriver driver;
	
	
	 public MainPageSteps_POM() {
	        this.driver = Hooks.driver;
	        
	    }
	 
	 
	    public void Sleep(int second) throws InterruptedException {
	        long time = second * 1000;
	        Thread.sleep(time);
	    }
	 
	
	
	@And("^I fill (.*) searchbox on Main Page$")
	public void fillSearchBoxOnMainPage(String value) throws InterruptedException {
		mainPage main = new mainPage(driver);
		main.fillSearchBox(value);
		Sleep(5);
		main.ifExistNotificationButtonClick();
		main.clickSearchBox();
	}

}
