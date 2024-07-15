
@Myinfo
Feature: Mes informations
Background: 
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir le nom d utilisateur "Admin"
    And saisir le mot de passe d utilisateur "admin123"
    And cliquer sur le bouton se connecter
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
    When remplir le champs de text par "admin"
    And cliquer sur le bouton search
  

  @tag1
  Scenario: acceder my info
    Given acceder a l URL suivant "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7"
    

