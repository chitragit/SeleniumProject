import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleartripE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("Adults")).click();
		
		Select adultdd = new Select(driver.findElement(By.id("Adults")));
		adultdd.selectByValue("5");
		
		
		driver.findElement(By.id("Childrens")).click();		
		Select childd = new Select(driver.findElement(By.id("Childrens")));
		childd.selectByValue("2");
		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("INDIGO");
		driver.findElement(By.id("SearchBtn")).click();
		
		driver.quit();
	}

}
