package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	public static final String USERNAME="//input[@placeholder='username']";
	public static final String PASSWORD="//input[@placeholder='password']";
	public static final String LOGIN="//input[@value='Log in']";

	
	
	// Username
		public static WebElement getUsername(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME));
			return wb;
		}

		public static void clickUsername(WebDriver dr) {
			getUsername(dr).click();
		}

		public static void sendKeysUsername(WebDriver dr, String str) {
			getUsername(dr).sendKeys(str);
		}
	
	// Password
		public static WebElement getPassword(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(PASSWORD));
			return wb;
		}

		public static void clickPassword(WebDriver dr) {
			getPassword(dr).click();
		}

		public static void sendKeysPassword(WebDriver dr, String str) {
			getPassword(dr).sendKeys(str);
		}

		//Log in
		public static WebElement getLogIn(WebDriver dr) {
	        WebElement wb = dr.findElement(By.xpath(LOGIN));
	        return wb;
	    }
	    
	    public static void clickLogIn(WebDriver dr) {
	        getLogIn(dr).click();
	    }
}
