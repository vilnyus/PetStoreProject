import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "user-name")
    @CacheLookup
    WebElement userName;

    @FindBy(how = How.ID, using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    @CacheLookup
    WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    @CacheLookup
    WebElement loginError;

    public void LoginToPage(String myUserName, String myPassword){
        userName.sendKeys(myUserName);
        password.sendKeys(myPassword);
        loginButton.click();
    }
}
