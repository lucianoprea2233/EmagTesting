package TestEpiesa.Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class ProductsPageObject extends BasePage {



    @FindBy(xpath = "//div[@class='dropdown-toggle']")
    private WebElement productsButton;
    @FindBy(xpath = "//div[@class='category-menu-wrap']/div[@class='category-menu hidecat']/nav/ul/li[5]")
    private WebElement technologyButton;
    @FindBy(xpath = "//div[@class='single-category-menu-inner']//a[@title='Laptopuri'][normalize-space()='Laptopuri']")
    private WebElement laptoptsButton;
    @FindBy(xpath = "(//input[@name='find'][@onkeyup=\"showResults_search(this.value);\"])")
    private WebElement searchBar;
    @FindBy(xpath = "(//div[@class='header-top'])/div[2]/form/button")
    private WebElement submitSearchButton;
    @FindBy(xpath = "//body//section[@class='electrice-area']//li//li[1]//div[2]//div[1]//form[1]//div[3]//label[1]")
    private WebElement asusBrandButton;
    @FindBy(xpath = "//div[normalize-space()='Producator procesor']")
    private WebElement processorsFilterButton;
    @FindBy(xpath = "//li[3]//div[2]//div[1]//form[1]//div[1]//label[1]")
    private WebElement intelProcessor;




    public ProductsPageObject() {
        PageFactory.initElements(driver, this);
    }


    public void enteringLaptoptsTab(){
        productsButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        technologyButton.click();


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class).ignoring(StaleElementReferenceException.class);


        laptoptsButton = wait.until(ExpectedConditions.elementToBeClickable(laptoptsButton));



          laptoptsButton.click();


        String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Laptopuri']")).getText();
        Assert.assertEquals("Laptopuri",actualText);

    }


        public void balansoarGradinaSearch(){
            searchBar.sendKeys("Balansoar de gradina VILLAGER CRETE DELUXE 067207");
            submitSearchButton.click();
          //  String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Cod piesa - balansoar de gradina']")).getText();
         //   Assert.assertEquals("Cod piesa - balansoar de gradina",actualText);
            Assert.assertTrue(driver.getPageSource().contains("Balansoar de gradina VILLAGER CRETE DELUXE 067207"));
        }




        public void sortByBrandAndProcessor(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            asusBrandButton.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          //  Duration timeout = Duration.ofSeconds(10);
         //   WebDriverWait wait = new WebDriverWait(driver,timeout);
         //   wait.until(ExpectedConditions.stalenessOf(asusBrandButton));
            processorsFilterButton.click();
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class).ignoring(StaleElementReferenceException.class);


            intelProcessor = wait.until(ExpectedConditions.elementToBeClickable(intelProcessor));
            intelProcessor.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }





}
