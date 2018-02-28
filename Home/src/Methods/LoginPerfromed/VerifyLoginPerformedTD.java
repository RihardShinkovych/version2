package Methods.LoginPerfromed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLoginPerformedTD {
    public void verifyLoginPerformedTD(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        if
                (driver.findElements(By.xpath("//div[@class='logo-wrapper']")).size() != 0){

            System.out.println("Element is Present,TD logined successfully");
        }else{
            System.out.println("Element is Absent");
        }
        Thread.sleep(2000);
    }
}
