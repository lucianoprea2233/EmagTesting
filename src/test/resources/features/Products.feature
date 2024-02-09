Feature: Testing Emag Products Page

  Scenario: Entering Laptops Tab
    Given I'm landing on the homepage
    Then I enter on Laptops Tab


  Scenario: Searching a Garden Product by it's name
    Given I'm landing on the homepage
    Then I search for "Balansoar de gradina"


  Scenario: Sort product by brand and by processor
    Given I'm landing on the homepage
    Then I enter on Laptops Tab
    Then I sort by "Asus" Brand and "Intel" Processor


  Scenario:Add to cart "Laptop ASUS X1502ZA-BQ549"
    Given I'm landing on the homepage
    Then I enter on Laptops Tab
    Then I sort by "Asus" Brand and "Intel" Processor
    Then I enter on this laptop's page
    Then I add on cart the laptopt I want and check if it's added


  Scenario: Add to cart one item, then add another one from "+" button and proceed with order detalis
    Given I'm landing on the homepage
    Then I enter on Laptops Tab
    Then I sort by "Asus" Brand and "Intel" Processor
    Then I enter on this laptop's page
    Then I add on cart the laptopt I want and check if it's added
    Then I add one more laptop
    Then I proceed with ordering the product


  Scenario: Remove an item from the shopping cart
    Given I'm landing on the homepage
    Then I enter on Laptops Tab
    Then I sort by "Asus" Brand and "Intel" Processor
    Then I enter on this laptop's page
    Then I add on cart the laptopt I want and check if it's added
    Then I delete the product from the cart


  Scenario: I want to buy tyres of a specific dimension
    Given I'm landing on the homepage
    Then I enter tyres Tab
    Then I filter the tyre dimensions that i want


  Scenario: Find the tyres with specific condition and add to cart
    Given I'm landing on the homepage
    Then I enter tyres Tab
    Then I filter the tyre dimensions that i want
    Then I search for a tyre with price lower than "400 LEI" and add in cart
