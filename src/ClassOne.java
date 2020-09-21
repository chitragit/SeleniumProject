import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("chitra");;
		driver.findElement(By.cssSelector("#password")).sendKeys("123");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
