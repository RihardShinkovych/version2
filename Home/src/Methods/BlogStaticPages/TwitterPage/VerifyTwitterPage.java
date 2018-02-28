package Methods.BlogStaticPages.TwitterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyTwitterPage {
    public void verifyTwitterPage(WebDriver driver) throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if
                (driver.findElements(By.linkText("Good&Co")).size() != 0){

            System.out.println("Element is Present,Twitter window opened successfully");
        }else
        {
            System.out.println("Element is Absent");
        }
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);
    }

}

