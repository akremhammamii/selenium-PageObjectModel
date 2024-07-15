package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class rechercheObject {
	
WebDriver driver;
	
	//creation d'un constructeur
	public rechercheObject (WebDriver driver)  {
	this.driver= driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH , using="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement champ;
	
	@FindBy(how = How.XPATH , using="//button[normalize-space()='Search']")
	WebElement SEARCH;
	
	public void saisir_champ(String arg) {
		champ.sendKeys(arg);
	}
	
	public void cliquer_bouton_search() {
		SEARCH.click();
	}

}
