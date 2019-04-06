package page.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class LogInTest {
	// method inputs username and password from excel file and clicks log button
	// method is used with page.tests.RegistrationPageTest.execute method
	public static void execute(WebDriver dr, int i) throws IOException, Exception {
		utility.ExcelUtility.setExcelFile(utility.ExcelUtility.pathToExcelFile, 0);
		
		page.objects.LogIn.clickUsername(dr);
		page.objects.LogIn.sendKeysUsername(dr, utility.ExcelUtility.getCellData(i, 2));
		
		page.objects.LogIn.clickPassword(dr);
		page.objects.LogIn.sendKeysPassword(dr, utility.ExcelUtility.getCellData(i, 4));
		
		page.objects.LogIn.clickLogIn(dr);

	}
	// method inputs username and password inputed by user
	// method is used with page.tests.RegistrationPageTest.executeScanner method
	public static void execute2(WebDriver dr) {
		page.objects.LogIn.clickUsername(dr);
		page.objects.LogIn.sendKeysUsername(dr, page.tests.RegistrationPageTest.username);
		
		page.objects.LogIn.clickPassword(dr);
		page.objects.LogIn.sendKeysPassword(dr, page.tests.RegistrationPageTest.password);
		
		page.objects.LogIn.clickLogIn(dr);
	}
	}
