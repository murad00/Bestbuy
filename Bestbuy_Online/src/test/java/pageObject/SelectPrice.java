package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPrice {

	public static WebElement element = null;

	public static void WaitForElementPresenet(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[contains(text(),'Apple - iPhone 7 Plus 128GB')]")));
	}	
	
	public static WebElement button_RetailPrice(WebDriver driver) {
		element = driver.findElement(By.xpath(".//button[@data-track='adprice-unactivated']"));
		return element;
	}
	public static WebElement link_AddToCart(WebDriver driver){
		element = driver.findElement(By.xpath(".//a[contains(text(),'Add to Cart')]"));
		return element;
	}
}
