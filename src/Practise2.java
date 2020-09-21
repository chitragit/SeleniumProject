import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement chkbox = driver.findElement(By.xpath("//div[@id='checkbox-example'] //label[3]"));
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		
		String chkboxlbl = chkbox.getText();
		System.out.println(chkboxlbl);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(5000);
		
		
		Select dropdwn = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdwn.selectByVisibleText(chkboxlbl);
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("name")).sendKeys(chkboxlbl);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertmsg = driver.switchTo().alert().getText();
		if(alertmsg.contains(chkboxlbl)) {
			System.out.println(chkboxlbl+ " is present in alert");
		}
		
		driver.switchTo().alert().accept();

	}

}
