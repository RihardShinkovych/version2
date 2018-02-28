package Methods.Header.Login.TeamDynamics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamDynamics {
    public void tDLogin(WebDriver driver) throws InterruptedException {
        Thread.sleep(200);
        driver.findElement(By.linkText("Team Dynamics")).click();
        Thread.sleep(200);
    }
}
