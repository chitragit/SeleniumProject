package pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("login1");
	By pswd = By.id("password");
	By signIn = By.name("proceed");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(pswd);
	}

	public WebElement signIn() {
		return driver.findElement(signIn);
	}


}


