package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
	
	WebDriver driver;

	By btn_addBasket = By.xpath("(//button[@title='Sepete Ekle'])[1]");
	
	By btn_acceptCokie = By.xpath("(//*[@class='setCookieBtn pickAll'])[2]");
	
	By btn_goToBasketPage = By.xpath("//*[@title='Sepete Git']");
			
	
	
	public productPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAddBasket() {
		driver.findElement(btn_addBasket).click();
		System.out.println("Find and Clicked Add Basket Button");
	}
	
	public void IfExistButtonCokies() {
		try {
			driver.findElement(btn_acceptCokie).click();
			System.out.println("opened cokies and clicked");
		}catch(Exception ee) {
			// DO NOTHING
			System.out.println("could not open cokies");
		}
	}
	
	public void clickGoToBasketPage() {
		driver.findElement(btn_goToBasketPage).click();
		System.out.println("Find and Clicked Go To Basket Button");
	}

}
