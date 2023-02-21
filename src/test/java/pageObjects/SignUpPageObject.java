package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageObject {

    private WebDriver driver;

    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameTextBox = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameTextBox = By.xpath("//input[@ng-model='LastName']");
    private By emailAddress = By.xpath("//input[@type='email']");
    private By phone = By.xpath("//input[@type='tel']");
    private By genderMale = By.xpath("//input[@value='Male']");
    private By genderFemale = By.xpath("//input[@value='FeMale']");
    private By country = By.id("countries");
    private By dateOfBirthYear = By.id("yearbox");
    private By dateOfBirthMonth = By.xpath("//select[@ng-model='monthbox']");
    private By dateOfBirthDay = By.id("daybox");
    private By password = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By submit = By.id("submitbtn");

    public void writeFirstName(String firstname) {
        this.driver.findElement(this.firstNameTextBox).sendKeys(firstname);
    }

    public void writeLastName(String lastname) {
        this.driver.findElement(this.lastNameTextBox).sendKeys(lastname);
    }

    public void writeEmail(String email) {
        this.driver.findElement(this.emailAddress).sendKeys(email);
    }

    public void writePhone(String phone) {
        this.driver.findElement(this.phone).sendKeys(phone);
    }

    public void selectMale() {
        this.driver.findElement(this.genderMale).click();
    }

    public void selectFemale() {
        this.driver.findElement(this.genderFemale).click();
    }



}
