import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(5000);
		 
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]//label")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]"));
		//driver.findElement(By.cssSelector("DayPicker-Months.DayPicker-Month:nth-child(1)"));
		
		String day = "september";
		
		String dayCap = day.substring(0,3);
		String dayConv = dayCap.substring(0, 1).toUpperCase() + dayCap.substring(1);
		String date = "30";
		
		WebElement dayCaption1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"));
		WebElement dayCaption2 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/div"));
		
		while(true) {
		if(dayCaption1.getText().toLowerCase().contains(day.toLowerCase())){
			dayPick(driver,dayConv);
			break;
		}
		else if(dayCaption2.getText().toLowerCase().contains(day.toLowerCase())) {
			dayPick(driver,dayConv);
			break;
		}
		else {
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		}
		
		
		//driver.findElement(By.xpath("//div[contains(@aria-label,'Jul 03')]"));
		}

	public static void dayPick(WebDriver driver,String dayConv) 
	{
		
		
		List<WebElement> dayPicker = driver.findElements(By.xpath("//div[contains(@aria-label,"+dayConv+")]/div/p[1]"));
	
	
	for(int i=0; i <dayPicker.size();i++) {
		
		if(dayPicker.get(i).getText().equalsIgnoreCase("3")) {
			dayPicker.get(i).click();
			break;
		}
	}
	}
	}
	


	