package Tests;

import Utils.ReadFromFile;
import Utils.TakeScreenshots;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static Utils.ReadFromFile.deliveryAddress;
import static Utils.ReadFromFile.discountCode;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@Test
public class InventoryAutomationTest extends Base {


//    public void verifyHomePageIsDisplayed(){
//        homePage.verifyHomePageIsDisplayed();
//    }

    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

//    @Test (dependsOnMethods = "clickLoginButton")
//    public void verifyLoginPageIsDisplayed() {
//        loginPage.verifyLoginPageIsDisplayed();
//    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);

    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void enterPassword() throws InterruptedException {
        loginPage.enterPassword(ReadFromFile.password);
        Thread.sleep(2000);
        takeScreenshots.takeSnapShots(driver, "LoginPage001");
    }


    @Test(dependsOnMethods = "enterPassword")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();

    }

    @Test(dependsOnMethods = "userClickLoginButton")
    public void checkHomePageIsDisplayed() {
        inventoryForm.verifyHomePageTextDisplayed();
        takeScreenshots.takeSnapShots(driver, "InventoryForm001");


    }

    @Test(dependsOnMethods = "userClickLoginButton")
    public void userClickLearnDropdown() {
        inventoryForm.clickLearnDropdown();
    }

    @Test(dependsOnMethods = "userClickLearnDropdown")
    public void userClickLearningMaterial() {
        inventoryForm.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "userClickLearningMaterial")
    public void userWebAutomationAdvance() {
        inventoryForm.clickwWebAutomationAdvance();
    }

    @Test(dependsOnMethods = "userWebAutomationAdvance")
    public void userExpandInventoryForm() {
        inventoryForm.expandInventoryForm();
    }

    @Test(dependsOnMethods = "userExpandInventoryForm")
    public void userSelectDeviceTpye() {
        inventoryForm.selectDeviceType("Phone");

    }

    @Test(dependsOnMethods = "userSelectDeviceTpye")
    public void userSelectBrand() {
        inventoryForm.selectBrand("Apple");
    }

    @Test(dependsOnMethods = "userSelectBrand")
    public void userSelectStorageTpye() {
        inventoryForm.phoneStorage();
    }

    @Test(dependsOnMethods = "userSelectStorageTpye")
    public void userSelectDeviceColor() {
        inventoryForm.selectDeviceColor("Blue");
    }

    @Test(dependsOnMethods = "userSelectDeviceColor")
    public void userInputsDeviceQuantity() {
        inventoryForm.inputDeviceQuantity();

    }

    @Test(dependsOnMethods = "userInputsDeviceQuantity")
    public void userEnterDeliveryAddress() {
        inventoryForm.enterDeliveryAddress(deliveryAddress);
    }

    @Test(dependsOnMethods = "userEnterDeliveryAddress")
    public void userClickInventoryNextBtn() {
        inventoryForm.clickInventoryNextbtn();
    }

    @Test(dependsOnMethods = "userClickInventoryNextBtn")
    public void userSelectsShippingMethod() {
        inventoryForm.selectShippingMethod();
    }

    @Test(dependsOnMethods = "userSelectsShippingMethod")
    public void userSelectWarranty()   {inventoryForm.selectWarranty();

    }


    @Test(dependsOnMethods = "userSelectWarranty")
    public void userEnterDiscountCode() {
        inventoryForm.enterDiscountCode(discountCode);
    }

    @Test(dependsOnMethods = "userEnterDiscountCode")
    public void userClicksConfirmPurchase() {
        inventoryForm.clickConfirmPurchase();
    }

    @Test(dependsOnMethods = "userClicksConfirmPurchase")
    public void userConfirmsSuccessMsgDisplayed() {
        inventoryForm.verifyHomePageTextDisplayed();
    }

    @Test(dependsOnMethods = "userConfirmsSuccessMsgDisplayed")
    public void userClicksViewInvoice() {
        inventoryForm.userViewInvoice();

    }

    @Test(dependsOnMethods = "userClicksViewInvoice")
    public void userClicksViewInvoiceBtn() {
        inventoryForm.userClicksViewInvoice();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
