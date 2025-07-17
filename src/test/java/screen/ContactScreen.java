package screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

public class ContactScreen extends SeleniumWebDriver {
    public static void isAtContactFormScreen(){
        contactFormScreen().isDisplayed();
    }
    public static void enterYourName(){
        nameField().sendKeys("Jugraj Singh");
    }
    public static void enterYourEmail(){
        emailField().sendKeys("jugraj111@gmail.com");
    }
    public static void enterYourMessage(){
        messageField().sendKeys("Assignment1 to fill up contact form of Skill Up Automation site");
    }
    public static void clickSubmit(){
        submitButton().click();
    }
    public static void isSubmitSuccessful(){
        submitMessage().isDisplayed();
    }
    public static void checkSubmitMessage(){
        String text = submitMessage().getText();
        System.out.println(text);
    }


//All the required locators of Contact Form Screen
    public static WebElement contactFormScreen(){
        return getWebDriver().findElement(By.xpath("//h2[text() = 'Contact']"));
    }
    public static WebElement nameField(){
        return getWebDriver().findElement(By.xpath("//input[@id = 'g15-name']"));
    }
    public static WebElement emailField(){
        return getWebDriver().findElement(By.xpath("//input[@id = 'g15-email']"));
    }
    public static WebElement messageField(){
        return getWebDriver().findElement(By.xpath("//textarea[@id = 'contact-form-comment-g15']"));
    }
    public static WebElement submitButton(){
        return getWebDriver().findElement(By.xpath("//button[text() = 'Submit']"));
    }
    public static WebElement submitMessage(){
        return getWebDriver().findElement(By.xpath("//h4[@id = 'contact-form-success-header']"));
    }

}
