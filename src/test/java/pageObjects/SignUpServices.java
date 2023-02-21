package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpServices {

    private WebDriver driver;
    private SignUpPageObject signUpPageObject;

    public SignUpServices(WebDriver driver) {
        this.driver = driver;
        signUpPageObject = new SignUpPageObject(driver);
    }

    public void goTo(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.signUpPageObject.getFirstNameTextBox().sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastNameTextBox().sendKeys(lastName);
    }

    public void writeEmail(String email) {
        this.signUpPageObject.getEmailAddress().sendKeys(email);
    }

    public void writePhone(String phone) {
        this.signUpPageObject.getPhone().sendKeys(phone);
    }

    private void selectMale() {
        this.signUpPageObject.getGenderMale().click();
    }

    private void selectFemale() {
        this.signUpPageObject.getGenderFemale().click();
    }

    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getCountry()).selectByValue(country);
    }

    public void selectBirthDay(String day) {
        new Select(this.signUpPageObject.getDateOfBirthDay()).selectByValue(day);
    }

    public void selectBirthMonth(String month) {
        new Select(this.signUpPageObject.getDateOfBirthMonth()).selectByValue(month);
    }

    public void selectBirthYear(String year) {
        new Select(this.signUpPageObject.getDateOfBirthYear()).selectByValue(year);
    }

    public void writePassword(String password) {
        this.signUpPageObject.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String password) {
        this.signUpPageObject.getConfirmPassword().sendKeys(password);
    }

    public void clickOnSubmit() {
        this.signUpPageObject.getSubmit().click();
    }

//    public void selectGender(Gender gender) {
//        if (gender == Gender.female) {
//            selectFemale();
//        } else {
//            selectMale();
//        }
//    }
}
