package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	public static final String MAKEAPOST="//a[contains(text(),'Make a post')]";
	public static final String NAZIV="//input[@placeholder='Naziv']";
	public static final String NAZIVEDIT="//input[@id='title']";
	public static final String LOKACIJA="//input[@placeholder='Lokacija']";
	public static final String LOKACIJAEDIT="//input[@id='location']";
	
	public static final String OPIS="//textarea[@placeholder='Opis']";
	public static final String OPISEDIT="//textarea[@id='description']";

	public static final String POSTBUTTON="//input[@value='Post']";
	public static final String POSTBUTTONEDIT="body:nth-child(2) div.container:nth-child(22) div.popupEdit:nth-child(6) form.newpost:nth-child(3) > input:nth-child(7)";
	
	public static final String DOTS="fa-ellipsis-v";
	public static final String EDITBUTTON="fa-edit";
	
	public static final String DELETEBUTTON="fa-trash-alt";
	
	// MakeAPost
			public static WebElement getMakeAPost(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(MAKEAPOST));
				return wb;
			}

			public static void clickMakeAPost(WebDriver dr) {
				getMakeAPost(dr).click();
			}
	// Naziv
		public static WebElement getNaziv(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(NAZIV));
			return wb;
		}

		public static void clickNaziv(WebDriver dr) {
			getNaziv(dr).click();
		}

		public static void sendKeysNaziv(WebDriver dr, String str) {
			getNaziv(dr).sendKeys(str);
		}
		// Lokacija
				public static WebElement getLokacija(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(LOKACIJA));
					return wb;
				}

				public static void clickLokacija(WebDriver dr) {
					getLokacija(dr).click();
				}

				public static void sendKeysLokacija(WebDriver dr, String str) {
					getLokacija(dr).sendKeys(str);
				}
				
				// Opis
				public static WebElement getOpis(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(OPIS));
					return wb;
				}

				public static void clickOpis(WebDriver dr) {
					getOpis(dr).click();
				}

				public static void sendKeysOpis(WebDriver dr, String str) {
					getOpis(dr).sendKeys(str);
				}	
				 //PostButton
					public static WebElement getPostButton(WebDriver dr) {
						WebElement wb = dr.findElement(By.xpath(POSTBUTTON));
						return wb;
					}

					public static void clickPostButton(WebDriver dr) {
						getPostButton(dr).click();
					}
					
					// click dots for edit and delete menu
					
					public static void clickDots(WebDriver dr) {
					List<WebElement> list= dr.findElements(By.className(DOTS));
					list.get(0).click();
					}
					// click edit button
					public static void clickEdit(WebDriver dr) {
						clickDots(dr);
						List<WebElement> list=dr.findElements(By.className(EDITBUTTON));
						list.get(0).click();
					}
					// Naziv
					public static WebElement getNazivEdit(WebDriver dr) {
						WebElement wb = dr.findElement(By.xpath(NAZIVEDIT));
						return wb;
					}

					public static void clickNazivEdit(WebDriver dr) {
						getNazivEdit(dr).click();
					}

					public static void sendKeysNazivEdit(WebDriver dr, String str) {
						getNazivEdit(dr).sendKeys(str);
					}
					// Lokacija
							public static WebElement getLokacijaEdit(WebDriver dr) {
								WebElement wb = dr.findElement(By.xpath(LOKACIJAEDIT));
								return wb;
							}

							public static void clickLokacijaEdit(WebDriver dr) {
								getLokacijaEdit(dr).click();
							}

							public static void sendKeysLokacijaEdit(WebDriver dr, String str) {
								getLokacijaEdit(dr).sendKeys(str);
							}
							
							// Opis
							public static WebElement getOpisEdit(WebDriver dr) {
								WebElement wb = dr.findElement(By.xpath(OPISEDIT));
								return wb;
							}

							public static void clickOpisEdit(WebDriver dr) {
								getOpisEdit(dr).click();
							}

							public static void sendKeysOpisEdit(WebDriver dr, String str) {
								getOpisEdit(dr).sendKeys(str);
							}	
							// post edit dugme
							public static WebElement getPostButtonEdit(WebDriver dr) {
								WebElement wb = dr.findElement(By.cssSelector(POSTBUTTONEDIT));
								return wb;
							}

							public static void clickPostButtonEdit(WebDriver dr) {
								getPostButtonEdit(dr).click();
							}
							// delete dugme
							public static void clickDelete(WebDriver dr) {
								clickDots(dr);
								List<WebElement> list=dr.findElements(By.className(DELETEBUTTON));
								list.get(0).click();
								}

}
