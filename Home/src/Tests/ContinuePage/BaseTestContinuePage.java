package Tests.ContinuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestContinuePage {
    public WebDriver driver;
    public String baseUrl = "https://preview-web.good.co/blog/";

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rihard Shinkovych\\Desktop\\Home\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}