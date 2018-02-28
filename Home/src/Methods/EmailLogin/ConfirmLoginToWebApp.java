package Methods.EmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmLoginToWebApp {

    public void signInBtn(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(500);
    }
}
