package Methods.LoginPerfromed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLoginPerformedWA {
    public void webAppPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        if
                    (driver.findElements(By.xpath("/html/body/goodco-progress-bar/div/div")).size() != 0){

                System.out.println("Element is Present,TD logined successfully");
            }else{
                System.out.println("Element is Absent");
        }

    }

}
