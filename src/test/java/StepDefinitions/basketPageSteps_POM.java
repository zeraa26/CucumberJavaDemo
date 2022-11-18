package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.basketPage;
import pages.mainPage;

public class basketPageSteps_POM {
	
	public static WebDriver driver;
	
	
	 public basketPageSteps_POM() {
	        this.driver = Hooks.driver;
	        
	    }
	 
	 
	    public void Sleep(int second) throws InterruptedException {
	        long time = second * 1000;
	        Thread.sleep(time);
	    }
	 
	
	
	@And("^I click lighting text ok button$")
	public void clickLightingTextOkButton() throws InterruptedException {
		basketPage basket = new basketPage(driver);
		Sleep(3);
		basket.clickLightingOK();
	}
	
	@And("^I click buy item$")
	public void clickBuyItem() throws InterruptedException {
		basketPage basket = new basketPage(driver);
		Sleep(1);
		basket.clickBuyItem();
	}
	
	
	
	@And("^I see basket page$")
	public void seeBasketPage() throws InterruptedException {
		basketPage basket = new basketPage(driver);
		basket.seeBasketPage();
		
	}


}
