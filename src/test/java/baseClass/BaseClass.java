package baseClass;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

	public static WebDriver driver;

	public static WebElement getElement(String key) throws Exception{
		Properties p = new Properties();
		try{
			//System.out.println("reading : : '" + key + "'");
			//new Utilities().waitForSeconds(3);;
			p.load(new FileReader("elementLocators\\elementLocator.properties"));
			String str = p.getProperty(key);
			String[] position = str.split(":");
			//System.out.println("read");
			if (position[0].equals("xpath")) {
				return driver.findElement(By.xpath(position[1]));
			}
			else if (position[0].equals("id")) {
				return driver.findElement(By.id(position[1]));
			}
			else if (position[0].equals("class")) {
				return driver.findElement(By.className(position[1]));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to locate element : : "  + key);
		}
		return null;
	}
}
