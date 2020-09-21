import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Practise4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//chrome profile
		DesiredCapabilities d = DesiredCapabilities.chrome();
		d.setAcceptInsecureCerts(true);
		
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//locale chrowser option
		
		ChromeOptions ch = new ChromeOptions();
		ch.merge(d);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(ch);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\screenhot.png");
		FileUtils.copyFile(src, dest );
		
	}

}
