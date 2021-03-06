package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.MobileBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SettingsPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(SettingsPage.class);

    private static final By TXT_SETTINGS_TITLE = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Settings\"`]");
    private static final By NAVBAR_BTN_SETTINGS= By.xpath("//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[3]");
    private static final By TXT_SETTINGS_AUTOCALLBLOCKGING = MobileBy.AccessibilityId("Auto Call Blocking");
    private static final By SW_BTN_AUTOCALLBLOCKING = By.className("XCUIElementTypeSwitch");
    private static final By SW_BTN_AUTOCALLBLOCKING_TRUE = MobileBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == \"1\"`]");
    private static final By SW_BTN_AUTOCALLBLOCKING_FALSE = MobileBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == \"0\"`]");
    private static final By TXT_SETTINGS_COUNTRY = MobileBy.AccessibilityId("Country");
    private static final By TXT_SETTINGS_MNGSUBS = MobileBy.AccessibilityId("Manage Subscription");
    private static final By TXT_SETTINGS_CLEARHISTORY = MobileBy.AccessibilityId("Clear History");
    private static final By TXT_SETTINGS_HELP = MobileBy.AccessibilityId("Help Center");
    private static final By TXT_SETTINGS_RATETHISAPP = MobileBy.AccessibilityId("Rate This App");
    private static final By TXT_SETTINGS_RECOMENDTOAFRIEND = MobileBy.AccessibilityId("Recommend to a Friend");
    private static final By TXT_SETTINGS_TERMSCONDITIONS = MobileBy.AccessibilityId("Terms and Conditions");
    private static final By TXT_SETTINGS_PRIVACYPOLICY = MobileBy.AccessibilityId("Privacy Policy");
    private static final By POPUPTXT_SETTINGS_CLEARHISTORY =MobileBy.AccessibilityId("Are you sure you want to delete your search history?");
    private static final By POPUP_BTN_SETTINGS_CLEARHISTORY_DELETE = By.xpath("//XCUIElementTypeButton[@name=\"Delete\"]");
    private static final By TXT_HELPCENTER_TITLE = By.xpath("(//XCUIElementTypeStaticText[@name=\"Call Blocker: Scam Spam Lookup\"])[2]");
    private static final By BTN_HELPCENTER_XBUTTON = MobileBy.AccessibilityId("xmarkGrayIcon");
    private static final By SCREEN_APPLE_LIGHTBOX_ACTIVITY = By.xpath("//XCUIElementTypeApplication[@name=\"Call Blocker\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private static final By BTN_APPLE_LIGHTBOX_SLACK = By.xpath("//XCUIElementTypeCell[@name=\"Slack\"]/XCUIElementTypeOther/XCUIElementTypeImage");
    private static final By TXT_PRIVACY_POLICY_TITLE = By.xpath("//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]");
    private static final By TXT_TERMS_AND_CONDITIONS_TITLE = By.xpath("//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]");
    private static final By TXT_PRIVACY_POLICY_P_1ST = MobileBy.AccessibilityId("Madduck built the Call Blocker: Scam Spam Lookup app as a Commercial app. This SERVICE is provided by Madduck and is intended for use as is.");
    private static final By TXT_TERMS_AND_CONDITIONS_P_4TH = MobileBy.AccessibilityId("The app does use third party services that declare their own Terms and Conditions.");
    private static final By BTN_PRIVACY_POLICY_XBUTTON = MobileBy.AccessibilityId("xmarkGrayIcon");
    private static final By BTN_TERMS_AND_CONDITION_XBUTTON = MobileBy.AccessibilityId("xmarkGrayIcon");
    private static final By POPUP_SETTINGS_AUTOCALLBLOCKING = By.xpath("//XCUIElementTypeApplication[@name=\"Call Blocker\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private static final By BTNPOPUP_SETTINGS_AUTOCALLBLOCKING_ACTIVE = By.xpath("//XCUIElementTypeButton[@name=\"Activate\"]");
    private static final By TXT_SETTINGS_SELECTEDCOUNTRY = MobileBy.AccessibilityId("Turkey");

    public void verify_SettingsSelectedCountry() {
        LOGGER.info("Country alan??nda se??ili ??lkenin \"Turkey\" oldu??u do??rulan??r");
        String country = getTextElement(TXT_SETTINGS_SELECTEDCOUNTRY);
        Assert.assertEquals(country, "Turkey", "Text didn't match");
    }

    public void click_SettingsAutoCallBlockingActiveButton(){
        LOGGER.info("Kullan??c?? auto call blocking popup'??nda \"Active\" butonuna t??klar");
        clickElement(BTNPOPUP_SETTINGS_AUTOCALLBLOCKING_ACTIVE);
    }


    public void verify_SettingsAutoCallBlockingPopup(){
        LOGGER.info("Auto call blocking popup'??n??n a????ld?????? do??rulan??r");
        isEnableElement(POPUP_SETTINGS_AUTOCALLBLOCKING);
    }

    public void click_SettingsAutoCallBlockingSWButton () {
        LOGGER.info("Kullan??c?? \"Auto Call Blocking\" switch butonunnu aktif hale getirmek i??in t??klar ");
        clickElement(SW_BTN_AUTOCALLBLOCKING);
    }

    public void verify_SettingsSWButtonIsTrue () {
        LOGGER.info("Auto Call Blocking Switch butonunun aktif konuma geldi??i do??rulan??r");
        isEnableElement(SW_BTN_AUTOCALLBLOCKING_TRUE);
    }

    public void verify_SettingsSWButtonIsFalse () {
        LOGGER.info("Auto Call Blocking Switch butonunun inaktif konuma geldi??i do??rulan??r");
        isEnableElement(SW_BTN_AUTOCALLBLOCKING_FALSE);
    }


    public void verify_PrivacyPolicyTitle(){
        LOGGER.info("Privacy Policy sayfas??nda Title'??n \"Privacy Policy\" oldu??u do??rulan??r");
        String title = getTextElement(TXT_PRIVACY_POLICY_TITLE);
        Assert.assertEquals(title, "Privacy Policy", "Text didn't match");
    }

    public void verify_TermsConditionTitle(){
        LOGGER.info("Terms and Conditions sayfas??nda Title'??n \"Terms and Conditions\" oldu??u do??rulan??r");
        String title = getTextElement(TXT_TERMS_AND_CONDITIONS_TITLE);
        Assert.assertEquals(title, "Terms and Conditions", "Text didn't match");
    }

    public void verify_PrivacyPolicyP1St(){
        LOGGER.info("Privacy Policy sayfas??n??n 1. paragraf??nda \"Madduck built the Call Blocker: Scam Spam Lookup app as a Commercial app. This SERVICE is provided by Madduck and is intended for use as is.\" yazd?????? do??rulan??r");
        String title = getTextElement(TXT_PRIVACY_POLICY_P_1ST);
        Assert.assertEquals(title, "Madduck built the Call Blocker: Scam Spam Lookup app as a Commercial app. This SERVICE is provided by Madduck and is intended for use as is.", "Text didn't match");
    }

    public void verify_TermsConditionsP4Th(){
        LOGGER.info("Privacy Policy sayfas??n??n 1. paragraf??nda \"Madduck built the Call Blocker: Scam Spam Lookup app as a Commercial app. This SERVICE is provided by Madduck and is intended for use as is.\" yazd?????? do??rulan??r");
        String title = getTextElement(TXT_TERMS_AND_CONDITIONS_P_4TH);
        Assert.assertEquals(title, "The app does use third party services that declare their own Terms and Conditions.", "Text didn't match");
    }
    public void click_PrivacyPolicyXButton () {
        LOGGER.info("Kullan??c?? privacy policy sayfas??nda \"X\" butonuna basar");
        clickElement(BTN_PRIVACY_POLICY_XBUTTON);

    }


    public void click_TermsConditionXButton () {
        LOGGER.info("Kullan??c?? privacy policy sayfas??nda \"X\" butonuna basar");
        clickElement(BTN_TERMS_AND_CONDITION_XBUTTON);
    }

    public void click_SettingsPrivacyPolicy (){
        LOGGER.info("Kullan??c?? \"Privacy Policy\" butonuna t??klar");
        clickElement(TXT_SETTINGS_PRIVACYPOLICY);
    }

    public void click_TermsCondition(){
        LOGGER.info("Kullan??c?? \"Privacy Policy\" butonuna t??klar");
        clickElement(TXT_SETTINGS_TERMSCONDITIONS);
    }

    public void click_AppleLighBoxSlackButton(){
        LOGGER.info("Kullan??c?? \"Apple share lighbox\"??nda slack ikonuna t??klar");
        clickElement(BTN_APPLE_LIGHTBOX_SLACK);
    }

    public void verify_ApplelightBox (){
        LOGGER.info("Apple Share lightbox'??n??n a????ld?????? do??rulan??r");
        isDisplayElement(SCREEN_APPLE_LIGHTBOX_ACTIVITY);
    }
    public void click_RecommendToAFriend() {
        LOGGER.info("Kullan??c?? \"Recommend to a friend\" butonuna t??klar");
        clickElement(TXT_SETTINGS_RECOMENDTOAFRIEND);
    }

    public void click_HelpCenter_XButton (){
        LOGGER.info("Help Center sayfas??nda \"X\" butonuna bas??l??r ve sayfa kapat??l??r");
        clickElement(BTN_HELPCENTER_XBUTTON);
    }

    public void verify_HelpCenter_Title () {
        LOGGER.info("Kullan??c?? Helpcenter Sayfas??nda Title alan??nda \"Call Blocker: Scam Spam Lookup\" text'inin oldu??unu do??rular ");
        String title = getTextElement(TXT_HELPCENTER_TITLE);
        Assert.assertEquals(title, "Call Blocker: Scam Spam Lookup", "Text didn't match");
    }

    public void click_Settings_NavBarSettings() {
        LOGGER.info("kullan??c?? home page navbar'da \"settings\" butonuna basar");
        clickElement(NAVBAR_BTN_SETTINGS);
    }

    public void verify_Settingstitle() {
        LOGGER.info("Settings sayfas??nda ba??l??k do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_TITLE), "Settings", "Text didn't match");
    }
    public void verify_Settings_Autocallblocking() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_AUTOCALLBLOCKGING),"Auto Call Blocking","Text didn't match");
    }
    public void click_Settings_Clerarhistory() {
        LOGGER.info("Settings sayfas??ndaki clear history butonuna t??klan??r");
        clickElement(TXT_SETTINGS_CLEARHISTORY);
    }
    public void click_Settings_Clearhistoryd_Delete(){
        LOGGER.info("Clear History popup'??nda yer alan DELETE butonuna t??klan??r");
        clickElement(POPUP_BTN_SETTINGS_CLEARHISTORY_DELETE);
    }

    public void click_Settings_HelpCenter () {
        LOGGER.info("Kullan??c?? \"Help Center\" butonuna t??klar");
        clickElement(TXT_SETTINGS_HELP);
    }
    public void verify_Settings_Clearhistory() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_CLEARHISTORY),"Clear History","Text didn't match");
    }

    public void verify_Settings_Clearhistorypopupmsg() {
        LOGGER.info("Settings sayfas??nda clear history popup'??n??n geldi??i do??rulan??r");
        Assert.assertEquals(getTextElement(POPUPTXT_SETTINGS_CLEARHISTORY), "Clear History Popup MSG", "Text didn't match");
    }
    public void verify_Settings_Country() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_COUNTRY),"Country","Text didn't match");
    }

    public void verify_Settings_ManageSubscription() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_MNGSUBS),"Manage Subscription","Text didn't match");
    }

    public void verify_Settings_Helpcenter() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_HELP),"Help Center","Text didn't match");
    }

    public void verify_Settings_Ratethisapp() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_RATETHISAPP),"Rate This App","Text didn't match");
    }

    public void verify_Settings_Recommendtoafriend() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_RECOMENDTOAFRIEND),"Recommend to a Friend","Text didn't match");
    }

    public void verify_Settings_Termsandconditions() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_TERMSCONDITIONS),"Terms and Conditions","Text didn't match");
    }

    public void verify_Settings_Privacypolicy() {
        LOGGER.info("Settings sayfas??ndaki h??creler do??rulan??r");
        Assert.assertEquals(getTextElement(TXT_SETTINGS_PRIVACYPOLICY),"Privacy Policy","Text didn't match");
    }





    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}

