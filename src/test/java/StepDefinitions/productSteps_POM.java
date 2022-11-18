package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.productPage;
import pages.productsPage;

public class productSteps_POM {

	
	public static WebDriver driver;
	
	 public productSteps_POM() {
	        this.driver = Hooks.driver;
	    }
	 
	 
	    public void Sleep(int second) throws InterruptedException {
	        long time = second * 1000;
	        Thread.sleep(time);
	    }
	 
	
	
	@And("^I click add basket button$")
	public void clickAddBasket()  {
		productPage product = new productPage(driver);
		product.IfExistButtonCokies();
		product.clickAddBasket();
	}
	
	
	@And("^I click go to basket page$")
	public void clickGoToBasketPage() throws InterruptedException  {
		productPage product = new productPage(driver);
		Sleep(3);
		product.clickGoToBasketPage();
	}
	
	
}
