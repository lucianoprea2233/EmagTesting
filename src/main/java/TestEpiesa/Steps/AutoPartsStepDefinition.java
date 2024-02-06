package TestEpiesa.Steps;

import TestEpiesa.Pages.AutoPartsPageObject;
import io.cucumber.java.en.When;

public class AutoPartsStepDefinition {
AutoPartsPageObject autoPartsPageObject = new AutoPartsPageObject();

    @When("I am on login page")
    public void iAmOnLoginPage() {
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
