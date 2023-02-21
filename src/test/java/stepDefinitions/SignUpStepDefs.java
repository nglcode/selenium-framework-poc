package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SignUpPageObject;
import pageObjects.SignUpServices;
import utils.HookDriver;

public class SignUpStepDefs {

    // https://demo.automationtesting.in/Register.html

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {
        SignUpServices signUpServices = new SignUpServices(HookDriver.driver);
        signUpServices.goTo("https://demo.automationtesting.in/Register.html");
        signUpServices.writeFirstName("Marco");
        signUpServices.writeLastName("Polo");
        signUpServices.writeEmail("marco@polo.ccom");
        signUpServices.writePhone("2222226655");
//        signUpServices.selectMale();
        signUpServices.clickOnSubmit();
//        signUpServices.selectCountry("Australia");
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}
