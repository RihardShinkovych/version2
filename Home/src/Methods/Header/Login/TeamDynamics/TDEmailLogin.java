package Methods.Header.Login.TeamDynamics;

import com.thoughtworks.selenium.webdriven.commands.KeyPressNative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TDEmailLogin {
    public void tDemail(WebDriver driver, String email, String password) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='LoginOptionsModalTD']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//ul[@class='menu']//li[@class='email-button']//a[@class='email-login-link modal-switch']//span[@class='email']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='LoginModalTD']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//input[@type='text']")).sendKeys(email);
        driver.findElement(By.xpath("//div[@id='LoginModalTD']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']//input[@type='password']")).sendKeys(password);
        Thread.sleep(500);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER);


        Thread.sleep(20000);
    }
//    Test below


}
