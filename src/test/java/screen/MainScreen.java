package screen;

import org.openqa.selenium.By;
import setup.driver.SeleniumWebDriver;

public class MainScreen extends SeleniumWebDriver {
    public static void homeScreen() {
        getWebDriver().get("https://skillupautomation.com/");
    }
    public static void contactForm(){
        getWebDriver().findElement(By.xpath("//span[text() = 'Contact'][1]")).click();
    }

}
