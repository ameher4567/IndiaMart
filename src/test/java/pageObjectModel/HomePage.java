package pageObjectModel;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.Utilities;

public class HomePage {
	//BaseClass baseObj = new BaseClass();
	Utilities util = new Utilities();
	String userButtonLocator = "homePage.userSignIn";

	public void openHomePage() {
		BaseClass.driver.get("https://my.indiamart.com/");
	}

	public WebElement getUserButton() throws Exception {
		return BaseClass.getElement(userButtonLocator);

	}

	public WebElement clickOnPartialLogin() throws Exception {
		return BaseClass.getElement("homePage.partialLogin");
	}

	public WebElement enterMobileNo() throws Exception {
		return BaseClass.getElement("homePage.userid");
	}

	public WebElement ClickOnSubmitAfterMob() throws Exception {
		return BaseClass.getElement("homePage.logIn");
	}

	public WebElement clickOnProfile() throws Exception {
		return BaseClass.getElement("homePage.profile");
	}

	public WebElement clickOnViewProfile() throws Exception {
		return BaseClass.getElement("homePage.viewProfile");
	}

	public WebElement loginWithPassword() throws Exception {
		return BaseClass.getElement("homePage.clickOnPassword");
	}

	public WebElement enterPassword() throws Exception {
		return BaseClass.getElement("homePage.enterPassword");
	}

	public WebElement finalLogin() throws Exception {
		return BaseClass.getElement("homePage.logInPassword");
	}

	public WebElement logOut() throws Exception {
		return BaseClass.getElement("homePage.logOut");
	}

}
