package TestEpiesa.Steps;

import TestEpiesa.Pages.AutoPartsPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoPartsStepDefinition {
AutoPartsPageObject autoPartsPageObject = new AutoPartsPageObject();



    @Then("I'm scrolling down until I find autoparts after Brand")
    public void iMScrollingDownUntilIFindAutopartsAfterBrand() {
        autoPartsPageObject.autoPartsAfterBrand();
    }

    @Then("I choose the car type that I want to buy parts for")
    public void iChooseTheCarTypeThatIWantToBuyPartsFor() {
        autoPartsPageObject.chooseTheCar();
    }

    @Then("I press the change car button and check if it works")
    public void iWantToChangeTheCar() {
        autoPartsPageObject.changeCarButtonCheck();
    }

    @Then("I change the car")
    public void iChangeTheCar() {
        autoPartsPageObject.changeCar();
    }

    @Then("I enter on oil page from {string}")
    public void iEnterOnOilPageFrom(String arg0) {
        autoPartsPageObject.oilPage();
    }

    @Then("I enter on Motor Oil Tab")
    public void iEnterOnMotorOilTab() {
        autoPartsPageObject.motorOil();
    }

    @Then("I filter {int}W{int}W {int} liters oil")
    public void iFilterWWLitersOil(int arg0, int arg1, int arg2) {
        autoPartsPageObject.filterOilType();
    }

    @Then("Add in cart specific oil")
    public void addInCartSpecificOil() {
        autoPartsPageObject.addToCartOil();
    }

    @Then("I am on Auto Parts Tab")
    public void iAmOnAutoPartsTab() {
        autoPartsPageObject.autoPartsTab();
    }

    @Then("I search for {string} on the search tab")
    public void iSearchForOnTheSearchTab(String arg0) {
        autoPartsPageObject.searchProduct();
    }

    @Then("I choose the car")
    public void iChooseTheCar() {
        autoPartsPageObject.changeCar();
    }

    @Then("I choose the cheapest Water pump")
    public void iChooseTheCheapestWaterPump() {
        autoPartsPageObject.chooseCheapestWaterPump();
    }

    @Then("I choose the most expensive")
    public void iChooseTheMostExpensive() {
        autoPartsPageObject.chooseTheMostExpensiveWaterPump();
    }




/*  @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Screenshot.captureScreenshot(emagOffersPageObject.driver, scenario.getName());
        }
        emagOffersPageObject.quitDriver();
    }
*/
}
