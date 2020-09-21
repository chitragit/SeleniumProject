import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//div[@id='content']//div//a")).click();
		
		
		Set<String> winIds = driver.getWindowHandles();

		Iterator<String> it = winIds.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		System.out.println("child win - " + driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		System.out.println("Parent win - " + driver.getTitle());
		
			driver.quit();
	}

}
