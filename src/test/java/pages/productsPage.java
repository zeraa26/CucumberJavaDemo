package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productsPage {

	
	WebDriver driver;

	By img_firstProduct = By.xpath("(//img[@class='lazy cardImage'])[1]");
	
	
	
	
	public productsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickFirstProduct() {
		driver.findElement(img_firstProduct).click();
		System.out.println("Find and Clicked First Product Item");
	}
	
}
