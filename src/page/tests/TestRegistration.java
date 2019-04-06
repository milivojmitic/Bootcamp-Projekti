package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class TestRegistration {
	// method contains if statement and execute methods for fill in form in accordance with user input
	public static void executeTest(WebDriver dr) throws IOException, Exception {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Unesi 0 ako zelis da sam popunjavas podatke, 1 ako zelis da se podaci popunjavaju iz excela.");

		
		
		int n=sc.nextInt();
		if(n==0) RegistrationPageTest.executeScanner(dr);
		else if(n==1)RegistrationPageTest.execute(dr);
		else TestRegistration.executeTest(dr);
	}
	
	
}
