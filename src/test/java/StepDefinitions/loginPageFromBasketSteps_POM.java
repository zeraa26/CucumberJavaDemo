package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.loginPageFromBasket;
import pages.mainPage;

public class loginPageFromBasketSteps_POM {

	
	public static WebDriver driver;
	
	 public loginPageFromBasketSteps_POM() {
	        this.driver = Hooks.driver;
	    }
	 
	 
	    public void Sleep(int second) throws InterruptedException {
	        long time = second * 1000;
	        Thread.sleep(time);
	    }
	 
	
	
	@And("^I see login page from basket page$")
	public void seeLoginPageFromBasket()  {
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		if(strUrl.equals("https://www.n11.com/sepetim")) {
			System.out.println("login page opened");
		}else {
			Assert.fail("MY PAGE IS DIFFERENT");
		}
	}
	
	

	@And("^I fill (.*) username and (.*) password$")
	public void fillUsernameAndPassword(String username, String password) throws InterruptedException {
		loginPageFromBasket loginPageFromBasket = new loginPageFromBasket(driver);
		Sleep(1);
		loginPageFromBasket.fillUsername(username);
		Sleep(1);
		loginPageFromBasket.fillPassword(password);
	}
	
	@And("^I click login button$")
	public void clickLoginButton() throws InterruptedException {
		loginPageFromBasket loginPageFromBasket = new loginPageFromBasket(driver);
		Sleep(2);
		loginPageFromBasket.clickLoginBtn();
	}
	
	

}
