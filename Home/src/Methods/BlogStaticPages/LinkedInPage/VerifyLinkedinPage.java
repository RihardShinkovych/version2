package Methods.BlogStaticPages.LinkedInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLinkedinPage {
    public void verifyLinkedinPage(WebDriver driver) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if
                (driver.findElements(By.linkText("Good&Co Labs Inc.")).size() != 0){

            System.out.println("Element is Present,LinkedIn window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }
}
