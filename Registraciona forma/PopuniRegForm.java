package selenium;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopuniRegForm {

	public static void main(String[] args) {
		
		WebDriver wb= new ChromeDriver();
		String url="http://www.newtours.demoaut.com/";
		wb.get(url);

		try {
			Thread.sleep(5000);
			
			WebElement register= wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			register.click();
			Thread.sleep(3000);
			
			WebElement findUserNameBox= wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
			findUserNameBox.click();
			findUserNameBox.sendKeys(DataSet.firstName);

			WebElement findLastNameBox= wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
			findLastNameBox.click();
			findLastNameBox.sendKeys(DataSet.lastName);
			
			WebElement findPhoneBox = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
			findPhoneBox.click();
			findPhoneBox.sendKeys(DataSet.phone);
			
			WebElement findEmailAdress = wb.findElement(By.xpath("//*[@id=\"userName\"]"));
			findEmailAdress.click();
			findEmailAdress.sendKeys(DataSet.email);
			
			WebElement findAdress = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
			findAdress.click();
			findAdress.sendKeys(DataSet.adress);
			
			WebElement findCity = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
			findCity.click();
			findCity.sendKeys(DataSet.city);
			
			WebElement findState = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
			findState.click();
			findState.sendKeys(DataSet.state);
			
			WebElement findPostal = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
			findPostal.click();
			findPostal.sendKeys(DataSet.postalCode);
			
			WebElement findUserBox = wb.findElement(By.xpath("//*[@id=\"email\"]"));
			findUserBox.click();
			findUserBox.sendKeys(DataSet.user);
			
			WebElement findPassBox = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
			findPassBox.click();
			findPassBox.sendKeys(DataSet.password);
			

			WebElement findPassBox2 = wb.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
			findPassBox2.click();
			findPassBox2.sendKeys(DataSet.password);
			
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
		}	finally {
			wb.quit();
		}
	}	

}
