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





  /* @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Screenshot.captureScreenshot(productsPageObject.driver, scenario.getName());
        }
        productsPageObject.quitDriver();
    }
*/
}

