package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {

	public static final String LOGOUT="//a[contains(text(),'Logout')]";
	
	

		//Submit
		public static WebElement getLogOut(WebDriver dr) {
	        WebElement wb = dr.findElement(By.xpath(LOGOUT));
	        return wb;
	    }
	    
	    public static void execute(WebDriver dr) {
	        getLogOut(dr).click();
	    }
		
	}
	

