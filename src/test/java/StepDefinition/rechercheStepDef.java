package StepDefinition;

import org.openqa.selenium.WebDriver;


import PageObject.rechercheObject;
import hooks.SetUp;
import io.cucumber.java.en.When;

public class rechercheStepDef {
	
WebDriver driver=SetUp.driver;
	
	rechercheObject Admin =new rechercheObject(driver);
	
	@When("remplir le champs de text par {string}")
	public void remplir_le_champs_de_text_par(String string) {
	    Admin.saisir_champ(string);
	}

	@When("cliquer sur le bouton search")
	public void cliquer_sur_le_bouton_search() {
		Admin.cliquer_bouton_search();
	    
	}

}
