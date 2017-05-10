package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAboutiPhone {

	private static WebElement element = null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='site-control-content']/div//p/a[contains(@data-track,'LP_iPhone_7_Plus')][text()='Shop Now']")));
	}	
	
	public static WebElement button_iPhonePlusShopNow(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='site-control-content']/div//p/a[contains(@data-track,'LP_iPhone_7_Plus')][text()='Shop Now']"));
		return element;	  
	}
}
