package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Dashboard;

public class DeletePost {

	public static void execute(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko zelite da obrisete objava: ");
		int k = sc.nextInt();
		Thread.sleep(2000);
		for (int j = 0; j < k; j++) {


			Dashboard.clickDelete(dr);

			System.out.println(j+1+". objava je uspesno obrisana!");
			


		}
		switchPackage.Switch.scenarios(dr);


	}

}
