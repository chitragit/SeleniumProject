import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");

		String[] neededVeg = { "Cucumber", "BeetRoot", "Tomato", "Brinjal" };
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		addItems(driver,neededVeg);
		driver.quit();

	}

	public static void addItems(WebDriver driver, String[] neededVeg) {
		// iterate through listed vegies
		// format listed veg name
		// compare with needed vegs
		// add to cart
		List<String> neededVegList = Arrays.asList(neededVeg);
		int j = 0;
		WebDriverWait w = new WebDriverWait(driver,5);
		
		List<WebElement> vegs = driver.findElements(By.cssSelector("h4.product-name"));
		// System.out.println(vegs.get(1).getText());

		for (int i = 0; i < vegs.size(); i++) {
			String[] listedVegArray = vegs.get(i).getText().split("-");
			String listedVeg = listedVegArray[0].trim();
			
			if (neededVegList.contains(listedVeg)) {
				driver.findElements(By.cssSelector(".product-action")).get(i).click();
				j++;
				if (j == neededVeg.length) {
					break;
				}
			}
		}
		
		//Proceed to checkout
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
}