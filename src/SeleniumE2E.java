import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());

		//BYXPATH-- //tagname[@attribute=’value’]
		
		/*
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("chitra");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass123");
		driver.findElement(By.xpath("//input[contains(@value='Sign'])")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		 */
		
		
		
		//BYCSS-- tagname[attribute='value']
		
		driver.findElement(By.cssSelector("a[class='signin']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("chitra");
		driver.findElement(By.cssSelector("#password")).sendKeys("pass123");
		//driver.findElement(By.cssSelector("input[value*='Sign'")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Sign')]")).click();
		//driver.findElement(By.linkText("Forgot Password?")).click();		
		
	}

}
