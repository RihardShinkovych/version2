package Methods.BlogStaticPages.TwitterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwitterLink {
    public void twitterIcon(WebDriver driver) {
        driver.findElement(By.xpath("//ul[@class='sf-menu right-menu']//li[@class='social_links_style2']//a[@href='https://twitter.com/ingoodco']")).click();

    }
}
