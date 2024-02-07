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

    @Given("I'm on login page")
    public void iMOnLoginPage() {
        myAccountPageObject.navigateToLoginPage();
    }

    @Then("I am on Edit Profile Tab")
    public void iAmOnEditProfileTab() {
        myAccountPageObject.moveToMyAccountButton();
myAccountPageObject.clickOnEditProfile();

    }

    @Then("I choose {string} Activity Doamain")
    public void iChooseActivityDoamain(String arg0) {
    myAccountPageObject.chooseActivityDomain();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("I choose the date to be {int} August {int}")
    public void iChooseTheDateToBeAugust(int arg0, int arg1) {
        myAccountPageObject.changeBirthDate();

    }

    @Then("I am on My Cars Tab")
    public void iAmOnMyCarsTab() {
        myAccountPageObject.moveToMyAccountButton();
        myAccountPageObject.iAmOnMyCarsTab();


    }

    @Then("I choose My Car with my car specifics without VIN")
    public void iChooseMyCarWithMyCarSpecifics() {
        myAccountPageObject.chooseMyCarWithoutVIN();
    }

    @Then("I choose My Car with my car specifics WITH VIN")
    public void iChooseMyCarWithMyCarSpecificsWITHVIN() {


        myAccountPageObject.addCarWithVinToMyCar();

    }

    @Then("I delete my car if it exists")
    public void iDeleteMyCarIfItExists() {
        myAccountPageObject.deleteMyCar();

    }

    @Then("I click on {string} for Dacia Logan that i just added")
    public void iClickOnForDaciaLoganThatIJustAdded(String arg0) {
        myAccountPageObject.enterPartsList();

    }

    @Then("I logout of my account")
    public void iLogoutOfMyAccount() {
        myAccountPageObject.logOut();
    }
}


/* try {
         Thread.sleep(4000);
            } catch (InterruptedException e) {
        throw new RuntimeException(e);
            }
            */