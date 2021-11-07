package baseClass;

import java.io.FileReader;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	// BaseClass baseObj = new BaseClass();

	public void mouseHover(WebElement wb) {
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(wb);

	}

	public void actionOnElement(WebElement wb) {

		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(wb);
	}

	public void holdOnElement(WebElement wb) {

		Actions act = new Actions(BaseClass.driver);
		act.clickAndHold(wb);
	}

	public void staleElement(WebElement wb) {
		//BaseClass.driver.navigate().refresh();
		System.out.println(wb.getText());
		try {
			Actions act = new Actions(BaseClass.driver);
			act.moveToElement(wb);
		} 
		catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}

	}

	public void explicitlyWait(WebElement wb) {

		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			;
		}
	}

	public String getPropertyFromFile(String key) throws Exception {

		Properties p = new Properties();
		try {
			p.load(new FileReader("resources//application.properties"));
			String str = p.getProperty(key);
			// String position = str.toString();
			return str;
		} catch (Exception e) {
			throw new Exception("Unable to locate element");
		}

	}
	
	public void hoverOveElement(WebElement e) {
		new WebDriverWait(BaseClass.driver, 20).until(ExpectedConditions.elementToBeClickable(e)).click();
		
	}
	
	
	
	public String decodePassword(String encoded) {
		System.out.println("decoding " + encoded);
		//byte[] decoded;
		Base64 b = new Base64();
		byte[] decodedBytes = b.decode(encoded);
		System.out.println("Decode successful" + decodedBytes.toString());
		return decodedBytes.toString();
	}

}
