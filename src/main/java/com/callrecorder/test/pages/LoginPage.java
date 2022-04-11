package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.MobileBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(PaymentPage.class);

    private static final By BTN_LOGIN_LOGINNOW = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"LOGIN NOW\"`]");
    private static final By BTN_LOGIN_XBUTTON = MobileBy.AccessibilityId("closeIconSmall");
    private static final By TXT_LOGIN_TITLE = MobileBy.AccessibilityId("Verify your phone number");
    private static final By DROPDOWN_LOGIN_COUNTRY_CODE = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"90\"`]");
    private static final By TXTBOX_LOGIN_PHONENUMBER =  MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Enter your phone number\"`]");
    private static final By BTN_LOGIN_NEXT = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"NEXT\"`]");
    private static final By BTN_VERIFY_BACK = MobileBy.AccessibilityId("Back");
    private static final By TXT_VERIFY_TITLE = MobileBy.AccessibilityId("We sent a text containing verification code");
    private static final By BTN_VERIFY_NEXT = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"NEXT\"`]");
    private static final By BTN_VERIFY_RESEND = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"RESEND\"`]");
    private static final By APPLEKEY_AUTOCOMPLETE = MobileBy.AccessibilityId("suggestion");
    private static final By POPUP_ERROR_MSG_OK_BTN = By.xpath("//XCUIElementTypeButton[@name=\"OK\"]");


    String phoneNumberSercan = "5069373645";

    public void clickLoginXButton () {
        LOGGER.info("Kullanıcı login ekranında \"X\" butonuna basar");
        clickElement(BTN_LOGIN_XBUTTON);
    }

    public void clickLoginNextButton () {
        LOGGER.info("Kullanıcı login ekranında \"X\" butonuna basar");
        clickElement(BTN_LOGIN_XBUTTON);
    }

    public void setTxtLoginPhoneNumber (String phoneNumberSercan) {
        LOGGER.info("Kullanıcı \"phone number\" alanına telefon numarasını girer");
        setTextElement(TXTBOX_LOGIN_PHONENUMBER, phoneNumberSercan);
    }

     public void verifyLoginTitle () {
        LOGGER.info("Kullanıcı başlık alanında \"Verify your phone number\" yazdığını doğrular");
         Assert.assertEquals(getTextElement(TXT_LOGIN_TITLE), "Verify your phone number", "text didnT match");
     }

    public void verifyCountryCode () {
        LOGGER.info("Kullanıcı telefon ülke kodunun \"90\" olduğunu doğrular");
        Assert.assertEquals(getTextElement(DROPDOWN_LOGIN_COUNTRY_CODE), "90", "country code didnT match");
    }

    public void clickVerifyBackButton () {
        LOGGER.info("Kullanıcı verify ekranında \"back\" butonuna basar");
        clickElement(BTN_VERIFY_BACK);
    }
    public void verifyVerifyTitle () {
        LOGGER.info("Kullanıcı başlık alanında \"We sent a text containing verification code\" yazdığını doğrular");
        Assert.assertEquals(getTextElement(TXT_VERIFY_TITLE), "We sent a text containing verification code", "text didnT match");
    }

    public void clickVerifyNextButton () {
        LOGGER.info("Kullanıcı verify ekranında \"NEXT\" butonuna basar");
        clickElement(BTN_VERIFY_NEXT);
    }

    public void clickVerifyResendButton () {
        LOGGER.info("Kullanıcı verify ekranında \"RESEND\" butonuna basar");
        clickElement(BTN_VERIFY_RESEND);
    }

    public void clickAppleKeyAutoComplete () {
        LOGGER.info("Kullanıcı verify ekranında, apple klavyesinden önerilen \"autocomplete\" 'e tıklar ");
        clickElement(APPLEKEY_AUTOCOMPLETE);
    }

    public void clickPopupErrorMsgOkBtn () {
        LOGGER.info("Kullanıcı hata popup'ı üzerinde yer alan \"OK\" butonuna basar");
        clickElement(POPUP_ERROR_MSG_OK_BTN);
    }

    public void clickLoginNowButton () {
        LOGGER.info("Kullanıcı login ekranında \"LOGIN NOW\" butonuna basar");
        clickElement(BTN_LOGIN_LOGINNOW);
    }



}
