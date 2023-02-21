package com.nglcode.stepDefinitions;

import com.nglcode.builders.data.UserBuilder;
import com.nglcode.conf.DriverConfig;
import com.nglcode.pageObjects.SignUpServices;
import com.nglcode.tasks.NavigateTo;
import com.nglcode.tasks.UserSignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    // https://demo.automationtesting.in/Register.html

    @Autowired
    private SignUpServices signUpServices;

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp userSignUp;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {
        navigate.signUpPage();
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws InterruptedException {
        userSignUp.withInfo(
                UserBuilder.anUser()
                        .but()
                        .withoutEmail()
                        .build()
        );

        Thread.sleep(5000);
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}
