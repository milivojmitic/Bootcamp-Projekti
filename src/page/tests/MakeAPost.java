package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Dashboard;

public class MakeAPost {

	public static void execute(WebDriver dr) throws Exception {
		utility.ExcelUtility.setExcelFile(utility.ExcelUtility.pathToExcelFile, 1);
		Scanner sc= new Scanner(System.in);
		for (int i = 1; i <= utility.ExcelUtility.getSheet().getLastRowNum(); i++) {
			Dashboard.clickMakeAPost(dr);

			Dashboard.clickNaziv(dr);
			Dashboard.sendKeysNaziv(dr, utility.ExcelUtility.getCellData(i, 1));

			Dashboard.clickLokacija(dr);
			Dashboard.sendKeysLokacija(dr, utility.ExcelUtility.getCellData(i, 2));

			Dashboard.clickOpis(dr);
			Dashboard.sendKeysOpis(dr, utility.ExcelUtility.getCellData(i, 0));

			Dashboard.clickPostButton(dr);
			Thread.sleep(2000);
			
			System.out.println(i+1+". objava je uspesno obrisana!");

			

		}
		switchPackage.Switch.scenarios(dr);
	}

	public static void execute2(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv posta: ");
		String naziv = sc.nextLine();
		System.out.println("Unesite lokaciju: ");
		String lokacija = sc.nextLine();
		System.out.println("Unesite opis: ");
		String opis = sc.nextLine();

		Dashboard.clickMakeAPost(dr);

		Dashboard.clickNaziv(dr);
		Dashboard.sendKeysNaziv(dr, naziv);

		Dashboard.clickLokacija(dr);
		Dashboard.sendKeysLokacija(dr, lokacija);

		Dashboard.clickOpis(dr);
		Dashboard.sendKeysOpis(dr, opis);

		Dashboard.clickPostButton(dr);
		
		switchPackage.Switch.scenarios(dr);

		
		
	}

}
