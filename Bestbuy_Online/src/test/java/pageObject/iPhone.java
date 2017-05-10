package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iPhone {

	private static WebElement element = null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//h1[contains(text(),'iPhone')]")));
	}
	
	public static WebElement link_iPhone7plus(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='site-control-content']/div//a[contains(@data-track,'VisualNavigation_iPhone7Plus')]"));
		return element;
	}
}
