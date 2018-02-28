package Methods.Header.Login.TeamDynamics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TDFbLogin {
    public void tDfbLogin(WebDriver driver, String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='LoginOptionsModalTD']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//ul[@class='menu']//li[@class='facebook-button']")).click();
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
