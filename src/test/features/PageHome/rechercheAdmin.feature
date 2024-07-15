
@recherche
Feature: recherche admin
Background: 
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir le nom d utilisateur "Admin"
    And saisir le mot de passe d utilisateur "admin123"
    And cliquer sur le bouton se connecter
   
 

  @rechercher_par_nom
  Scenario: recherche par nom utilisateur
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
    When remplir le champs de text par "admin"
    And cliquer sur le bouton search
   


