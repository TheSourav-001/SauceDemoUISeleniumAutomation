package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By clickCheckout = By.xpath("//*[@id=\"checkout\"]");

    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    public void ClickCheckout() {
        driver.findElement(clickCheckout).click();
    }
}



