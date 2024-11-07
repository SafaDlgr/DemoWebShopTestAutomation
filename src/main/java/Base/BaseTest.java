package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{


    @BeforeMethod
    public void getBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
    }

    @AfterMethod
    public void closerBrowser(){
        driver.quit();
    }

}
