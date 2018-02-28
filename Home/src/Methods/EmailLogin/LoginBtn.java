package Methods.EmailLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBtn {
    public void loginBtn(WebDriver driver) {

        driver.findElement(By.className("email-login-link")).click();
    }
}
