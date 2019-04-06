package switchPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.tests.DeletePost;
import page.tests.EditPost;
import page.tests.MakeAPost;

public class Switch {

	public static void scenarios(WebDriver dr) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ukoliko zelite da unesete podatke za novi post, unesite 0,");
		System.out.println("ukoliko zelite da unesete podatke za novi post iz excela unesite 1,");
		System.out.println("ukoliko zelite da editujete post unesite 2, ");
		System.out.println(
				"ukoliko zelite da obrisete post unesite 3." + " Ukoliko zelite da ugasite program unesite 4.");

		int i = sc.nextInt();
		switch (i) {
		case 0:
			MakeAPost.execute2(dr);
			break;
		case 1:
			MakeAPost.execute(dr);
		case 2:
			EditPost.execute(dr);
			break;
		case 3:
			DeletePost.execute(dr);
			break;
		case 4:
			dr.quit();
			break;
		default:
			switchPackage.Switch.scenarios(dr);
		}
	}

}
