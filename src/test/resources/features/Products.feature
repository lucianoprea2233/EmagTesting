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
