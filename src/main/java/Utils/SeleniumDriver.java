package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SeleniumDriver {
    public static WebDriver driver;

    @BeforeMethod
    public static void initialiseDriver() {
        String path = System.getProperty("user.dir");
        //System.out.println(path); //use it if unsure of your local path
        //C:\Program Files\Automation Projects\AutomationPractice\src\main\resources\chromedriver\chromedriver.exe
        System.setProperty("webdriver.chrome.driver",path+"/src/main/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    public void goToUrl(final String host) {
        driver.get(host);
        driver.manage().window().maximize();
    }
}
