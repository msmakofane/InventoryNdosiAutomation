package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-heading\"]/span")
    WebElement verifyLoginHeading;

    @FindBy(id = "login-email")
    WebElement emailField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement submitButton;


    public void verifyLoginPageIsDisplayed()  {
        verifyLoginHeading.isDisplayed();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);

    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        submitButton.click();
        Thread.sleep(5000);

    }
}
