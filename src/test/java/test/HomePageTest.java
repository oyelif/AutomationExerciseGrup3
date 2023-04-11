package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void homePageTest() {

        // verify that HomePage
        driver.get(ConfigurationReader.get("url"));

        String expectedText = "Automation";
        Assert.assertEquals(homePage.automation.getText(), expectedText);

    }

    @Test
    public void verifyToLogin() {

        // verify SignUp/Login button
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.isDisplayed();
    }


    @Test
    public void navigateToLoginPage() {

        // Verify that SignUp/Login button aktiv
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.isDisplayed();
        homePage.toLogin.click();
    }

}
