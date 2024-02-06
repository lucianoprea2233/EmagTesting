package TestEpiesa.Pages;


import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BasePage {


    public static void setChromeProperty() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

    }

    public static WebDriver driver = new ChromeDriver();


    public void quitDriver() {
        if (driver != null) {
           driver.quit();
     }
   }
    Actions actions = new Actions(driver);
}




