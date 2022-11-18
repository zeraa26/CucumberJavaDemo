package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basketPage {

	
	
	WebDriver driver;

	By btn_lighting_text_ok = By.xpath("//span[@class='btn btnBlack']");

	By btn_buyItem = By.xpath("//*[.='Satın Al']");		
	
	
	public basketPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickLightingOK() {
		driver.findElement(btn_lighting_text_ok).click();
		System.out.println("Find and Clicked Lighting Text Button");
	}
	
	public void clickBuyItem() {
		driver.findElement(btn_buyItem).click();
		System.out.println("Find and Clicked Buy Item");
	}
	
	
	public void seeBasketPage() {
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		if(strUrl.equals("https://www.n11.com/sepetim")) {
			System.out.println("login page opened");
		}else {
			Assert.fail("MY PAGE IS DIFFERENT");
		}
	}
}
