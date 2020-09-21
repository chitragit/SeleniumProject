import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> linksId = driver.findElements(By.tagName("a"));
		
		System.out.println(linksId.size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		WebElement midDriver = 	footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> midLinks = midDriver.findElements(By.tagName("a"));
		
		
		for(int i=1; i<midLinks.size(); i++) {
			String cntrlclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			midLinks.get(i).sendKeys(cntrlclick);
			}
		
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> ids = winIds.iterator();
		
		//While(ids.hasNext)
		int i = 0;
		while(i<winIds.size()) {
			i++;
			driver.switchTo().window(ids.next());
			System.out.println(driver.getTitle());
		}
		
		
		

	}

}
