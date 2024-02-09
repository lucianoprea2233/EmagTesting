package TestEpiesa.Pages;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.EnumSet.range;
import static org.junit.Assert.assertTrue;

public class ProductsPageObject extends BasePage {


    @FindBy(xpath = "//div[@class='dropdown-toggle']")
    private WebElement productsButton;

    @FindBy(xpath = "//img[@alt='TEHNOLOGIE']")
    private WebElement technologyButton;
    @FindBy(xpath = "//div[@class='single-category-menu-inner']//a[@title='Laptopuri'][normalize-space()='Laptopuri']")
    private WebElement laptoptsButton;
    @FindBy(xpath = "(//input[@name='find'][@onkeyup=\"showResults_search(this.value);\"])")
    private WebElement searchBar;
    @FindBy(xpath = "(//div[@class='header-top'])/div[2]/form/button")
    private WebElement submitSearchButton;

    @FindBy(xpath = "//a[text()='ASUS']")
    private WebElement asusBrandButton;
    @FindBy(xpath = "//div[normalize-space()='Producator procesor']")
    private WebElement processorsFilterButton;

    @FindBy(xpath = "//a[text()='Intel']")
    private WebElement intelProcessor;
    @FindBy(xpath = "//div[@class='sub-product-text']//a[@title='Laptop ASUS X1502ZA-BQ549, procesor Intel Core i3, 4.40 GHz, 15.6 inch, 256 GB SSD, albastru']")
    private WebElement clickOnAsusX1502ZA;
    @FindBy(xpath = "//button[@onclick=\"document.getElementById('adauga_piesa_cos_112125').submit();\"]")
    private WebElement addInCart;
    @FindBy(xpath = "//div[@class=\"btn-group ml-20\"]//a[@title=\"cos cumparaturi epiesa.ro\"]")
    private WebElement cartButton;
    @FindBy(xpath = "//div[@class=\"cumparaturi-text\"]//p[contains(text(),'Laptop ASUS X1502ZA-BQ549, procesor Intel Core i3,')]")
    private WebElement isElementInCart;
    @FindBy(xpath = "//span[@class='plus']")
    private WebElement addOneMoreItem;
    @FindBy(xpath = "//button[@onclick=\"document.location.href='/checkout-epiesa/';\"]")
    private WebElement checkOutButton;
    @FindBy(xpath = "//div[@class='number']//input")
    private WebElement cartItemCount;
    @FindBy(xpath = "//strong[normalize-space()='Detalii comanda']")
    private WebElement checkCheckout;
    @FindBy(xpath = "//img[@alt='delete']")
    private WebElement deleteButtonLaptop;
    @FindBy(xpath = "(//a[@class='nav-link dropdown-toggle'][text()='Roti'])")
    private WebElement tyresButton;
    @FindBy(xpath = "(//a[@title=\"anvelope auto epiesa.ro\"][text()='Anvelope auto'])[2]")
    private WebElement tyresSubButton;
    @FindBy(xpath = "//div[normalize-space()='SEZON']")
    private WebElement tyreSeasonFilter;
    @FindBy(xpath = "//a[text()=\"vara\"]")
    private WebElement summerTyresFilter;
    @FindBy(xpath = "//div[normalize-space()='LATIME']")
    private WebElement tyreWidthFilter;
    @FindBy(xpath = "//a[text()=\"255\"]")
    private WebElement tyre255Width;
    @FindBy(xpath = "//div[normalize-space()='INALTIME']")
    private WebElement tyreHeightFilter;
    @FindBy(xpath = "(//a[@title='anvelope auto 35'][normalize-space()='35'])[2]")
    private WebElement tyre35Height;
    @FindBy(xpath = "//div[normalize-space()='RAZA']")
    private WebElement tyreRadiusFilter;
    @FindBy(xpath = "//a[text()='18']")
    private WebElement tyre18Radius;

    public ProductsPageObject() {
        PageFactory.initElements(driver, this);
    }


    public void enteringLaptoptsTab() {
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
        Assert.assertEquals("Laptopuri", actualText);

    }


    public void balansoarGradinaSearch() {
        searchBar.sendKeys("Balansoar de gradina VILLAGER CRETE DELUXE 067207");
        submitSearchButton.click();

        Assert.assertTrue(driver.getPageSource().contains("Balansoar de gradina VILLAGER CRETE DELUXE 067207"));
    }


