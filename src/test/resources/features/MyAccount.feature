Feature: Login into the Book Panel staging page

@Test
 Scenario: Login with valid credentials into Epiesa Account
    Given I'm landing on the homepage
    Then  I am on my account button

    And   I click on "Intra in cont"
    Then  I enter my account email and password and click on "Autentificare"




