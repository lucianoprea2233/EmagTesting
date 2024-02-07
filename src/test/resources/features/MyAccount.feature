Feature: Login into the Book Panel staging page


 Scenario: Login with valid credentials into Epiesa Account
    Given I'm landing on the homepage
    Then  I am on my account button
    And   I click on "Intra in cont"
    Then  I enter my account email and password and click on "Autentificare"


  Scenario: Edit Activity Domain on Profile Tab
    Given I'm on login page
    Then I enter my account email and password and click on "Autentificare"
    Then I am on Edit Profile Tab
    Then I choose "IT and hardware" Activity Doamain


  Scenario: Edit Birth Date on Edit Profile Tab
    Given I'm on login page
    Then  I enter my account email and password and click on "Autentificare"
    Then I am on Edit Profile Tab
    Then I choose the date to be 29 August 1997

  Scenario: Add a car to my account without VIN
    Given I'm on login page
    Then I enter my account email and password and click on "Autentificare"
    Then I am on My Cars Tab
    Then I choose My Car with my car specifics without VIN


  Scenario: Add a car to my account WITH VIN
    Given I'm on login page
    Then I enter my account email and password and click on "Autentificare"
    Then I am on My Cars Tab
    Then I choose My Car with my car specifics WITH VIN


    Scenario: I want to delete my car
      Given I'm on login page
      Then I enter my account email and password and click on "Autentificare"
      Then I am on My Cars Tab
      Then I delete my car if it exists


    Scenario: I want to enter the Auto Parts for MY CAR from MY CAR TAB
      Given I'm on login page
      Then I enter my account email and password and click on "Autentificare"
      Then I am on My Cars Tab
      Then I click on "Lista Piese" for Dacia Logan that i just added


    Scenario: I want to logout from the account
      Given I'm on login page
      Then I enter my account email and password and click on "Autentificare"
      And  I am on my account button
      Then I logout of my account
