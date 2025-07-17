package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screen.*;

public class MyStepdefs {

    @Given("navigate to the contact form")
    public void navigateToTheContactForm() throws InterruptedException{
        MainScreen.homeScreen();
        Thread.sleep(3000);
        MainScreen.contactForm();
        Thread.sleep(3000);
    }

    @When("user enter his,her name")
    public void userEnterHisHerName() {
        ContactScreen.isAtContactFormScreen();
        ContactScreen.enterYourName();
    }
    @And("user enter valid email")
    public void userEnterValidEmail() {
        ContactScreen.enterYourEmail();
    }

    @And("user enter message")
    public void userEnterMessage() {
        ContactScreen.enterYourMessage();
    }

    @And("Click on submit button")
    public void clickOnSubmitButton() throws InterruptedException {
        ContactScreen.clickSubmit();
        Thread.sleep(5000);
    }

    @Then("verify information submitted successfully")
    public void verifyInformationSubmittedSuccessfully() {
        ContactScreen.isSubmitSuccessful();
        ContactScreen.checkSubmitMessage();
    }
}
