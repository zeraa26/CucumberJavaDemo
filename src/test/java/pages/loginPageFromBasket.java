package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageFromBasket {
	
	
	WebDriver driver;

	By txt_username = By.id("email");
	
	By txt_password = By.id("password");
	
	By txt_loginBtn = By.id("loginButton");

	
	
	
	public loginPageFromBasket(WebDriver driver) {
		this.driver = driver;
	}

	public void fillUsername(String value) {
		driver.findElement(txt_username).sendKeys(value);
	}

	public void fillPassword(String value) {
		driver.findElement(txt_password).sendKeys(value);
	}
	
	public void clickLoginBtn() {
		driver.findElement(txt_loginBtn).click();
		System.out.println("Find And Clicked Login Button");
	}
}
