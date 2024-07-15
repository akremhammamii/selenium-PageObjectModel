
@Page_acceuil
Feature: authentification page Orange HRM
 

  @Authentification
  Scenario: je veux m authentifier 
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir le nom d utilisateur "Admin"
    And saisir le mot de passe d utilisateur "admin123"
    And cliquer sur le bouton se connecter
    Then je dois verifier le nom d utilisateur "Alex Popoescu"
  

 