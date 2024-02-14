package TestEpiesa.Pages;

import TestEpiesa.Utils.Utils;
import io.cucumber.java.mk_latn.No;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    @FindBy(xpath = "//div[@class='nav-item dropdown']//a[@title='profil epiesa.ro']")
    private WebElement  editProfileButton;
    @FindBy(xpath = "//select[@name='domeniu_activitate']")
    private WebElement activityDomainButton;
    @FindBy(xpath = "//select[@name='domeniu_activitate']//option[@value='IT Hardware']")
    private WebElement itHardwareDomain;
    @FindBy(xpath = "//button[normalize-space()='ACTUALIZEAZA']")
    private WebElement updateEditProfileButton;
    @FindBy (xpath = "//input[@name='data_nastere']")
    private WebElement birthDateButton;
    @FindBy(xpath = "//div[@class='nav-item dropdown']//a[@title='masinile mele']")
    private WebElement myCarsButton;
    @FindBy(xpath = "//div[@class='select']//select[@name='select_marca']")
    private WebElement carBrandButton;
    @FindBy(xpath = "//div[@class='select']//select[@name='select_marca']//option[@value='139']")
    private WebElement daciaBrand;
    @FindBy(id = "model_marca_mm")
    private WebElement carModelButton;
    @FindBy(xpath = "//select[@id='model_marca_mm']//option[@value='11138']")
    private WebElement loganModel;
    @FindBy(xpath = "(//select[@id='carburant_mm'])")
    private WebElement fuelType;
    @FindBy(xpath = "(//select[@id='carburant_mm'])//option[@value='benzina']")
    private WebElement petrolFuel;
    @FindBy(xpath = "//select[@id='cilindree_mm']")
    private WebElement cylinders;
    @FindBy(xpath = "//select[@id='cilindree_mm']//option[@value='1.2']")
    private WebElement myCylinders;
    @FindBy(id = "motorizari_mm")
    private WebElement carPowerButton;
    @FindBy(xpath = "//select[@id='motorizari_mm']//option[@value=58614]")
    private WebElement myCarPower;
    @FindBy(xpath = "//button[normalize-space()='Adauga masina']")
    private WebElement addTheCar;
    @FindBy(xpath = "//input[@placeholder='Introdu seria de caroserie']")
    private WebElement carVIN;
    @FindBy(xpath = "//div[@class='date-select-inner display-flex']")
    private WebElement carIsDisplayed;
    @FindBy(css = "a[href='/admin-cont-epiesa/masinile_mele/sterge-58614/']")
    private WebElement deleteCar;
    @FindBy(xpath = "//span[normalize-space()='DACIA']")
    private WebElement myCarDacia;
    @FindBy(xpath = "//a[normalize-space()='LISTA PIESE']")
    private WebElement partsListFromMyCar;
    @FindBy(xpath = "//div[@class='nav-item dropdown']//a[@class='dropdown-item'][normalize-space()='DELOGHEAZA-MA']")
    private WebElement logoutButton;

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
            assertTrue(driver.getPageSource().contains("Contul meu"));


        }


    }
    public void navigateToLoginPage() {
        driver.get(Utils.loginPage);
    }

    public void clickOnEditProfile() {
        editProfileButton.click();
    }

    public void chooseActivityDomain(){
    activityDomainButton.click();
    itHardwareDomain.click();
    updateEditProfileButton.click();
        driver.navigate().refresh();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select select = new Select(activityDomainButton);

       assertEquals("IT Hardware",select.getFirstSelectedOption().getText());

    }


    public void changeBirthDate(){
      birthDateButton.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
     birthDateButton.sendKeys("09291997");
        updateEditProfileButton.click();
        String actualText = birthDateButton.getAttribute("value");

        assertEquals("1997-09-29",actualText);
    }

    public void iAmOnMyCarsTab(){
        myCarsButton.click();



    }

    public void chooseMyCarWithoutVIN(){
        carBrandButton.click();
        daciaBrand.click();
        carModelButton.click();
        loganModel.click();
        fuelType.click();
        petrolFuel.click();
        cylinders.click();
        myCylinders.click();
        carPowerButton.click();
        myCarPower.click();
        addTheCar.click();
//Expected result should be not to be able to add the car without the VIN
        assertTrue(driver.getPageSource().contains("Nu exista masini salvate in contul dvs."));


    }

    public void addCarWithVinToMyCar(){
        carBrandButton.click();
        daciaBrand.click();
        carModelButton.click();
        loganModel.click();
        fuelType.click();
        petrolFuel.click();
        cylinders.click();
        myCylinders.click();
        carPowerButton.click();
        myCarPower.click();
        carVIN.sendKeys("UU14SDAA448347134");
        addTheCar.click();

        boolean carIsAdded = carIsDisplayed.isDisplayed();
        assertEquals(true, carIsAdded);

    }
    public void deleteMyCar(){
        try {

            deleteCar.click();

            System.out.println("Car deleted successfully.");
      } catch (NoSuchElementException e) {
           System.out.println("Car does not exist.");
        }


    }


    public void enterPartsList(){

        try {

            myCarDacia.click();
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class).ignoring(StaleElementReferenceException.class);


                     partsListFromMyCar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='LISTA PIESE']")));
            ;
            partsListFromMyCar.click();

        } catch (NoSuchElementException e) {
            System.out.println("Car does not exist.");
        }


            assertTrue(driver.getPageSource().contains("Piese auto DACIA LOGAN II 1.2 benzina 75 cai"));

        }

        public void logOut(){
            logoutButton.click();

        }

    }


