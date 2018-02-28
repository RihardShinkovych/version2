package Methods.Header.Login.MyTeam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTeam {
    public void myTeam(WebDriver driver){
        driver.findElement(By.linkText("My Account"));
    }
}
