package Methods.FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookBtn {
    public void clickOnFacebookBtn(WebDriver driver) throws InterruptedException {
Thread.sleep(1000);
        driver.findElement(By.linkText("Continue with Facebook")).click();
    }
}
