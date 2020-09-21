import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.print("hello");
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\driver\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://google.com/");
//		System.out.println(driver.getTitle());
//		
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://google.com");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.get("https://twitter.com");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
	}

}
