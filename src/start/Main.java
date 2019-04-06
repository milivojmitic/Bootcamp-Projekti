package start;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.tests.MakeAPost;
import page.tests.TestRegistration;

public class Main {

	public static void main(String[] args) throws IOException, Exception {
		
		// webDriver creation
		WebDriver dr= new ChromeDriver();
		// method opens homepage
		page.objects.HomePage.open(dr);
		dr.manage().window().maximize();
		// this method uses data from excel file or testers input via scanner and register users,
		// then checks if user can log in and outputs message in console
		TestRegistration.executeTest(dr);
		
		
		
		
	}

}
