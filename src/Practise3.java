import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("mal");
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).getText();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		String countryName = (String) js.executeScript("return document.getElementById(\"autocomplete\").value");
		
		int i=0;
		while(!countryName.equalsIgnoreCase("Malaysia")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			/*countryName = (String) js.executeScript("return document.getElementById(\"autocomplete\").value");*/
			countryName = driver.findElement(By.id("autocomplete")).getAttribute("value");
			if(i>15) {
				System.out.println("Element not found");
				break;
			}
		}
		System.out.println(countryName);
		driver.close();
		
		

	}

}
