package TestEpiesa.Steps;

import TestEpiesa.Pages.ProductsPageObject;
import TestEpiesa.Utils.Screenshot;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;

public class ProductsStepDefinition {

    ProductsPageObject productsPageObject = new ProductsPageObject();




    @Then("I enter on Laptops Tab")
    public void iEnterOnLaptopsTab() {
        productsPageObject.enteringLaptoptsTab();

    }

    @Then("I search for {string}")
    public void iSearchFor(String arg0) {

        productsPageObject.balansoarGradinaSearch();
    }

    @Then("I sort by {string} Brand and {string} Processor")
    public void iSortByBrandAndProcessor(String arg0, String arg1) {
        productsPageObject.sortByBrandAndProcessor();
    }

    @Then("I add on cart the laptopt I want and check if it's added")
    public void iAddOnCartTheLaptoptIWantAndCheckIfItSAdded() {
        productsPageObject.addInCartAndCheckCart();
    }

    @Then("I enter on this laptop's page")
    public void iEnterOnThisLaptopSPage() {
        productsPageObject.enterAsusX1502ZA();
    }

    @Then("I add one more laptop")
    public void iAddOneMoreLaptop() {

        productsPageObject.addOneMoreItemInCart();
    }

    @Then("I proceed with ordering the product")
    public void iProceedWithOrderingTheProduct() {
        productsPageObject.checkOutOrder();
    }

    @Then("I delete the product from the cart")
    public void iDeleteTheProductFromTheCart() {
        productsPageObject.deleteProductFromTheCart();
    }

    @Then("I enter tyres Tab")
    public void iEnterTyresTab() {
        productsPageObject.tyresTab();
    }

    @Then("I filter the tyre dimensions that i want")
    public void iFilterTheTyreDimensionsThatIWant() {
        productsPageObject.tyreDimensionFilter();
    }


    @Then("I search for a tyre with price lower than {string} and add in cart")
    public void iSearchForATyreWithPriceLowerThanAndAddInCart(String arg0) {
        productsPageObject.gripFilter();
    }





  /* @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Screenshot.captureScreenshot(productsPageObject.driver, scenario.getName());
        }
        productsPageObject.quitDriver();
    }
*/
}

