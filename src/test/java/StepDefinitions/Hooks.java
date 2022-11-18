package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Hooks {
	
	 public static WebDriver driver = null;
	
	 
		@Given("Open Chrome Browser")
		public void openChromeBrowser() {
		    String projectPath = System.getProperty("user.dir");
		    System.out.println("Project Path is :" + projectPath);
		    System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    System.out.println("Chrome Browser Is Opened");
		    driver.manage().window().maximize();
		}
		

	   @After
	    public void close_browser() {
	        driver.close();
	        driver.quit();
	    }

}
