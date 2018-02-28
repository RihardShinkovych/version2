package Methods.BlogStaticPages.PinterestPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyPinterestPage {
    public void verifyPinterestPage(WebDriver driver) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/a/div/div"));
        }
        if
                (driver.findElements(By.linkText("www.good.co")).size() != 0){

            System.out.println("Element is Present,Pinterest window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }

}
