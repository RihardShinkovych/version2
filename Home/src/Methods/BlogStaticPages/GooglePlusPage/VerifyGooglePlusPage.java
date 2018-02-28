package Methods.BlogStaticPages.GooglePlusPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyGooglePlusPage {
    public void verifyGooglePlusPage(WebDriver driver) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if
                (driver.findElements(By.xpath("//img[@src='https://lh3.googleusercontent.com/-D_QKYmN83DM/AAAAAAAAAAI/AAAAAAAACDw/B_aOK0GINBQ/s60-p-rw-no/photo.jpg']")).size() != 0){

            System.out.println("Element is Present,GooglePlus window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }
}
