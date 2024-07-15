package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthtificationObject {
	
	WebDriver driver;
	
	//creation d'un constructeur
	public AuthtificationObject (WebDriver driver)  {
	this.driver= driver;
	PageFactory.initElements(driver,this);
	}
	
	//identification des elements
	
	@FindBy(how = How.NAME , using="username")
	WebElement User;
	
	@FindBy(how = How.NAME , using="password")
	WebElement mdp;
	
	@FindBy(how = How.XPATH , using="//button[normalize-space()='Login']")
	WebElement bouton;
	
	
	@FindBy(how = How.XPATH , using="//p[@class='oxd-userdropdown-name']")
	WebElement Profil;
	
	// Creation des methodes
	
	public void URL(String arg) {
		driver.get(arg);
	}
	
	public void saisir_User(String arg) {
		User.sendKeys(arg);
	}
	
	public void saisir_mdp(String arg) {
		mdp.sendKeys(arg);
	}
	
	public void cliquer_bouton() {
		bouton.click();
	}
	
	public String message() {
		String text;
		text= Profil.getText();
		return text;
		
	}
	
	
	
	

}
