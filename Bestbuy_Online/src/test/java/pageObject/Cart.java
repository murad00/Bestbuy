package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart {

	private static WebElement element = null;

	public static void WaitForElementPresent (WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//h1[contains(text(),'Your Cart')]")));
	}

	public static void ValidateiPhone7(WebDriver driver) {
		boolean iphoneLink = driver.findElement(By.xpath(".//a/span[contains(text(),'Apple - iPhone 7')]")).isDisplayed();
		Assert.assertTrue(iphoneLink);		
	}
	
	public static WebElement link_CheckOut(WebDriver driver){
		driver.findElement(By.xpath(".//div[@id='order-summary']//a[text()='Checkout']"));
		return element;
	}
}
