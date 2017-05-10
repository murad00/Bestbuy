package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestbuyHomePage{

	private static WebElement element = null;

	public static void WaitForElementPresent (WebDriver driver) throws Exception{
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//a[text()='Products']")));
	}	
	
	public static WebElement link_Product(WebDriver driver){
		element = driver.findElement(By.xpath(".//a[text()='Products']"));
		return element;
	}
	public static WebElement link_Brand(WebDriver driver){
		element = driver.findElement(By.id("menu1"));
		return element;
	}
	public static WebElement link_Deal(WebDriver driver){
		element = driver.findElement(By.id("menu2"));
		return element;
	}
	public static WebElement link_Service(WebDriver driver){
		element = driver.findElement(By.id("menu3"));
		return element;
	}	
}
