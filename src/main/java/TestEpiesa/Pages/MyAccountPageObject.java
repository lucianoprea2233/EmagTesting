package TestEpiesa.Pages;

import TestEpiesa.Utils.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MyAccountPageObject extends BasePage {

    String email = "epiesatest@protonmail.com";
    String password = "testepiesa";

    @FindBy(xpath = "(//div[@class='contul-meu'])[1]")
    private WebElement landingOnMyAccount;
    @FindBy(xpath = "//a[normalize-space()='LOGIN / CONT NOU']")
    private WebElement enterAccountButton;
    @FindBy(xpath = "//input[@name='login_utilizator']")
    private WebElement emailField;

    @FindBy(name = "login_parola")
    private WebElement passwordField;
    @FindBy(xpath = "//div[@class='sub-pro-btn mrb-20 button-with-arrow']//button[@type='submit']")
    private WebElement loginButton;

    public MyAccountPageObject() {
        PageFactory.initElements(driver, this);
    }


    public void navigateToHomePage() {
        driver.get(Utils.homePage);
    }

    public void moveToMyAccountButton() {
        landingOnMyAccount.click();
    //    actions.moveToElement(landingOnMyAccount);
    }

    public void clickOnEnterAccount() {
        enterAccountButton.click();
    }


    //If there is an account logged in then skip this step, but if there is no account connected, then login
    public void enterEmailandPasswordClickContinue() {

        boolean isLoggedIn = false;
        try {
            WebElement loggedInIndicator = driver.findElement(By.xpath("//h1[normalize-space()='Contul meu'])"));
            isLoggedIn = loggedInIndicator != null && loggedInIndicator.isDisplayed();
        } catch (Exception e) {

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!isLoggedIn) {

            emailField.sendKeys(email);
            passwordField.sendKeys(password);
            loginButton.click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Assert.assertTrue(driver.getPageSource().contains("Contul meu"));


        }


    }

}

