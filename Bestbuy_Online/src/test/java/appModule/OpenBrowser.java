package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenBrowser {

	public static void OpenBestBuy(WebDriver driver){
		String baseUrl = "http://www.bestbuy.com/";
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		boolean popuppresent = driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).isDisplayed();
		if (popuppresent){
			driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).click();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
}
