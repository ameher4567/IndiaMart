package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import baseClass.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjectModel.FirstPage;
import pageObjectModel.HomePage;

public class VerifyLogIn extends BaseClass{

	//BaseClass baseObj= new BaseClass();
	Utilities util = new Utilities();
	HomePage hp = new HomePage();
	FirstPage fp= new FirstPage();
	
	
	@Given("^I am present on IndiaMart Homepage$")
	public void goToHomePage() {
		hp.openHomePage();
	}
	
	@When("I enter mobile no in the first page")
	public void i_enter_mobile_no_in_the_first_page() throws Exception {
		util.waitForSeconds(3);
	    fp.getMobileNoInput().sendKeys(util.getPropertyFromFile("mobileNo"));
	}

	@When("i click on Sign in button")
	public void i_click_on_sign_in_button() throws Exception {
	    fp.getSignInButton().click();
	    util.waitForSeconds(5);
	}
	
	
	@When("^I click on UserLogin$")
	public void clickOnUserLogin() throws Exception {
		hp.getUserButton().click();
	}
	
	//@And("^I enter mobile no$")
	//public void enterMobileNo() throws Exception {
		//hp.enterMobileNo().sendKeys(util.getPropertyFromFile("mobileNo"));;
		
	//}
	
	//@And("^I click on submit$")
	//public void clickOnSubmit() throws Exception {
		//hp.ClickOnSubmitAfterMob().click();
		
	//}//
	
	@And("^I move to profile$")
	public void clickOnProfile() throws Exception {
		WebElement profile = hp.clickOnProfile() ;
		util.hoverOveElement(profile);
		
	}
	
	@Given("I wait for {int} seconds")
	public void i_wait_for_seconds(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    util.waitForSeconds(int1);
	}
	
	@And("^I click on view Profile$")
	public void clickOnViewProfile() throws Exception {
		hp.clickOnViewProfile().click();
	}
	
	@And("^i click on Login Password$")
	public void clickOnLoginassword() throws Exception {
		hp.loginWithPassword().click();
		
	}
	
	@And("^I enter password$")
	public void enterpassword() throws Exception {
		//util.hoverOveElement(hp.enterPassword());
		//visibilityOfElementLocated(By.xpath("//*[@id='usr_pass']")));
		//util.explicitlyWait(hp.enterPassword());
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='usr_pass']")));
		util.staleElement(hp.enterPassword());
		//String decodedPassword = util.decodePassword(util.getPropertyFromFile("encodedPassword"));
		hp.enterPassword().sendKeys(util.getPropertyFromFile("Password"));
	}
	
	@And("^I click on Login with password$")
	public void clickOnLogInWithPassword() throws Exception {
		hp.loginWithPassword().click();
		
	}
	
	@And("^i will logged into my profile successfully$")
	public void LoggedInSuccessfully() {
		WebElement chk = BaseClass.driver.findElement(By.xpath("//*[contains(text(),'8598873319')]"));
		String result = chk.getText();
		Assert.assertEquals(result, "8598873319");
		//if(result.equals("8598873319")) {
			
			System.out.println("Successfully logged into INDIA MART");
		}
		
	}
	


