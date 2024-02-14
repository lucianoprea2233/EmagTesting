Feature: Testing Using AutoParts Tabs

  Scenario: I select the car I want to buy parts for
    Given I'm landing on the homepage
    Then  I'm scrolling down until I find autoparts after Brand
    Then  I choose the car type that I want to buy parts for

  Scenario: Verifing if change car button works
    Given I'm landing on the homepage
    Then  I'm scrolling down until I find autoparts after Brand
    Then  I choose the car type that I want to buy parts for
    Then  I press the change car button and check if it works


  Scenario: Change the car
    Given I'm landing on the homepage
    Then  I'm scrolling down until I find autoparts after Brand
    Then  I choose the car type that I want to buy parts for
    Then  I press the change car button and check if it works
    Then  I change the car


  Scenario:Entering the oil page
    Given I'm landing on the homepage
    Then  I enter on oil page from "Produse auto universale"


  Scenario: Entering motor oil tab
    Given I'm landing on the homepage
    Then  I enter on oil page from "Produse auto universale"
    Then  I enter on Motor Oil Tab


  Scenario: Filtering oil
    Given I'm landing on the homepage
    Then  I enter on oil page from "Produse auto universale"
    Then  I enter on Motor Oil Tab
    Then  I filter 5W30W 4 liters oil


  Scenario: Addind a specific oil in cart
    Given I'm landing on the homepage
    Then  I enter on oil page from "Produse auto universale"
    Then  I enter on Motor Oil Tab
    Then  I filter 5W30W 4 liters oil
    Then  Add in cart specific oil


  Scenario: Search for "Pompa de apa" in Auto Parts Tab
    Given I'm landing on the homepage
    Then  I am on Auto Parts Tab
    Then  I choose the car
    Then  I search for "Pompa de apa" on the search tab


  Scenario: Add to cart the cheapest water pump
    Given I'm landing on the homepage
    Then  I am on Auto Parts Tab
    Then  I choose the car
    Then  I search for "Pompa de apa" on the search tab
    Then  I choose the cheapest Water pump


  Scenario: Add to cart the most expensive water pump
    Given I'm landing on the homepage
    Then  I am on Auto Parts Tab
    Then  I choose the car
    Then  I search for "Pompa de apa" on the search tab
    Then  I choose the most expensive