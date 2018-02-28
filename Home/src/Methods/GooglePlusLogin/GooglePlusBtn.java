package Methods.GooglePlusLogin;

import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePlusBtn {
    public void ClickOnGooglePlusLoginButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.linkText("Continue with Google+")).click();


        Thread.sleep(100);
    }

}

