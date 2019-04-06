package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Dashboard;

public class EditPost {
	

	public static void execute(WebDriver dr) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite novi naziv posta: ");
		 String naziv=sc.nextLine();
			System.out.println("Unesite novu lokaciju: ");

		 String lokacija=sc.nextLine();
			System.out.println("Unesite novi opis posta: ");

		 String opis=sc.nextLine();
		
		Dashboard.clickEdit(dr);
		
		Dashboard.clickNazivEdit(dr);
		Dashboard.getNazivEdit(dr).clear();
		Dashboard.sendKeysNazivEdit(dr , naziv);

		Dashboard.clickLokacijaEdit(dr);
		Dashboard.getLokacijaEdit(dr).clear();
		Dashboard.sendKeysLokacijaEdit(dr, lokacija);

		Dashboard.clickOpisEdit(dr);
		Dashboard.getOpisEdit(dr).clear();
		Dashboard.sendKeysOpisEdit(dr, opis);

		Dashboard.clickPostButtonEdit(dr);
		
		switchPackage.Switch.scenarios(dr);
	}

}
