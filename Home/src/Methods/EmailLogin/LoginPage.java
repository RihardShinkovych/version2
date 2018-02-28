package Methods.EmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public void login(WebDriver driver, String email, String password) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/input[1]")).sendKeys(email);
    }
}