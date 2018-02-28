package Methods.Header.Login.TeamDynamics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TDGooglePlusLogin {
    public void tDGooglePlusLogin(WebDriver driver, String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='LoginOptionsModalTD']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//ul[@class='menu']//li[@class='google-button']")).click();
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);

            if (driver.getTitle().contains("Sign in")) {
                driver.findElement(By.id("identifierId")).sendKeys(email);
                driver.findElement(By.id("identifierNext")).click();
                driver.findElement(By.name("password")).sendKeys(password);
                Thread.sleep(1000);
                driver.findElement(By.id("passwordNext")).click();
                Thread.sleep(2000);
            }
            //// Switch back to original browser (first window)
            driver.switchTo().window(winHandleBefore);

        }
    }
}