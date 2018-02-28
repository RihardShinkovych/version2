package Methods.BlogStaticPages.FbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FbLink {

    public void fbLink(WebDriver driver) {

        driver.findElement(By.xpath("//ul[@class='sf-menu right-menu']//li[@class='social_links_style2']//a[@href='https://www.facebook.com/thegoodco']")).click();

    }
}
