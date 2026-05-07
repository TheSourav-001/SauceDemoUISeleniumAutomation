package tests;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginErrorTest extends BaseTest {

    @Test
    public void verifyLockedOutUser() {

        test = extent.createTest("Q1: Verify Locked Out User", "Testing login with locked_out_user and verifying error message");
        LoginPage loginPage = new LoginPage(driver);

        test.log(Status.INFO, "Entering locked_out_user username and password and attempting to login");
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");

        test.log(Status.INFO, "Clicking the login button");
        loginPage.clickLoginButton();

        test.log(Status.INFO, "Retrieving the error message and displayed on the login page");
        String actualError = loginPage.getErrorMessage();

        String expectedError = "Epic sadface: Sorry, this user has been locked out.";

        Assert.assertEquals(actualError, expectedError, "Error message did not match!");
    }

}
