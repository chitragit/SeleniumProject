import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAssgnt {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
	/*	
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']//iframe")));
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("a[href*='sortable'")).click();

		
		Thread.sleep(2000);
		driver.quit();
		
	*/
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		WebElement topframe = driver.findElement(By.xpath("//frameset/frame[1]"));
		
		driver.switchTo().frame(topframe);
		
		WebElement midframe = driver.findElement(By.xpath("//frameset//frame[2]"));
		
		driver.switchTo().frame(midframe);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}
}
