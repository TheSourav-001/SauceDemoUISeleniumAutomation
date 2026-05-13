package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By usernameField = By.xpath("//*[@id=\"user-name\"]");
    By passwordFiled = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@id=\"login-button\"]");
    By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordFiled).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
