package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void verifyLoginPage() {
        // Verify that LoginPage view
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.click();
        //loginPage.loginText.isDisplayed();
        String expectedText = "Login to your account";
        Assert.assertEquals(loginPage.loginText.getText(), expectedText);

    }

    @Test
    public void toLogin() {
        // Verfy that access the user account with a valid eMail address and valid password
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.click();
        loginPage.inputLoginEmail.sendKeys(ConfigurationReader.get("userEmail"));
        loginPage.inputLoginPassword.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();
        //  loginPage.login();  // yukaridaki 3 satir yerine bunu da kullanabilirim


        //name : Batch7G3
        // mail : Grup3@gmail.com
        // password : Grup3
    }
}
