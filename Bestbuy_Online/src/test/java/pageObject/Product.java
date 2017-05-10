package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {
	
	private static WebElement element = null;	
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//h2[text()='All Categories']")));
	}	
	
	public static WebElement link_CellPhone(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='level2Menu4']/a[text()='Cell Phones']"));
		return element;
	}
}
