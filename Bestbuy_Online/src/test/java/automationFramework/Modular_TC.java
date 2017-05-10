package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModule.OpenBrowser;
//import appModule.SingInOption;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObject.BestbuyHomePage;
import pageObject.Cart;
import pageObject.CellPhones;
import pageObject.LearnAboutiPhone;
import pageObject.MyAccount;
import pageObject.Product;
import pageObject.SelectPrice;
import pageObject.SelectProduct;
import pageObject.SignInToAccount;
import pageObject.iPhone;

public class Modular_TC {

	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		OpenBrowser.OpenBestBuy(driver);
	}

	@Test
	public void test() throws Exception {
		MyAccount.WaitForElementPresent(driver);
		MyAccount.link_MyAccount(driver).click();
		MyAccount.button_SignIn(driver).click();
		SignInToAccount.WaitForElementPresent(driver);
		SignInToAccount.form_UserName(driver).sendKeys("murad00@yahoo.com");
		SignInToAccount.form_Password(driver).sendKeys("8016374@Bd");
		SignInToAccount.button_SignIn(driver).click();
		BestbuyHomePage.WaitForElementPresent(driver);
		BestbuyHomePage.link_Product(driver).click();
		Product.WaitForElementPresent(driver);
		Product.link_CellPhone(driver).click();
		CellPhones.WaitForElementPresent(driver);
		CellPhones.link_iPhone(driver).click();
		iPhone.WaitForElementPresent(driver);
		iPhone.link_iPhone7plus(driver).click();
		LearnAboutiPhone.WaitForElementPresent(driver);
		LearnAboutiPhone.button_iPhonePlusShopNow(driver).click();
		SelectProduct.WaitForElementPresent(driver);
		SelectProduct.link_SelectProductSprint(driver).click();
		SelectPrice.WaitForElementPresenet(driver);
		SelectPrice.button_RetailPrice(driver).click();
		SelectPrice.link_AddToCart(driver).click();
		Cart.WaitForElementPresent(driver);
		Cart.ValidateiPhone7(driver);
		//Cart.link_CheckOut(driver).click();
		//SingInOption.signIn_ReturningCustomer(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
