package TestEpiesa.Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AutoPartsPageObject extends BasePage {

    @FindBy(xpath = "//p[normalize-space()='Piese auto dupa marca']")
    private WebElement pieseAutoDupaMarcaButton;
    @FindBy(xpath = "//a[@title=\"piese auto bmw\"]//p")
    private WebElement bmwCarChoose;
    @FindBy(xpath = "//a[@href=\"/piese-auto-bmw:seria%203\"]")
    private WebElement seria3Model;
    @FindBy(xpath = "//a[@href=\"/piese-auto-bmw:seria%203:9831\"]")
    private WebElement f30Button;
    @FindBy(xpath = "//a[@href=\"/piese-auto-bmw:seria%203:9831:318%20d\"]")
    private WebElement engine318d;
    @FindBy(xpath = "//a[text()=\"318 d - 150 cai (diesel) (B47 D20 A)\"]")
    private WebElement horsePower;
    @FindBy(xpath = "//button[@onclick=\"document.location.href='/schimba-masina/';\"]")
    private WebElement changeCarButton;
    @FindBy(xpath = "//div[@class=\"form-area desktop-form\"]//select[@name=\"select_marca\"]")
    private WebElement marcaButton;
    @FindBy(xpath = "//div[@class='form-area desktop-form']//option[@value='139']")
    private WebElement daciaOption;
    @FindBy(xpath = "//div[@class=\"form-area desktop-form\"]//select[@name='select_model_desktop']")
    private WebElement modelButton;
    @FindBy(xpath = "//option[@value='5380']")
    private WebElement loganSelect;
    @FindBy(xpath = "//select[@id='carburant_desktop']")
    private WebElement carburantSelect;
    @FindBy(xpath = "//option[@value='benzina']")
    private WebElement benzinaSelect;
    @FindBy(xpath = "//select[@id='cilindree_desktop']")
    private WebElement cilindreeSelectButton;
    @FindBy(xpath = "//option[@value='1.4 (LSOA, LSOC, LSOE, LSOG)']")
    private WebElement cilindreeSelect;
    @FindBy(xpath = "//select[@id='motorizari_desktop']")
    private WebElement motorizariSelect;
    @FindBy(xpath = "//option[@value='18389']")
    private WebElement horsePowerSelect;
    @FindBy(xpath = "//div[@class=\"product-area bg-white\"]//button[@class=\"slide-arrow next-arrow slick-arrow\"]")
    private WebElement arrowClick;
    @FindBy(xpath = "(//img[@alt='Uleiuri si lubrifianti auto'])[3]")
    private WebElement oilButton;
    @FindBy(xpath = "//div[@class=\"electrice-left\"]//a[@href=\"/gmtn1:auto/gmtn2:uleiuri-si-lubrifianti-auto/gmtn3:ulei-motor/\"]")
    private WebElement motorOilTab;
    @FindBy(xpath = "//div[normalize-space()='Vascozitate (SAE)']")
    private WebElement vascozitateTab;
    @FindBy(xpath = "//a[text()='5W30']")
    private WebElement viscosity;
    @FindBy(xpath = "//div[normalize-space()='Cantitate (litri)']")
    private WebElement liters;
    @FindBy(xpath = "//a[text()='4']")
    private WebElement fourliters;
    @FindBy(xpath = "//p[text()='Ulei motor ELF EVOLUTION 900 SXR 5W30, volum 4 litri, sintetic']")
    private WebElement specificOil;
    @FindBy(xpath = "//form[@id='adauga_piesa_cos_66979']//button")
    private WebElement addToCartButton;
    @FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]//a[text()='Piese auto']")
    private WebElement autoPartsTabButton;
    @FindBy(xpath = "//input[@id='myInput']")
    private WebElement searchBar;
    @FindBy(xpath = "//a[text()='Pompa apa DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai '][1]")
    private WebElement pompaDeApa;


    public AutoPartsPageObject() {
        PageFactory.initElements(driver, this);
    }


    public void autoPartsAfterBrand() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //   js.executeScript("arguments[0].scrollIntoView();", pieseAutoDupaMarcaButton);
        js.executeScript("arguments[0].scrollIntoView();", pieseAutoDupaMarcaButton);
        js.executeScript("window.scrollBy(0, -350);");
    }


    public void chooseTheCar() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class).ignoring(StaleElementReferenceException.class);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bmwCarChoose = wait.until(ExpectedConditions.elementToBeClickable(bmwCarChoose));
        bmwCarChoose.click();
        seria3Model = wait.until(ExpectedConditions.elementToBeClickable(seria3Model));
        seria3Model.click();
        f30Button.click();
        engine318d.click();
        horsePower.click();
        String carIsSelected = driver.findElement(By.xpath("//h1[text()='Piese auto BMW Seria 3 (F30, F80) 318 d diesel 150 cai']")).getText();
        Assert.assertEquals("Piese auto BMW Seria 3 (F30, F80) 318 d diesel 150 cai", carIsSelected);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void changeCarButtonCheck() {
        changeCarButton.click();
        String checkIfButtonWorks = driver.findElement(By.xpath("//h2[text()=\"Alege masina\"]")).getText();
        Assert.assertEquals("Alege masina", checkIfButtonWorks);
    }


    public void changeCar() {
        marcaButton.click();
        daciaOption.click();
        modelButton.click();
        loganSelect.click();
        carburantSelect.click();
        benzinaSelect.click();
        cilindreeSelectButton.click();
        cilindreeSelect.click();
        motorizariSelect.click();
        horsePowerSelect.click();
        String carIsDacia = driver.findElement(By.xpath("//h1[text()='Piese auto DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai']")).getText();
        Assert.assertEquals("Piese auto DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai", carIsDacia);

    }

    public void oilPage() {
        int maxAttempts = 10;
        for (int attempt = 0; attempt < maxAttempts; attempt++) {

            arrowClick.click();


            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='single-product slick-slide slick-cloned']//p[contains(text(),'Uleiuri si lubrifianti auto')]")));

                break;
            } catch (Exception e) {
            }
        }
        oilButton.click();
        String oilTabVerify = driver.findElement(By.xpath("//h1[text()='Uleiuri si lubrifianti auto']")).getText();
        Assert.assertEquals("Uleiuri si lubrifianti auto", oilTabVerify);
    }


    public void motorOil() {
        motorOilTab.click();
        String motorOilTabVerify = driver.findElement(By.xpath("//h1[text()='Ulei motor']")).getText();
        Assert.assertEquals("Ulei motor", motorOilTabVerify);
    }


    public void filterOilType() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        vascozitateTab = wait.until(ExpectedConditions.elementToBeClickable(vascozitateTab));
        try {
            vascozitateTab.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        viscosity = wait.until(ExpectedConditions.elementToBeClickable(viscosity));
        try {
            viscosity.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        liters = wait.until(ExpectedConditions.elementToBeClickable(liters));
        try {
            liters.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        fourliters = wait.until(ExpectedConditions.elementToBeClickable(fourliters));
        try {
            fourliters.click();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    public void addToCartOil() {
        specificOil.click();
        addToCartButton.click();
        String cartProducts = driver.findElement(By.xpath("//div[@class='btn-group ml-20']//p")).getText();
        int value = Integer.parseInt(cartProducts);

        Assert.assertNotEquals("Oil was not added to  cart", 0, value);
    }

    public void autoPartsTab() {
        autoPartsTabButton.click();
    }

    public void searchProduct() {
        searchBar.sendKeys("pompa de apa");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        pompaDeApa = wait.until(ExpectedConditions.elementToBeClickable(pompaDeApa));
        pompaDeApa.click();
        String testMethod = driver.findElement(By.xpath("//h1[text()='Pompa apa DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai ']")).getText();
        Assert.assertEquals("Pompa apa DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai", testMethod);
    }


    public void chooseCheapestWaterPump() {
        List<WebElement> filteredElements = driver.findElements(By.xpath("//div[@class=\"single-sub-product\"]"));
        double smallestPrice = Double.MAX_VALUE;
        WebElement cheapestElement = null;

        for (WebElement element : filteredElements) {
            String priceRough = element.findElement(By.xpath(".//div[@class=\"bricolaje-bottom-text\"]/h4")).getText();
            double price =  0;
                price = Double.parseDouble(priceRough.replace(" Lei cu TVA", "").trim());
            if (price < smallestPrice) {
                smallestPrice = price;
                cheapestElement = element;

            }
        }
             Assert.assertFalse("This is not the cheapest water pump", smallestPrice > 112);
        if (cheapestElement != null) {
            cheapestElement.findElement(By.xpath(".//h4[@style=\"height: 72px;\"]")).click();
            driver.findElement(By.xpath("(//button[@onclick=\"document.getElementById('adauga_piesa_cos').submit();\"])")).click();

               String cartProducts = driver.findElement(By.xpath("//div[@class='btn-group ml-20']//p")).getText();
               int value = Integer.parseInt(cartProducts);

              Assert.assertNotEquals("Water pump was not added to  cart", 0, value);

        }
    }



    public void chooseTheMostExpensiveWaterPump() {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"single-sub-product\"]"));

        double biggestPrice = Double.MIN_VALUE;
        WebElement biggestPriceElement = null;

        for (WebElement element : elements) {

            String priceRough = element.findElement(By.xpath(".//div[@class=\"bricolaje-bottom-text\"]/h4")).getText();
            double price =  0;
            price = Double.parseDouble(priceRough.replace(" Lei cu TVA", "").trim());


            if (price > biggestPrice) {
                biggestPrice = price;
                biggestPriceElement = element;

            }
        }
            Assert.assertFalse("This is not the most expensive water pump", biggestPrice > 860);
            biggestPriceElement.findElement(By.xpath(".//h4[@style=\"height: 72px;\"]")).click();
            driver.findElement(By.xpath("(//button[@onclick=\"document.getElementById('adauga_piesa_cos').submit();\"])")).click();
            String cartProducts = driver.findElement(By.xpath("//div[@class='btn-group ml-20']//p")).getText();
             int value = Integer.parseInt(cartProducts);
            Assert.assertNotEquals("Water pump was not added to  cart", 0, value);
    }

    }






