package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
	
	WebDriver driver;

	By txt_searchbox = By.id("searchData");
	
	By btn_searchBtn = By.xpath("//span[@class='searchBtn' or @class='iconsSearch']");
	
	By btn_notificationAfterThen = By.xpath("(//button[.='Daha Sonra'])[1]");
	
	public mainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillSearchBox(String value) {
		driver.findElement(txt_searchbox).sendKeys(value);
	}
	
	public void clickSearchBox() {
		driver.findElement(btn_searchBtn).click();
	}
	
	public void ifExistNotificationButtonClick() {
		try {
			driver.findElement(btn_notificationAfterThen).click();
			System.out.println("opened notification and clicked");
		}catch(Exception ee) {
			// DO NOTHING
			System.out.println("could not open notification");
		}
		
	}
	
}
