import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin {
    WebDriver driver;
    LoginPage lp;


    @Test(enabled = true, priority = 1)
    public void StandartUserLogin(){
        driver = BrowserFactory.StartBrowser("edge", "https://www.saucedemo.com/");

        lp = PageFactory.initElements(driver, LoginPage.class);
        lp.LoginToPage("standard_user", "secret_sauce");

        driver.quit();
    }

    @Test(enabled = true, priority = 2)
    public void LockedoutUserLogin(){
        driver = BrowserFactory.StartBrowser("edge", "https://www.saucedemo.com/");

        lp = PageFactory.initElements(driver, LoginPage.class);
        lp.LoginToPage("locked_out_user", "secret_sauce");

        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", lp.loginError.getText());

        driver.quit();
    }

    @Test(enabled = true, priority = 3)
    public void ProblemUserLogin(){
        driver = BrowserFactory.StartBrowser("chrome", "https://www.saucedemo.com/");

        lp = PageFactory.initElements(driver, LoginPage.class);
        lp.LoginToPage("problem_user", "secret_sauce");

        driver.quit();
    }

    @Test(enabled = true, priority = 4)
    public void PerformanceGlitchUserLogin(){
        driver = BrowserFactory.StartBrowser("edge", "https://www.saucedemo.com/");

        lp = PageFactory.initElements(driver, LoginPage.class);
        lp.LoginToPage("performance_glitch_user", "secret_sauce");

        driver.quit();
    }

}
