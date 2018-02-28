package Methods.BlogStaticPages.PinterestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PinterestLink {
    public void pinterestLink(WebDriver driver) {

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/ul/li/a[2]")).click();

    }
}
