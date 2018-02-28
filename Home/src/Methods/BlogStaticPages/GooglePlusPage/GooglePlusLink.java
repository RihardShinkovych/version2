package Methods.BlogStaticPages.GooglePlusPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePlusLink {
    public void googlePlusLink (WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/ul/li/a[6]")).click();
    }
}
