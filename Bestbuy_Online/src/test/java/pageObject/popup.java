package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class popup {

	//private static WebElement element = null;

	public static void popUp(WebDriver driver){
		boolean popuppresent = driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).isDisplayed();
		if (popuppresent){
			driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).click();
		}
	}
}


