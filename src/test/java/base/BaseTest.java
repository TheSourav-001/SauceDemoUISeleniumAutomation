package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    // রিপোর্টের জন্য ৩টি ভেরিয়েবল
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite // সব টেস্টের একদম শুরুতে একবার রান হবে
    public void setUpReport() {
        // রিপোর্টটি target ফোল্ডারে ExtentReport.html নামে সেভ হবে
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite // সব টেস্ট শেষ হওয়ার পর ফাইলটা সেভ করবে
    public void tearDownReport() {
        extent.flush(); // এটা না দিলে রিপোর্ট তৈরি হবে না!
    }
}