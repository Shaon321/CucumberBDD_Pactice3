package stepDef;

import base.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signup_page;

public class signup_steps extends Setup {
    signup_page sp = new signup_page(driver);
    Faker faker = new Faker();


    @And("I enter a Student information")
    public void iEnterAStudentInformation() {
        sp.enterFirstName(faker.name().firstName());
        sp.enterLastName(faker.name().lastName());
        sp.enterEmail(faker.internet().safeEmailAddress());
        sp.enterPassword("Test12345");
        sp.enterConfirmPassword("Test12345");
        sp.enterMonth("Feb");
        sp.enterDate("29");
        sp.enterYear("1975");
        sp.selectGender();
        sp.agreeChkBox();

    }



    @When("I click on Create my new account button")
    public void iClickOnCreateMyNewAccountButton() {
        sp.clickCreateMyAcct();


    }

    @Then("I should see Thank you for sign up message")
    public void iShouldSeeThankYouForSignUpMessage() {
        sp.getThankYouMsg();

    }
}
