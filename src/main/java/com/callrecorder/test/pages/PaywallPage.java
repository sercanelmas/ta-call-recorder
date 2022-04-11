package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class PaywallPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(PaywallPage.class);


    // PAYWALL PAGE RESTORE BUTONU LOCATORLARI

    private static final By BTN_RESTORE = By.name("Restore");
    private static final By TXT_RESTORE = By.name("There are no items available to restore at this time.");
    private static final By BTN_RESTORE_OK = By.name("OK");

    // PAYWALL PAGE RESTORE BUTONU LOCARTORLARI
    // ==================================================
    // PAYWALL PAGE TERM & CONDITION BUTONU LOCARTORLARI

    private static final By BTN_TERMSANDCONDITIONS = By.name("Terms & Conditions");
    private static final By TXT_TERMSANDCONDITIONS_TITLE = By.xpath("//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]");
    private static final By TXT_TERMSANDCONDITIONS_3NDPRG1PART = By.name("The Call Recorder – Save & Listen app stores and processes personal data that you have provided to us, in order to provide our Service. It’s your responsibility to keep your phone and access to the app secure. We therefore recommend that you do not jailbreak or root your phone, which is the process of removing software restrictions and limitations imposed by the official operating system of your device. It could make your phone vulnerable to malware/viruses/malicious programs, compromise your phone’s security features and it could mean that the");
    private static final By BTN_TERMSANDCONDITIONS_DONE = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    private static final By TXT_TERMSANDCONDITIONS_URL = By.xpath("//XCUIElementTypeOther[@name=\"URL\"]");


    // PAYWALL PAGE TERM & CONDITION BUTONU LOCARTORLARI

    // ==================================================

    // PAYWALL PAGE MAIN LOCARTORLARI

    private static final By TXT_PWMAIN_SUBSAUTORENEW = By.name("Apple subscriptions are automatically renewed.");
    private static final By BTN_PWMAIN_UNLIMITEDWEEK = By.xpath("(//XCUIElementTypeStaticText[@name=\"Unlimited\"])[1]");
    private static final By BTN_PWMAIN_CONTINUE = By.name("Continue");


    // PAYWALL PAGE MAIN LOCARTORLARI

    // ==================================================

    // PAYWALL PAGE RESTORE BUTONU METHODLARI

    public void openRestorePage() {
        LOGGER.info("\"Restore\" butonuna basıldı.");
        clickElement(BTN_RESTORE);

    }

    public void verifyRestoreText() {
        LOGGER.info("Restore pop up text kontrol");

        String restoreText = getTextElement(TXT_RESTORE);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("There are no items available to restore at this time.",restoreText,"Texts did not match.");
        softAssert.assertAll();


    }

    public void clickOkRestorePopUp() {
        LOGGER.info("\"Restore\" textinindeki OK butonuna basıldı.");
        clickElement(BTN_RESTORE_OK);
    }

    // PAYWALL PAGE RESTORE BUTONU METHODLARI

    // ==================================================

    // PAYWALL PAGE TERM & CONDITION BUTONU METHODLARI

    public void openTermsAndConditionsPage() {
        LOGGER.info("\"Terms & Conditions\" butonuna basıldı.");
        clickElement(BTN_TERMSANDCONDITIONS);
    }

    public PaywallPage verifyTermsAndConditionsTitle(String expectedText) {
        LOGGER.info("\"Terms & Conditions\" Sayfasının başlığı kontrol ediliyor");

        String termsAndConditions = getTextElement(TXT_TERMSANDCONDITIONS_TITLE);

        if (!("Terms and Conditions").equals(termsAndConditions)) {
            errorMessage("verifyTermsAndConditionsTitle", "Title did not match");
        }
        return this;


    }

    public PaywallPage verifyTermsAndConditions3P1PContainsText(String expectedText) {
        LOGGER.info("\"Terms & Conditions\" Sayfasının 3. paragraf 1 bölümü içeriği kontrol ediliyor");


        if (!getTextElement(TXT_TERMSANDCONDITIONS_3NDPRG1PART).contains(expectedText)) {
            errorMessage("verifyTermsAndConditions3P1PContainsText", "Texts did not contains expected text");
        }

        return this;
    }


    public void clickTermsAndConditionsPageTopBrowserBarDoneButton() {
        LOGGER.info("kullanıcı top browser barda bulunan Done butonuna basıyor.");
        clickElement(BTN_TERMSANDCONDITIONS_DONE);
    }

    public PaywallPage verifyTermsAndConditionsPageURL(String expectedText) {
        LOGGER.info("kullanıcı top browser barda bulunan URL'in \"support.madduck.app, secure and validated\" textini kontrol ediyor.");
        if(!getTextElement(TXT_TERMSANDCONDITIONS_URL).contains(expectedText)){
            errorMessage("verifyTermsAndConditionsPageURL","URL did not match");

        }

        return this;
    }

    public void clickTermsAndConditionsPageURL() {
        LOGGER.info("kullanıcı top browser barda bulunan URL'in \"support.madduck.app, secure and validated\" textine basıyor");
        clickElement(TXT_TERMSANDCONDITIONS_URL);


    }

    // PAYWALL PAGE TERM & CONDITION BUTONU METHODLARI

    // ==================================================

    // PAYWALL PAGE MAIN METHODLARI

    public void verify_PwMain_AutorenewedText() {
        LOGGER.info("kullanıcı paywall main ekranında \"Apple subscriptions are automatically renewed.\"yazısını görerek paywall sayfasına geldiğini kontrol eder.");
        Assert.assertEquals(getTextElement(TXT_PWMAIN_SUBSAUTORENEW),"Apple subscriptions are automatically renewed.","Texts did not match.");
    }

    public void clickPWMainWeeklyButton() {
        LOGGER.info("kullanıcı Paywall ekranında  \"Yearly\" subscribtion seçeneğini seçer.");
        clickElement(BTN_PWMAIN_UNLIMITEDWEEK);

    }

 /*   public void clickPWMainMonthlyButton() {
        LOGGER.info("kullanıcı Paywall ekranında \"Monthly\" subscribtion seçeneğini seçer.");
        clickElement(BTN_PWMAIN_YEARLYSUBS);
    }*/

    public void clickPWMainContinueButton() {
        LOGGER.info("kullanıcı Paywall ekranında \"Continue\" butonuna basar.");
        clickElement(BTN_PWMAIN_CONTINUE);
    }


    // PAYWALL PAGE MAIN METHODLARI

    // ==================================================


    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}
