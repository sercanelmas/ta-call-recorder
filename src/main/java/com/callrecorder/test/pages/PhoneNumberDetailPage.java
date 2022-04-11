package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import com.callrecorder.test.utilities.DriverThread;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PhoneNumberDetailPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(PhoneNumberDetailPage.class);

    private static final By TXT_HOMEPAGE_PHONENUMBERDETAILTITLE = By.name("Phone Number Detail");
    private static final By BTN_HOMEPAGE_PHONENUMBERDETAIL_XMARKGRAYICON = By.name("xmarkGrayIcon");
    private static final By BTN_HOMEPAGE_PHONENUMBERDETAIL_BLOCK = By.xpath("//XCUIElementTypeButton[@name=\"\uD83D\uDEAB Block\"]");
    private static final By BTN_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCK = By.xpath("//XCUIElementTypeButton[@name=\"✅ Unblock\"]");
    private static final By TXT_HOMEPAGE_PHONENUMBERDETAIL_BLOCKEDNUMBERREPORTTEXT = By.xpath("//XCUIElementTypeStaticText[@name=\"You blocked this phone number. Would you like to report it to us?\"]");
    private static final By BTN_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCKEDNUMBERCLOSESCREEN_CLOSEBUTTON = By.xpath("//XCUIElementTypeButton[@name=\"Close\"]");
    private static final By BTN_HOMEPAGE_PHONENUMBERDETAIL_BLOCKEDNUMBERREPORT_XMARKGRAYICON = By.xpath("(//XCUIElementTypeButton[@name=\"xmarkGrayIcon\"])[1]");
    private static final By BTN_HOMEPAGE_PHONENUMBERDEATIL_UNBLOCKEDNUMBERCLOSESCREEN_XMARKGRAYICON = By.xpath("(//XCUIElementTypeButton[@name=\"xmarkGrayIcon\"])[1]");
    private static final By TXT_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCKEDNUMBERCLOSESCREEN = By.xpath("//XCUIElementTypeStaticText[@name=\"This phone number has been unblocked.  You can block it again whenever you want.\"]");
    private static final By BTN_PHONENUMBERDETAIL_SHAREICON= By.name("shareIcon");
    private static final By SCREEN_APPLELIGHTBOX_ACTIVITYLISTVIEW = By.name("ActivityListView");
    private static final By BTN_APPLELIGHTBOX_ACTIVITYLISTVIEW_SLACK = By.name("Slack");
    private static final By BTN_SENDINGPAGE_SENDICON = By.xpath("//XCUIElementTypeButton[@name=\"Send\"]");
    private static final By SRCHBOX_SENDINGPAGE_SEARCHBAR = By.name("sk_search_bar");
    private static final By BTN_PHONENUMBERDETAIL_REPORT = By.xpath("//XCUIElementTypeButton[@name=\"Report\"]");
    private static final By TXT_PHONENUMBERDETAIL_REPORTPAGE_TITLE = By.xpath("//XCUIElementTypeStaticText[@name=\"Report\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_SENDREPORT = By.xpath("//XCUIElementTypeButton[@name=\"Send Report\"]");
    private static final By TXT_PHONENUMBERDETAIL_REPORTPOPUP_REPORTSUBMITTED = By.xpath("//XCUIElementTypeStaticText[@name=\"Report Submitted\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPOPUP_CLOSE = By.xpath("//XCUIElementTypeButton[@name=\"Close\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPOPUP_XBUTTON = By.xpath("(//XCUIElementTypeButton[@name=\"xmarkGrayIcon\"])[2]");
    private static final By TXTBOX_PHONENUMBERDETAIL_REPORTPAGE_YOURCOMMENTS = MobileBy.iOSClassChain("**/XCUIElementTypeTextView[`value == \"Write your experience...\"`]");
    private static final By TXTBOX_PHONENUMBERDETAIL_REPORTPAGE_YOURCOMMENTSTEXTAREA = MobileBy.iOSNsPredicateString("type == \"XCUIElementTypeTextView\"");
    private static final By TXTBOX_PHONENUMBERDETAIL_REPORTPAGE_NICKNAME = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Nickname\"`]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_SPAM = By.xpath("//XCUIElementTypeStaticText[@name=\"Spam\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_SCAM = By.xpath("//XCUIElementTypeStaticText[@name=\"Scam\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_SURVEY = By.xpath("//XCUIElementTypeStaticText[@name=\"Survey\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_STALKER = By.xpath("//XCUIElementTypeStaticText[@name=\"Stalker\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_TELEMARKETING = By.xpath("//XCUIElementTypeStaticText[@name=\"Tele-Marketing\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_DEBTCOLLECTOR = By.xpath("//XCUIElementTypeStaticText[@name=\"Debt Collector\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_SUSPICIOUS = By.xpath("//XCUIElementTypeStaticText[@name=\"Suspicious\"]");
    private static final By BTN_PHONENUMBERDETAIL_REPORTPAGE_KEYBOARD_GO = MobileBy.AccessibilityId("Go");
    private static final By BTN_APPLELIGHTBOX_ACTIVITYLISTVIEW_X = MobileBy.AccessibilityId("Close");

    Faker faker = new Faker();
    TouchAction action = new TouchAction<>(DriverThread.getDriver());

    public void verify_PhoneNumberDetailPage_Title() {
        LOGGER.info("kullanıcı \"Phone Number Detail\" ekranına gelir ve doğrulamak için \"Phone Number Detail\" başlığını kullanır. ");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_PHONENUMBERDETAILTITLE), "Phone Number Detail", "title did not match.");
    }

    public void click_PhoneNumberDetailPage_GotoSearchNumber_XButton() {
        LOGGER.info("kullanıcı bir önceki sayfaya gitmek için \"X\" butonuna basar. ");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDETAIL_XMARKGRAYICON);

    }

    public void click_PhoneNumberDetail_BlockButton() {
        LOGGER.info("kullanıcı \"Phone Number Detail\" ekranında \"Block\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDETAIL_BLOCK);
    }

    public void verify_PhoneNumberDetail_BlockPopUp_ReportScreenText() {
        LOGGER.info("kullanıcı \"Block\" butonuna bastıktan sonra \"You blocked this phone number. Would you like to report it to us?\" textini doğrular .");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_PHONENUMBERDETAIL_BLOCKEDNUMBERREPORTTEXT), "You blocked this phone number. Would you like to report it to us?", "text did not match.");

    }

    public void click_PhoneNumberDetail_BlockPopUp_GoToPhoneNumberDetailScreen_XButton() {
        LOGGER.info("kullanıcı \"Block Pop Up\" ekranından çıkmak için \"X\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDETAIL_BLOCKEDNUMBERREPORT_XMARKGRAYICON);

    }

    public void click_PhoneNumberDetail_UnblockButton() {
        LOGGER.info("kullanıcı \"Phone Number Detail\" ekranında \"Unblock\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCK);
    }

    public void verify_PhoneNumberDetail_UnblockPopUp_CloseScreenText() {
        LOGGER.info("kullanıcı \"Unblock\" butonuna bastıktan sonra \" This phone number has been unblocked. You can block it again whenever you want.\" textini doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCKEDNUMBERCLOSESCREEN), "This phone number has been unblocked.  You can block it again whenever you want.","text did not match");
    }

    public void click_PhoneNumberDetail_UnblockPopUp_GoToPhoneNumberDetailScreen_XButton() {
        LOGGER.info("kullanıcı \"Unblock\" butonuna bastıktan sonra Pop-up'tan çıkmak için \"X\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDEATIL_UNBLOCKEDNUMBERCLOSESCREEN_XMARKGRAYICON);
    }

    public void click_PhoneNumberDetail_UnblockPopUp_CloseButton(){
        LOGGER.info("kullanıcı \"Unblock\" butonuna bastıktan sonra Pop-up'ran çıkmak için \"Close\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_PHONENUMBERDETAIL_UNBLOCKEDNUMBERCLOSESCREEN_CLOSEBUTTON);
    }

    public void click_PhoneNumberDetail_ShareButton(){
        LOGGER.info("kullanıcı \"Phone Number Detail\" ekranında \"Share\" ikonuna butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_SHAREICON);
    }
    public void click_PhoneNumberDetail_Share_XButton(){
        LOGGER.info("kullanıcı \"Share\" ikonu butonuna bastıktan sonra \"Activity List View\" ekranından çıkmak için \"X\" butonuna basar.");
        clickElement(BTN_APPLELIGHTBOX_ACTIVITYLISTVIEW_X);
    }


    public void verify_PhoneNumberDetail_ActivityListView(){
        LOGGER.info("kullanıcı \"Share\" ikonuna bastıktan sonra \"Activity List View\" ekranının geldiğini doğrular.");
        Assert.assertTrue(isDisplayElement(SCREEN_APPLELIGHTBOX_ACTIVITYLISTVIEW),"screen did not appear");
    }

    public void click_PhoneNumberDetail_ActivityListView_ChooseSlack(){
        LOGGER.info("kullanıcı \"Activity List View\" ekranınında \"Slack\" uygulamasını seçer ve \"test-automation\" grubuna numarayı gönderir.");

        // apple light box açılınca slack uygulamasına ulaşmak için sola doğru swipe hareketi gerekir
        action.longPress(PointOption.point(350, 645)).moveTo(PointOption.point(110, 645)).release().perform();

        // slack uygulamasına basar
        clickElement(BTN_APPLELIGHTBOX_ACTIVITYLISTVIEW_SLACK);
    }

    public void click_PhoneNumberDetail_ActivityListView_Sending() throws InterruptedException {
        LOGGER.info("kullanıcı \"test-automation\" grubuna numarayı gönderir.");

        // destination bölümünde slackte en son kanal çıktığı için onu sabitlemek gerekir.
        action.tap(PointOption.point(285,285)).perform();

        // test-automation kanalına gitmek için searchbar basılır ve test-automation yazısı gönderilir.
        clickElement(SRCHBOX_SENDINGPAGE_SEARCHBAR);
        setTextElement(SRCHBOX_SENDINGPAGE_SEARCHBAR,"test-automation");
        // test-automation kanalı seçilir.
        Thread.sleep(1000);
        action.tap(PointOption.point(200,200)).perform();
        // send butonu tıklanır
        clickElement(BTN_SENDINGPAGE_SENDICON);
    }

    public void click_PhoneNumberDetail_ReportButton(){
        LOGGER.info("kullanıcı \"Phone Number Detail\" ekranında \"Block\" butonu pop up'ında \"Report\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORT);
    }

    public void verify_PhoneNumberDetail_ReportPage_Title (){
        LOGGER.info("kullanıcı \"Report\" sayfasının başlığını doğrular.");
        Assert.assertEquals(getTextElement(TXT_PHONENUMBERDETAIL_REPORTPAGE_TITLE),"Report","title did not match");
    }

    public void click_PhoneNumberDetail_ReportPage_SendReportButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Send Report\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_SENDREPORT);
    }

    public void verify_PhoneNumberDetail_ReportPopUp_ReportSubmitted(){
        LOGGER.info("kullanıcı \"Send Report\" butonuna bastıktan sonra \"Report Submitted\" yazısını doğrular.");
        Assert.assertEquals(getTextElement(TXT_PHONENUMBERDETAIL_REPORTPOPUP_REPORTSUBMITTED),"Report Submitted","text did not match");

    }

    public void click_PhoneNumberDetail_ReportPopUp_CloseButton(){
        LOGGER.info("kullanıcı \"Send Report\" butonuna bastıktan sonra \"Close\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPOPUP_CLOSE);
    }

    public void click_PhoneNumberDetail_ReportPopUp_XButton(){
        LOGGER.info("kullanıcı \"Send Report\" butonuna bastıktan sonra \"X\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPOPUP_XBUTTON);
    }

    public void sendKeys_PhoneNumberDetail_ReportPage_Nickname(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Nickname\" textbox'ını faker kütüphanesinden random doldurur.");
        setTextElement(TXTBOX_PHONENUMBERDETAIL_REPORTPAGE_NICKNAME,faker.gameOfThrones().character());
    }

    public void sendKeys_PhoneNumberDetail_ReportPage_YourComments(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Your Comments\" textbox'ını faker kütüphanesinden random paragraf ile doldurur.");
        String lorem = faker.lorem().paragraph(2);
        setTextElement(TXTBOX_PHONENUMBERDETAIL_REPORTPAGE_YOURCOMMENTSTEXTAREA,lorem);
    }

    public void click_PhoneNumberDetail_ReportPage_SpamButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Spam\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_SPAM);
    }

    public void click_PhoneNumberDetail_ReportPage_ScamButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Scam\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_SCAM);
    }

    public void click_PhoneNumberDetail_ReportPage_SurveyButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Survey\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_SURVEY);
    }

    public void click_PhoneNumberDetail_ReportPage_StalkerButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Stalker\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_STALKER);
    }

    public void click_PhoneNumberDetail_ReportPage_TelemarketingButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Tele-Marketing\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_TELEMARKETING);
    }

    public void click_PhoneNumberDetail_ReportPage_DebtCollectorButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Debt Collector\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_DEBTCOLLECTOR);
    }

    public void click_PhoneNumberDetail_ReportPage_SuspiciousButton(){
        LOGGER.info("kullanıcı \"Report\" ekranında \"Suspicious\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_SUSPICIOUS);
    }

    public void click_PhoneNumberDetail_ReportPage_KeyboardGoButton(){
        LOGGER.info("kullanıcı \"Report\" ekranının Klavyesinde \"Go\" butonuna basar.");
        clickElement(BTN_PHONENUMBERDETAIL_REPORTPAGE_KEYBOARD_GO);
    }





    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}
