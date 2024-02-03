package TestEmag.EmagTest.Pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

public class BasePage {

    public static WebDriver webDriver;
    public static void setChromeDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }
    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();

    }
    @BeforeClass
    public static void homePage(){
        setChromeDriverProperty();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        webDriver = new ChromeDriver(options);
        webDriver.get("www.emag.ro");


    }




}