    public void sortByBrandAndProcessor() {
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

    public void enterAsusX1502ZA() {
        clickOnAsusX1502ZA.click();
    }

    public void addInCartAndCheckCart() {
        addInCart.click();
        cartButton.click();
        Assert.assertTrue("Laptop was not added to cart", isElementInCart.isDisplayed());

    }

    public void addOneMoreItemInCart() {
        String valueString = cartItemCount.getAttribute("value");
        int currentItemCount = Integer.parseInt(valueString);
        addOneMoreItem.click();
        String valueString2 = cartItemCount.getAttribute("value");
        int expectedItemCount = Integer.parseInt(valueString2);
        Assert.assertEquals("Expected cart item count does not match.", expectedItemCount, currentItemCount + 1);

    }

    public void checkOutOrder() {
        checkOutButton.click();
        Assert.assertEquals("Detalii comanda", checkCheckout.getText());

    }

    public void deleteProductFromTheCart() {
        deleteButtonLaptop.click();

        Assert.assertTrue("Product was deleted", driver.findElements(By.xpath("//div[@class=\"cumparaturi-text\"]//p[contains(text(),'Laptop ASUS X1502ZA-BQ549, procesor Intel Core i3,')]")).isEmpty());
    }

    public void tyresTab() {
        tyresButton.click();
        tyresSubButton.click();

    }

    public void tyreDimensionFilter() {
        // Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(20)).ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class).ignoring(StaleElementReferenceException.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        tyreSeasonFilter = wait.until(ExpectedConditions.elementToBeClickable(tyreSeasonFilter));
        try {
            tyreSeasonFilter.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // tyreSeasonFilter.click();
        summerTyresFilter = wait.until(ExpectedConditions.elementToBeClickable(summerTyresFilter));
        try {
            summerTyresFilter.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //summerTyresFilter.click();
        tyreWidthFilter = wait.until(ExpectedConditions.elementToBeClickable(tyreWidthFilter));
        try {
            tyreWidthFilter.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //tyreWidthFilter.click();
        tyre255Width = wait.until(ExpectedConditions.elementToBeClickable(tyre255Width));
        try {
            tyre255Width.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //  tyre255Width.click();
        tyreHeightFilter = wait.until(ExpectedConditions.elementToBeClickable(tyreHeightFilter));
        try {
            tyreHeightFilter.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //tyreHeightFilter.click();
        tyre35Height = wait.until(ExpectedConditions.elementToBeClickable(tyre35Height));
        try {
            tyre35Height.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //tyre35Height.click();
        tyreRadiusFilter = wait.until(ExpectedConditions.elementToBeClickable(tyreRadiusFilter));
        try {
            tyreRadiusFilter.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // tyreRadiusFilter.click();
        tyre18Radius = wait.until(ExpectedConditions.elementToBeClickable(tyre18Radius));
        try {
            tyre18Radius.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // tyre18Radius.click();

        String filterCheck = driver.findElement(By.xpath("//div[@class='electrice-title']")).getText();
        // Assert.assertEquals("ANVELOPE AUTO VARA 255 35 R18",filterCheck);
        Assert.assertEquals("Tyres are filtered", "ANVELOPE AUTO VARA 255 35 R18", filterCheck);

    }


    public void gripFilter() {
        List<WebElement> filteredElements = driver.findElements(By.xpath("(//div[@class='electrice-right']//div[@class=\"sub-product-area\"]//div//div//div[@class='sub-product-text'])"));

        for (WebElement element : filteredElements) {
            String priceRough = driver.findElement(By.xpath("//div[@class=\"sub-product-area\"]//div[@class=\"bricolaje-bottom-text\"]")).getText();
            double price = Double.parseDouble(priceRough.replace(" Lei cu TVA", "").trim());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                if (price < 400) {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                    element = wait.until(ExpectedConditions.elementToBeClickable(element));
                    element.click();
                    driver.findElement(By.xpath("(//button[@onclick=\"document.getElementById('adauga_piesa_cos').submit();\"])")).click();
                    break;
                }
            } catch (StaleElementReferenceException e) {

            }

        }
    }
}


