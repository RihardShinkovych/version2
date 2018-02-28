package Tests.ContinuePage;

import Methods.EmailLogin.ConfirmLoginToWebApp;
import Methods.EmailLogin.LoginBtn;
import Methods.EmailLogin.LoginPage;
import Methods.FacebookLogin.FacebookBtn;
import Methods.FacebookLogin.FacebookFields;
import Methods.GooglePlusLogin.GooglePlusBtn;
import Methods.GooglePlusLogin.GooglePlusFieds;
import Methods.LoginPerfromed.VerifyLoginPerformedWA;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginContinuePage extends BaseTestContinuePage {
    @Test
    public void Login()throws InterruptedException {

        LoginBtn loginBtn = new LoginBtn();
        loginBtn.loginBtn(driver);
        LoginPage login = new LoginPage();
        login.login(driver, "first@yopmail.com", "Asdfghjkl");
        ConfirmLoginToWebApp signInBtn = new ConfirmLoginToWebApp();
        signInBtn.signInBtn(driver);
        Thread.sleep(1000);
        VerifyLoginPerformedWA profileProgress = new VerifyLoginPerformedWA();
        profileProgress.webAppPage(driver);
        Thread.sleep(1000);
    }
    @Test

    public void GooglePlus ()throws InterruptedException {
        GooglePlusBtn googlePlusBtn = new GooglePlusBtn();
        googlePlusBtn.ClickOnGooglePlusLoginButton(driver);
        Thread.sleep(2000);
        GooglePlusFieds googlePlusFields = new GooglePlusFieds();
        googlePlusFields.googlePlusFields(driver, "testfacebook2368@gmail.com", "12test34" );
        Thread.sleep(2000);
        VerifyLoginPerformedWA profileProgress = new VerifyLoginPerformedWA();
        profileProgress.webAppPage(driver);
        Thread.sleep(1000);
    }

    @Test

    public void Facebook ()throws InterruptedException {
        FacebookBtn facebookBtn = new FacebookBtn();
        facebookBtn.clickOnFacebookBtn(driver);
        Thread.sleep(2000);
        FacebookFields facebookFields = new FacebookFields();
        facebookFields.loginWithFacebook(driver, "testfacebook1368@gmail.com", "12test34");
        VerifyLoginPerformedWA profileProgress = new VerifyLoginPerformedWA();
        profileProgress.webAppPage(driver);
        Thread.sleep(1000);
    }

}


