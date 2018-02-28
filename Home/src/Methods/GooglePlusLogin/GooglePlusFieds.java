package Methods.GooglePlusLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePlusFieds {
    public void googlePlusFields(WebDriver driver, String email, String password) throws InterruptedException {

        //  Old switch verion
        String winHandleBefore = driver.getWindowHandle();
//
//
//// Switch to new window opened
 for (String winHandle : driver.getWindowHandles()) {
 driver.switchTo().window(winHandle);

            if (driver.getTitle().contains("Sign in")) {
                driver.findElement(By.id("identifierId")).sendKeys(email);
                driver.findElement(By.id("identifierNext")).click();
                driver.findElement(By.name("password")).sendKeys(password);
                Thread.sleep(1000);
                driver.findElement(By.id("passwordNext")).click();
                Thread.sleep(2000);
            }
     //// Switch back to original browser (first window)
     driver.switchTo().window(winHandleBefore);
    }
    }
    }

//
//
////

////
//  //