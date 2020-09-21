import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsAssgnmnt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,5);
	
	driver.manage().window().maximize();
	
	WebElement signIn = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	
	Actions a = new Actions(driver);
	
	//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("toys").doubleClick().build().perform();
	
	a.moveToElement(signIn).contextClick().build().perform();
	
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	Iterator<String> id = ids.iterator();
	System.out.println(id);
	
	String parent = id.next();
	String child = id.next();
	
	
	
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@name='signIn']//div//div//div//h1")));
	
	driver.findElement(By.xpath("//form[@name='signIn']//div//div//div//h1")).click();
	
	driver.switchTo().window(parent);
	
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[id='twotabsearchtextbox']")));
	
	System.out.println("parent"+ driver.getTitle());
	driver.close();
	
	}
	
}
