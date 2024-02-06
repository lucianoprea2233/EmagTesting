package TestEpiesa.Steps;

import TestEpiesa.Pages.ProductsPageObject;
import io.cucumber.java.en.Given;

public class ProductsStepDefinition {

    ProductsPageObject productsPageObject = new ProductsPageObject();



    @Given("I'm on HomePage")
    public void iMOnHomePage() {
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

