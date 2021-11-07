package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	//BaseClass baseObj = new BaseClass();
	@Before(order=0)
	public static void initialiseDriver() {
		 //System.out.println("Before");
		 System.setProperty("webdriver.chrome.driver", "C:\\Project\\Chrome\\chromedriver.exe");
		 BaseClass.driver= new ChromeDriver();
		 BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 BaseClass.driver.manage().window().maximize();
	}
	

	@After(order=0)
	public static void destroyDriver() {
		BaseClass.driver.quit();
	}
}
