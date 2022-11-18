package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.mainPage;
import pages.productsPage;

public class productsSteps_POM {
	
	
	public static WebDriver driver;
	
	 public productsSteps_POM() {
	        this.driver = Hooks.driver;
	    }
	 
	 
	    public void Sleep(int second) throws InterruptedException {
	        long time = second * 1000;
	        Thread.sleep(time);
	    }
	 
	
	
	@And("^I see (.*) products page$")
	public void seeProductsPage(String value)  {
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		if(strUrl.equals("https://www.n11.com/arama?q="+value)) {
			System.out.println("my products page opened");
		}else {
			Assert.fail("MY PAGE IS DIFFERENT");
		}
	}
	
	@And("^I click first product item$")
	public void clickFirstProductItem() throws InterruptedException{
		productsPage products = new productsPage(driver);
		products.clickFirstProduct();
		Sleep(5);
		
	}



}
