package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProduct {

	private static WebElement element = null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//h1[contains(text(),'iPhone 7 Plus')]")));
	}	
	
	public static WebElement link_SelectProductSprint(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='main-results']/div//h4/a[contains(text(),'Apple - iPhone 7 Plus 128GB - (PRODUCT)RED (Sprint)')]"));
		return element;
	}
}
