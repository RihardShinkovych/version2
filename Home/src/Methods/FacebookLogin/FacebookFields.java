package Methods.FacebookLogin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class FacebookFields {
    public void loginWithFacebook(WebDriver driver, String email, String password) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            if (driver.getTitle().contains("Facebook")) {
                driver.findElement(By.id("email")).sendKeys(email);
                driver.findElement(By.id("pass")).sendKeys(password);
                driver.findElement(By.name("login")).click();
                Thread.sleep(2000);
            }
            driver.switchTo().window(winHandleBefore);
        }
    }
}
