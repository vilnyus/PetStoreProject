import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver StartBrowser(String browserName, String Url){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Projects\\PetStoreProject\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Projects\\PetStoreProject\\src\\test\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver", "D:\\Selenium_Projects\\PetStoreProject\\src\\test\\resources\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(Url);

        return driver;
    }
}
