package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInToAccount {

	private static WebElement element = null;

	public static void WaitForElementPresent (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/section/main//div/h1[text()='Sign In to BestBuy.com']")));
	}
	public static WebElement form_UserName (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='fld-e'][@type='email']"));
		return element;
	}
	public static WebElement form_Password (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='fld-p1'][@type='password']"));
		return element;
	}
	public static WebElement button_SignIn (WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/section/main//div/form/button[@type='submit']"));
		return element;
	}	
}
