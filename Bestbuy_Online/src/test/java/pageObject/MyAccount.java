package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#profileMenuWrap1")));
	}
	public static WebElement link_MyAccount (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#profileMenuWrap1"));
		return element;
	}
	public static WebElement button_SignIn (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='profileMenu1']/a[text()='Sign In']"));
		return element;
	}
}
