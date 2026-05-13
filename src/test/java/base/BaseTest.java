package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import config.ConfigReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite
    public void setUpReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            test.log(Status.FAIL,
                    "Test Failed! Error Details: " + result.getThrowable());

            TakesScreenshot ts = (TakesScreenshot) driver;

            String screenshotBase64 =
                    ts.getScreenshotAs(OutputType.BASE64);

            test.addScreenCaptureFromBase64String(
                    screenshotBase64,
                    "Screenshot of the error"
            );

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            test.log(Status.PASS,
                    "Test Passed Successfully!");
        }

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}