package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        actions=new Actions(driver);
        wait=new WebDriverWait(Driver.get(),15);
        //driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.close();
        Driver.closeDriver();

    }
}
