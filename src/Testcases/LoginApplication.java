package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectrepo.LoginPage;

public class LoginApplication {
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage loginObj = new LoginPage(driver);
		loginObj.username().sendKeys("chitra");
		loginObj.password().sendKeys("123456");
		loginObj.signIn().click();

	}

}
