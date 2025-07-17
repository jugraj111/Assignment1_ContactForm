package setup.driver;

import common.CommonConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SeleniumWebDriver extends CommonConfig {
    public static WebDriver driver;
    public static WebDriver initChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/singh/OneDrive/Desktop/drivers/newChrome/chromedriver.exe");//path of your driver
        //System.setProperty("webdriver.chrome.driver",chromePath());
        driver = new ChromeDriver();
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        //driver.close();
    }
    public static WebDriver getWebDriver() {
        return driver;
    }
}
