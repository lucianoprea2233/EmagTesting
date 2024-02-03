package TestEmag.EmagTest.Steps;

import TestEmag.EmagTest.Pages.ProductsPageObject;
import io.cucumber.java.en.Given;

public class ProductsStepDefinition {

    ProductsPageObject productsPageObject = new ProductsPageObject();


    @Given("I'm on HomePage")
    public void iMOnHomePage() {
    }
}
