package TestEpiesa.Steps;

import TestEpiesa.Pages.MyAccountPageObject;
import TestEpiesa.Utils.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class MyAccountStepDefiniton {

    MyAccountPageObject myAccountPageObject = new MyAccountPageObject();


    @Given("I'm landing on the homepage")
    public void iMLandingOnTheHomepage() {
        myAccountPageObject.navigateToHomePage();

    }

    @Then("I am on my account button")
    public void iAmOnMyAccountButton() {
        myAccountPageObject.moveToMyAccountButton();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Screenshot.captureScreenshot(myAccountPageObject.driver, scenario.getName());
        }
        myAccountPageObject.quitDriver();
    }

    @And("I click on {string}")
    public void iClickOn(String arg0) {

        myAccountPageObject.clickOnEnterAccount();
    }


    @Then("I enter my account email and password and click on {string}")
    public void iEnterMyAccountEmailAndPasswordAndClickOn(String arg0) {
        myAccountPageObject.enterEmailandPasswordClickContinue();
    }
}