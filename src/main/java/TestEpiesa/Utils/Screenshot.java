package TestEpiesa.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {



        public static void captureScreenshot(WebDriver driver, String scenarioName) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                String screenshotName = "screenshot_" + scenarioName + "_" + timeStamp + ".png";
                File target = new File("screenshots/" + screenshotName);
                FileUtils.copyFile(source, target);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


