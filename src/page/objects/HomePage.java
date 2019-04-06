package page.objects;

import org.openqa.selenium.WebDriver;

public class HomePage {
	// method opens home page
	public static void open(WebDriver dr) {
		dr.get(utility.Paths.PAGE_URL);
	}

}
