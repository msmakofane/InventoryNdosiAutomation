package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement verify_homePage;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton;

    //Constructor
    public HomePage (WebDriver driver){
        this.driver = driver;

    }

    public void clickLoginButton() {
        loginButton.click();

    }

    public void verifyHomePageIsDisplayed()  {
        verify_homePage.isDisplayed();
    }

}
