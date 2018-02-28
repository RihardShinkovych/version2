package Methods.BlogStaticPages.FbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class VerifyFbPage {

    public void verifyFbPage(WebDriver driver) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if
                (driver.findElements(By.linkText("Good&Co, Inc.")).size() != 0){

            System.out.println("Element is Present,Facebook window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }

    }


