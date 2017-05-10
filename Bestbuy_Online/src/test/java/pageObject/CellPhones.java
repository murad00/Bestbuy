package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CellPhones {
	
	private static WebElement element = null;	
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='level2Group4']/div/div/h2/a[text()='Cell Phones']")));
	}		
	
	public static WebElement link_iPhone(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='level2Group4']//a[text()='iPhone']"));
		return element;
	}
}
