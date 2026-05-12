package tests;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class StandardUserJourneyTest extends BaseTest {

    @Test
    public void standardUserJourney() throws InterruptedException {

        test = extent.createTest("Q2: Standard User Journey", "Testing the standard user journey from login to checkout");

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        test.log(Status.INFO, "Logging in with standard_user credentials");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        test.log(Status.INFO, " Open hamburger menu and reset the app state ");
        inventory.clickHamburger();
        inventory.clickResetAppState();
        inventory.clickCrossIcon();

        test.log(Status.INFO, "Adding total 3 products to the cart");
        inventory.addProduct01ToCart();
        inventory.addProduct02ToCart();
        inventory.addProduct03ToCart();

        test.log(Status.INFO, "Navigating to the cart");
        inventory.clickToCart();

        test.log(Status.INFO, "Proceeding to checkout");
        cart.ClickCheckout();

        test.log(Status.INFO, "Entering checkout details");
        checkout.enterFirstName("Sourav Dipto");
        checkout.enterLastName("Apu");
        checkout.enterPostalCode("12345");
        checkout.clickContinueButton();

        test.log(Status.INFO, "Verifying Product Name and Total Price");
        Assert.assertEquals(checkout.getFirstProductName(), "Sauce Labs Bike Light", "Product name doesn't match!");
        Assert.assertEquals(checkout.getTotalPrice(), "Total: $82.05", "Price doesn't match!");

        test.log(Status.INFO, "Finishing the checkout process");
        checkout.clickFinishButton();

        test.log(Status.INFO, "Verifying successful order message");
        Assert.assertEquals(checkout.getSuccessMessage(), "Thank you for your order!", "Success message not found!");

        test.log(Status.INFO, "Re open the hamburger menu for reset the app state and logout");
        inventory.clickHamburger();
        inventory.clickResetAppState();
        inventory.clickCrossIcon();
        inventory.logout();

    }

}