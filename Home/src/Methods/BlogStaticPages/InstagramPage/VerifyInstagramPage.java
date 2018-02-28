package Methods.BlogStaticPages.InstagramPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyInstagramPage {
    public void verifyInstagramPage(WebDriver driver)throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if
                (driver.findElements(By.linkText("bit.ly/GetMyStrengthsCard")).size() != 0){

            System.out.println("Element is Present,Instagram window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }

}
