package pageObjectModel;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class FirstPage {

		String mobileNoLoc="firstpage.mobno.input";
		String signIButton="firstpage.signin.button";
		
	public WebElement getMobileNoInput() throws Exception {
		return BaseClass.getElement(mobileNoLoc);
		
	}
	
	public WebElement getSignInButton() throws Exception {
		return BaseClass.getElement(signIButton);
		
	}
	
}
