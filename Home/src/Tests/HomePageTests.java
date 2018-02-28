package Tests;

import Methods.FacebookLogin.FacebookBtn;
import Methods.FacebookLogin.FacebookFields;
import Methods.GooglePlusLogin.GooglePlusBtn;
import Methods.GooglePlusLogin.GooglePlusFieds;
import Methods.EmailLogin.ConfirmLoginToWebApp;
import Methods.EmailLogin.LoginBtn;
import Methods.EmailLogin.LoginPage;
import Methods.Header.Login.LoginButton;
import Methods.Header.Login.TeamDynamics.TDEmailLogin;
import Methods.Header.Login.TeamDynamics.TDFbLogin;
import Methods.Header.Login.TeamDynamics.TDGooglePlusLogin;
import Methods.Header.Login.TeamDynamics.TeamDynamics;
import Methods.LoginPerfromed.VerifyLoginPerformedTD;
import Methods.LoginPerfromed.VerifyLoginPerformedWA;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {
    @Test

    public void Login() throws InterruptedException {

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

    public void GooglePlus() throws InterruptedException {
        GooglePlusBtn googlePlusBtn = new GooglePlusBtn();
        googlePlusBtn.ClickOnGooglePlusLoginButton(driver);
        Thread.sleep(2000);
        GooglePlusFieds googlePlusFields = new GooglePlusFieds();
        googlePlusFields.googlePlusFields(driver, "testfacebook2368@gmail.com", "12test34");
        Thread.sleep(2000);
        VerifyLoginPerformedWA profileProgress = new VerifyLoginPerformedWA();
        profileProgress.webAppPage(driver);
        Thread.sleep(1000);
    }

    @Test

    public void Facebook() throws InterruptedException {
        FacebookBtn facebookBtn = new FacebookBtn();
        facebookBtn.clickOnFacebookBtn(driver);
        Thread.sleep(2000);
        FacebookFields facebookFields = new FacebookFields();
        facebookFields.loginWithFacebook(driver, "testfacebook1368@gmail.com", "12test34");
        VerifyLoginPerformedWA profileProgress = new VerifyLoginPerformedWA();
        profileProgress.webAppPage(driver);
        Thread.sleep(1000);
    }

    @Test

    public void HeaderTDFBLogin() throws InterruptedException {
        LoginButton loginButton = new LoginButton();
        loginButton.loginBtnDropdown(driver);
        TeamDynamics teamDynamics = new TeamDynamics();
        teamDynamics.tDLogin(driver);
        Thread.sleep(1000);
        TDFbLogin tdFbLogin = new TDFbLogin();
        tdFbLogin.tDfbLogin(driver, "testfacebook1368@gmail.com", "12test34");
        VerifyLoginPerformedTD verifyLoginPerformedTD = new VerifyLoginPerformedTD();
        verifyLoginPerformedTD.verifyLoginPerformedTD(driver);
    }

    @Test

    public void HeaderTDGoogleLogin() throws InterruptedException {
        LoginButton loginButton = new LoginButton();
        loginButton.loginBtnDropdown(driver);
        TeamDynamics teamDynamics = new TeamDynamics();
        teamDynamics.tDLogin(driver);
        Thread.sleep(1000);
        TDGooglePlusLogin tdGooglePlusLogin = new TDGooglePlusLogin();
        tdGooglePlusLogin.tDGooglePlusLogin(driver, "testfacebook2368@gmail.com", "12test34");
        VerifyLoginPerformedTD verifyLoginPerformedTD = new VerifyLoginPerformedTD();
        verifyLoginPerformedTD.verifyLoginPerformedTD(driver);
    }
//        @Test
//
//    public void TDEmailLogin() throws InterruptedException {
//        LoginButton loginButton = new LoginButton();
//        loginButton.loginBtnDropdown(driver);
//        Thread.sleep(500);
//        TeamDynamics teamDynamics = new TeamDynamics();
//        teamDynamics.tDLogin(driver);
//        Thread.sleep(200);
//        TDEmailLogin tdEmailLogin = new TDEmailLogin();
//        tdEmailLogin.tDemail(driver, "testfacebook3368+1@gmail.com", "12test34");
//    }

}