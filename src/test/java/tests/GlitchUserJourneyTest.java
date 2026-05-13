package tests;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class GlitchUserJourneyTest extends BaseTest {

    @Test
    public void glitchUserJourney() throws InterruptedException {

        test = extent.createTest("Q3: Glitch User Journey", "Testing the performance glitch user journey with filter");

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        test.log(Status.INFO, "Logging in with performance_glitch_user credentials");
        loginPage.enterUsername("performance_glitch_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        test.log(Status.INFO, "Open hamburger menu and reset the app state");
        inventory.clickHamburger();
        Thread.sleep(1000);
        inventory.clickResetAppState();
        inventory.clickCrossIcon();

        test.log(Status.INFO, "Filtering products by name Z to A");
        inventory.clickFilter();
        inventory.clickZtoA();

        test.log(Status.INFO, "Adding the first product to the cart");
        inventory.setSelectFirstProduct();

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
        Assert.assertEquals(checkout.getFirstProductName(), "Test.allTheThings() T-Shirt (Red)", "Product name doesn't match!");
        Assert.assertEquals(checkout.getTotalPrice(), "Total: $17.27", "Price doesn't match!");

        test.log(Status.INFO, "Finishing the checkout process");
        checkout.clickFinishButton();

        test.log(Status.INFO, "Verifying successful order message");
        Assert.assertEquals(checkout.getSuccessMessage(), "Thank you for your order!", "Success message not found!");

        test.log(Status.INFO, "Re open the hamburger menu for reset the app state and logout");
        inventory.clickHamburger();
        Thread.sleep(1000);
        inventory.clickResetAppState();
        inventory.clickCrossIcon();
        inventory.logout();

    }

}