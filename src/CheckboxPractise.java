import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());		
		
		WebElement chkbox1 = driver.findElement(By.id("checkBoxOption1"));
		Assert.assertFalse(chkbox1.isSelected());
		chkbox1.click();
		Thread.sleep(2000);
		Assert.assertTrue(chkbox1.isSelected());
		
		driver.quit();
	
	 
	}

}
