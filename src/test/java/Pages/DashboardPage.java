package Pages;

import Utils.ReadFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/h3")
    WebElement textDetails;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnDropdown;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learingMaterials;
    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement webAutomationAdvance;
    @FindBy(xpath = "//*[@id=\"assessment-instructions\"]/summary")
    WebElement clickInventoryForm;
    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;
    @FindBy(id = "brand")
    WebElement brandDropdown;
    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")
    WebElement deviceStorage;
    @FindBy(id = "color")
    WebElement deviceColorDropdown;
    @FindBy(id = "quantity")
    WebElement deviceQuantity;
    @FindBy(id = "address")
    WebElement deliveryAddressField;
    @FindBy(id = "inventory-next-btn")
    WebElement inventoryNextbtn;
    //    @FindBy(xpath = "//*[@id=\"assessment-instructions\"]/summary")
//    WebElement inventoryFormReq;
    @FindBy(id = "shipping-express")
    WebElement shippingMethod;
    @FindBy(id = "warranty-1yr")
    WebElement warranty;
    @FindBy(id = "discount-code")
    WebElement discountCodeField;
    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountBtn;
    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchase;
    @FindBy(xpath = "//*[@id=\"purchase-success-toast\"]/p[1]")
    WebElement successToastMsg;
    @FindBy(id = "view-history-btn")
    WebElement viewInvoice;
    @FindBy(css = "#invoices-list  > div:nth-child(1) > div> [id^='view-invoice-INV-']")
    WebElement viewInvoiceButton;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageTextDisplayed() {
        textDetails.isDisplayed();
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(textDetails));
    }

    public void clickLearnDropdown() {
        learnDropdown.click();
    }

    public void clickLearningMaterial() {
        learingMaterials.click();
    }

    public void clickwWebAutomationAdvance() {
        webAutomationAdvance.click();
    }

    public void expandInventoryForm() {
        clickInventoryForm.click();

    }

    public void selectDeviceType(String deviceType) {
        Select select = new Select(deviceTypeDropdown);
        select.selectByVisibleText(deviceType);
    }

    public void selectBrand(String brand) {
        Select select = new Select(brandDropdown);
        select.selectByVisibleText(brand);
    }

    public void phoneStorage() {
        deviceStorage.click();
    }

    public void selectDeviceColor(String color) {
        Select select = new Select(deviceColorDropdown);
        select.selectByVisibleText(color);
    }

//    public void inputDeviceQuantity(String quantity) {
//        Select select = new Select(deviceQuantity);
//        select.selectByVisibleText(quantity);


    public void inputDeviceQuantity() {
        deviceQuantity.clear();
        deviceQuantity.sendKeys("2");
    }

    public void enterDeliveryAddress(String deliveryAddress) {
        deliveryAddressField.sendKeys(deliveryAddress);
    }

    public void clickInventoryNextbtn() {
        inventoryNextbtn.click();
    }

    public void selectShippingMethod() {
        shippingMethod.click();

    }

    public void selectWarranty() {
        warranty.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCodeField.sendKeys(discountCode);
        applyDiscountBtn.click();
    }

    public void clickConfirmPurchase() {
        confirmPurchase.click();
    }

    public void verifySuccessToastMsdDisplayed() {
        successToastMsg.isDisplayed();
    }

    public void userViewInvoice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(viewInvoice));

        // Scroll the element into the middle of the screen
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", viewInvoice);

        // Now try a standard click
        viewInvoice.click();

    }

    public void userClicksViewInvoice() {
        viewInvoiceButton.click();
    }
}
