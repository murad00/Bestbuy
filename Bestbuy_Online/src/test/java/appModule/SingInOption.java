package appModule;

import org.openqa.selenium.WebDriver;

import pageObject.PageSignIn;

public class SingInOption {
	
	public static void signIn_ReturningCustomer (WebDriver driver) {
		PageSignIn.WaitForElementPresent(driver);
		PageSignIn.form_EmailAddress(driver).sendKeys("Email");
		PageSignIn.form_Password(driver).sendKeys("Password");
		PageSignIn.button_SignIn(driver).click();
		System.out.println("Login Successfull.");
	}

}
