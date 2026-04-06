package Tests;

import Utils.ReadFromFile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@ Test
public class InventoryAutomationTest extends Base {


//    public void verifyHomePageIsDisplayed(){
//        homePage.verifyHomePageIsDisplayed();
//    }

    public void clickLoginButton()  {
        homePage.clickLoginButton();
    }

//    @Test (dependsOnMethods = "clickLoginButton")
//    public void verifyLoginPageIsDisplayed() {
//        loginPage.verifyLoginPageIsDisplayed();
//    }

    @Test (dependsOnMethods = "clickLoginButton")
    public void userEnterEmail(){
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test (dependsOnMethods = "userEnterEmail")
    public void enterPassword(){
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test (dependsOnMethods = "enterPassword")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }
    @Test (dependsOnMethods = "userClickLoginButton")
    public void checkHomePageIsDisplayed() {
        dashboardPage.verifyHomePageTextDisplayed();


    }

    @Test (dependsOnMethods = "userClickLoginButton")
    public void userClickLearnDropdown(){
        dashboardPage.clickLearnDropdown();
    }

    @Test (dependsOnMethods = "userClickLearnDropdown")
    public void userClickLearningMaterial(){
        dashboardPage.clickLearningMaterial();
    }

    @Test (dependsOnMethods = "userClickLearningMaterial")
    public void userWebAutomationAdvance(){
        dashboardPage.clickwWebAutomationAdvance();
    }

    @Test (dependsOnMethods = "userWebAutomationAdvance")
    public void userExpandInventoryForm(){
        dashboardPage.expandInventoryForm();
    }

    @Test (dependsOnMethods = "userExpandInventoryForm")
    public void userSelectDeviceTpye() {
        dashboardPage.selectDeviceType("Phone");

    }
    @Test (dependsOnMethods = "userSelectDeviceTpye")
    public void userSelectBrand() {
        dashboardPage.selectBrand("Apple");
    }

    @Test (dependsOnMethods = "userSelectBrand")
    public void userSelectStorageTpye()  {
        dashboardPage.phoneStorage();
    }

    @Test (dependsOnMethods = "userSelectStorageTpye")
    public void userSelectDeviceColor() {
        dashboardPage.selectDeviceColor("Blue");
    }

    @Test (dependsOnMethods = "userSelectDeviceColor")
    public void userInputsDeviceQuantity()  {
        dashboardPage.inputDeviceQuantity();

    }

    @Test (dependsOnMethods = "userInputsDeviceQuantity")
    public void userEnterDeliveryAddress(){
        dashboardPage.enterDeliveryAddress();
    }

    @Test (dependsOnMethods = "userEnterDeliveryAddress")
    public void userClickInventoryNextBtn(){
        dashboardPage.clickInventoryNextbtn();
    }

    @Test (dependsOnMethods = "userClickInventoryNextBtn")
    public void userSelectsShippingMethod(){
        dashboardPage.selectShippingMethod();
    }

    @Test (dependsOnMethods = "userSelectsShippingMethod")
    public void userSelectWarranty(){
        dashboardPage.selectWarranty();
    }

    @Test (dependsOnMethods = "userSelectWarranty")
    public void userEnterDiscountCode(){
        dashboardPage.enterDiscountCode();
    }

    @Test (dependsOnMethods = "userEnterDiscountCode")
    public void userClicksConfirmPurchase(){
        dashboardPage.clickConfirmPurchase();
    }

    @Test (dependsOnMethods = "userClicksConfirmPurchase")
    public void userConfirmsSuccessMsgDisplayed() {
        dashboardPage.verifyHomePageTextDisplayed();
    }

    @Test (dependsOnMethods = "userConfirmsSuccessMsgDisplayed")
    public void userClicksViewInvoice() {
        dashboardPage.userViewInvoice();

    }

    @Test (dependsOnMethods = "userClicksViewInvoice")
    public void userClicksViewInvoiceBtn(){
        dashboardPage.userClicksViewInvoice();
    }
}
