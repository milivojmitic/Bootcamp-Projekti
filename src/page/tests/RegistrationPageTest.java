package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utility.ExcelUtility;
import page.objects.LogOut;
import page.objects.RegistrationPage;

public class RegistrationPageTest {
	public static String username;
	public static String password;

	// method asks for input from user and then execute with inputed data
	public static void executeScanner(WebDriver dr) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String name = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter username: ");
		username = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter password: ");
		password = sc.nextLine();

		RegistrationPage.getFirstName(dr).click();
		RegistrationPage.getFirstName(dr).sendKeys(name);

		RegistrationPage.getLastName(dr).click();
		RegistrationPage.getLastName(dr).sendKeys(lastName);

		RegistrationPage.getUsername(dr).click();
		RegistrationPage.getUsername(dr).sendKeys(username);

		RegistrationPage.getEmail(dr).click();
		RegistrationPage.getEmail(dr).sendKeys(email);

		RegistrationPage.getPassword(dr).click();
		RegistrationPage.getPassword(dr).sendKeys(password);

		Thread.sleep(2000);
		RegistrationPage.clickRegister(dr);
		LogInTest.execute2(dr);

		// this part checks out if user is successfully registered
		try {
			if (dr.getCurrentUrl().equals("http://localhost/izlet/dashboard.php"))
				System.out.println("Korisnik " + name + " je uspesno registrovan!");
			else
				System.out.println("Korisnik " + name + " nije registrovan!");

			switchPackage.Switch.scenarios(dr);
		} catch (Exception e) {
			dr.quit();
		}

	}

	// method fills data from excel file and click on register button and then
	// inputs user data and log in
	public static void execute(WebDriver dr) throws IOException, Exception {
		utility.ExcelUtility.setExcelFile(utility.ExcelUtility.pathToExcelFile, 0);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= utility.ExcelUtility.getSheet().getLastRowNum(); i++) {
			page.objects.RegistrationPage.clickFirstName(dr);
			page.objects.RegistrationPage.sendKeysFirstName(dr, utility.ExcelUtility.getCellData(i, 0));

			RegistrationPage.clickLastName(dr);
			RegistrationPage.sendKeysLastName(dr, utility.ExcelUtility.getCellData(i, 1));

			RegistrationPage.clickUsername(dr);
			RegistrationPage.sendKeysUsername(dr, utility.ExcelUtility.getCellData(i, 2));

			RegistrationPage.clickEmail(dr);
			RegistrationPage.sendKeysEmail(dr, utility.ExcelUtility.getCellData(i, 3));

			RegistrationPage.clickPassword(dr);
			RegistrationPage.sendKeysPassword(dr, utility.ExcelUtility.getCellData(i, 4));

			RegistrationPage.clickRegister(dr);
			LogInTest.execute(dr, i);

			// this part checks out if user is successfully registered
			try {
				if (dr.getCurrentUrl().equals("http://localhost/izlet/dashboard.php"))
					System.out.println("Korisnik " + ExcelUtility.getCellData(i, 0) + " je uspesno registrovan!");
				else
					System.out.println("Korisnik " + ExcelUtility.getCellData(i, 0) + " nije registrovan!");

				Thread.sleep(1000);

				if (i != utility.ExcelUtility.getSheet().getLastRowNum()) {
					LogOut.execute(dr);

					page.objects.HomePage.open(dr);
				}
				Thread.sleep(500);

			} catch (Exception e) {
				dr.quit();
			}

		}
		switchPackage.Switch.scenarios(dr);

	}

}
