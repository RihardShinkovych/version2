package Tests.Blog;

import Methods.BlogStaticPages.FbPage.FbLink;
import Methods.BlogStaticPages.FbPage.VerifyFbPage;
import Methods.BlogStaticPages.GooglePlusPage.GooglePlusLink;
import Methods.BlogStaticPages.GooglePlusPage.VerifyGooglePlusPage;
import Methods.BlogStaticPages.InstagramPage.InstagramLink;
import Methods.BlogStaticPages.InstagramPage.VerifyInstagramPage;
import Methods.BlogStaticPages.LinkedInPage.LinkedInLink;
import Methods.BlogStaticPages.LinkedInPage.VerifyLinkedinPage;
import Methods.BlogStaticPages.PinterestPage.PinterestLink;
import Methods.BlogStaticPages.PinterestPage.VerifyPinterestPage;
import Methods.BlogStaticPages.TwitterPage.TwitterLink;
import Methods.BlogStaticPages.TwitterPage.VerifyTwitterPage;
import org.testng.annotations.Test;

public class BlogStaticPages extends BaseTestBlog {
    @Test
    public void FbPage() throws InterruptedException {

        FbLink fbLink = new FbLink();
        fbLink.fbLink(driver);
        Thread.sleep(1000);
        VerifyFbPage verifyFbPage = new VerifyFbPage();
        verifyFbPage.verifyFbPage(driver);
    }

    @Test
    public void TwitterPage() throws InterruptedException {

        TwitterLink twitterLink = new TwitterLink();
        twitterLink.twitterIcon(driver);
        Thread.sleep(1000);
        VerifyTwitterPage twitterPage = new VerifyTwitterPage();
        twitterPage.verifyTwitterPage(driver);
    }

    @Test
    public void PinterestPage() throws InterruptedException {

        PinterestLink pinterestLink = new PinterestLink();
        pinterestLink.pinterestLink(driver);
        Thread.sleep(1500);
        VerifyPinterestPage verifyPinterestPage = new VerifyPinterestPage();
        verifyPinterestPage.verifyPinterestPage(driver);
    }

    @Test
    public void LinkedinPage() throws InterruptedException {
        LinkedInLink linkedInLink = new LinkedInLink();
        linkedInLink.linkedInLink(driver);
        Thread.sleep(1500);
        VerifyLinkedinPage linkedinPage = new VerifyLinkedinPage();
        linkedinPage.verifyLinkedinPage(driver);
    }

    @Test
    public void InstagramPage() throws InterruptedException {
        InstagramLink instagramLink = new InstagramLink();
        instagramLink.instagramLink(driver);
        Thread.sleep(1500);
        VerifyInstagramPage instagramPage = new VerifyInstagramPage();
        instagramPage.verifyInstagramPage(driver);

    }
    @Test
    public void GooglePlusPage () throws InterruptedException {
        GooglePlusLink googlePlusLink = new GooglePlusLink();
        googlePlusLink.googlePlusLink(driver);
        Thread.sleep(1500);
        VerifyGooglePlusPage googlePlusPage = new VerifyGooglePlusPage();
        googlePlusPage.verifyGooglePlusPage(driver);
    }

}
