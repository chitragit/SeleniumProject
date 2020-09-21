package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectrepo.HomePage;

public class HomeApp {

	@Test
	public void homeClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
	
		HomePage h = new HomePage(driver);
		h.home().click();
		Thread.sleep(2000);
		

		h.news().click();
		Thread.sleep(2000);

	
		driver.close();
	
	
	
	}
	
}

