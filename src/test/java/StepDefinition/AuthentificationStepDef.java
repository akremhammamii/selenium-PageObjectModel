package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.AuthtificationObject;
import hooks.SetUp;
import io.cucumber.java.en.*;

public class AuthentificationStepDef {
	
	WebDriver driver=SetUp.driver;
	
	AuthtificationObject Home =new AuthtificationObject(driver);
	
	
	
	@Given("acceder a l URL suivant {string}")
	public void acceder_a_l_url_suivant(String string) {
		Home.URL(string);
	    
	}

	@When("saisir le nom d utilisateur {string}")
	public void saisir_le_nom_d_utilisateur(String string) {
		Home.saisir_User(string);
	    
	}

	@When("saisir le mot de passe d utilisateur {string}")
	public void saisir_le_mot_de_passe_d_utilisateur(String string) {
		Home.saisir_mdp(string);
	    
	}

	@When("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {
		Home.cliquer_bouton();
	   
	    
	}

	@Then("je dois verifier le nom d utilisateur {string}")
	public void je_dois_verifier_le_nom_d_utilisateur(String string) {
	    Assert.assertEquals(Home.message(), string);
	}


}
