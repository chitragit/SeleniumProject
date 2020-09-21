package pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='navbar cor_margin']/ul/li[1]")
	WebElement home;
	
	@FindBy(xpath="//div[@class='navbar cor_margin']/ul/li[2]")
	WebElement news;
	
	@FindBy(xpath="//div[@class='navbar cor_margin']/ul/li[3]")
	WebElement business;
	
	
	public WebElement home() {
		return home;
	}
	
	public WebElement news() {
		return news;
	}
	
	public WebElement business() {
		return business;
	}
}

