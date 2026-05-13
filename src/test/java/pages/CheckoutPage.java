package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By firstProductName = By.className("inventory_item_name");
    By totalPriceLabel = By.className("summary_total_label");
    By successMessage = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(this.postalCode).sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(this.continueButton).click();
    }

    public void clickFinishButton() {
        driver.findElement(this.finishButton).click();
    }

    public String getFirstProductName() {
        return driver.findElement(this.firstProductName).getText();
    }

    public String getTotalPrice() {
        return driver.findElement(this.totalPriceLabel).getText();
    }

    public String getSuccessMessage() {
        return driver.findElement(this.successMessage).getText();
    }
}