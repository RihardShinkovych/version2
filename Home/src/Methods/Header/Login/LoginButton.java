package Methods.Header.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginButton {
    public void loginBtnDropdown(WebDriver driver) throws InterruptedException {
        Thread.sleep(250);
        driver.findElement(By.linkText("Log In")).click();
        Thread.sleep(1250);
    }

}
