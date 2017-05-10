package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObject.BestbuyHomePage;
import pageObject.MyAccount;
import pageObject.SignInToAccount;

public class POM_TC {

	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		String baseUrl = "http://www.bestbuy.com/";
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		boolean popuppresent = driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).isDisplayed();
		if (popuppresent){
			driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div/div/button[@aria-label='Close']")).click();
		}
	}
	@Test
	public void test(){
		//Home_page.WaitForElementPresent(driver);
		MyAccount.WaitForElementPresent(driver);
		MyAccount.link_MyAccount(driver).click();
		MyAccount.button_SignIn(driver).click();
		SignInToAccount.WaitForElementPresent(driver);
		SignInToAccount.form_UserName(driver).sendKeys("murad00@yahoo.com");
		SignInToAccount.form_Password(driver).sendKeys("8016374@Bd");
		SignInToAccount.button_SignIn(driver).click();
		BestbuyHomePage.link_Product(driver).isDisplayed();
		BestbuyHomePage.link_Brand(driver).isDisplayed();
		BestbuyHomePage.link_Deal(driver).isDisplayed();
		BestbuyHomePage.link_Service(driver).isDisplayed();
		BestbuyHomePage.link_Product(driver).click();		
	}
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}


