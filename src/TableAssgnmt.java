import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssgnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		int tableRows = driver.findElements(By.cssSelector("table[id=product] tbody tr")).size();		
		//table[@id='product']/tbody/tr
		
		int tableCols = driver.findElements(By.cssSelector("table[id=product] tbody tr:nth-child(1) th")).size();
		
		System.out.println("Total rows "+tableRows);
		System.out.println("Total Cols "+ tableCols);
		//second row output 

		String secondRow = driver.findElement(By.cssSelector("table[id=product] tbody tr:nth-child(3)")).getText();
		System.out.println(secondRow);
		//driver.close();

	}

}
