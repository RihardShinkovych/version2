package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public String baseUrl = "https://preview-web.good.co/";

    @BeforeMethod
    public void SetUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rihard Shinkovych\\Desktop\\Home\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(500);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}
