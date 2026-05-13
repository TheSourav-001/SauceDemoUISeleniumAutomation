package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    By HamburgerMenu = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By resetAppState = By.xpath("//*[@id=\"reset_sidebar_link\"]");
    By logout = By.xpath("//*[@id=\"logout_sidebar_link\"]");
    By clickCrossIcon = By.xpath("//*[@id=\"react-burger-cross-btn\"]");
    By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    By Product01 = By.id("add-to-cart-sauce-labs-bike-light");
    By Product02 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By Product03 = By.id("add-to-cart-sauce-labs-fleece-jacket");

    By filter = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
    By clickZtoA = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
    By selectFirstProduct = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHamburger() {
        driver.findElement(HamburgerMenu).click();
    }

    public void clickResetAppState () {
        driver.findElement(resetAppState).click();
    }

    public void clickCrossIcon () {
        driver.findElement(clickCrossIcon).click();
    }


    public void logout () {
        driver.findElement(logout).click();
    }

    public void  addProduct01ToCart () {
        driver.findElement(Product01).click();
    }

    public void  addProduct02ToCart () {
        driver.findElement(Product02).click();
    }

    public void  addProduct03ToCart () {
        driver.findElement(Product03).click();
    }

     public void clickToCart () {
        driver.findElement(cart).click();
    }

        public void clickFilter () {
            driver.findElement(filter).click();
        }

        public void clickZtoA () {
            driver.findElement(clickZtoA).click();
        }

        public void setSelectFirstProduct () {
            driver.findElement(selectFirstProduct).click();
        }
}

