package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.MobileBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class Settings_ManageSubs extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(Settings_ManageSubs.class);

    private static final By BTN_MANAGESUBS_XBUTTON = MobileBy.AccessibilityId("CloseIcon");
    private static final By TXT_MANAGESUBS_DESCRIPTION = MobileBy.AccessibilityId("Is there a problem? We are here to support you. First up, could you please give your email address and country?");
    private static final By TXTBOX_MANAGESUBS_EMAIL = MobileBy.iOSNsPredicateString("type == \"XCUIElementTypeTextField\"");
    private static final By DROPDOWN_MANAGESUBS_COUNTRY = MobileBy.AccessibilityId("DropDown.Icon");
    private static final By LIST_MANAGESUBS_COUNTRY = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private static final By BTN_MANAGESUBS_CONTINUE = MobileBy.AccessibilityId("Continue");
    private static final By TXT_MANAGESUBS_COUNTRY1 = MobileBy.iOSClassChain("**/XCUIElementTypePickerWheel[`value == \"Afghanistan\"`]/XCUIElementTypeOther[1]");
    private static final By BTN_MANAGESUBS_COUNTRYSELECT = MobileBy.AccessibilityId("Select");
    private static final By BTN_MANAGESUBS_COUNTRYCANCEL = MobileBy.AccessibilityId("Cancel");
    private static final By TXT_MANAGESUBS_USEREASON_TITLE = MobileBy.iOSNsPredicateString("label == \"What was your reason to use our app?\"");
    private static final By TXT_MANAGESUBS_USEREASON_REPORTSPAMNUMBERS = MobileBy.AccessibilityId("To report spam numbers");
    private static final By TXT_MANAGESUBS_USEREASON_BLOCKSPECIFICCONTACTS = MobileBy.AccessibilityId("To block calls from specific contacts");
    private static final By TXT_MANAGESUBS_USEREASON_BLOCKSPAMCALLS = MobileBy.AccessibilityId("To block spam calls");
    private static final By TXT_MANAGESUBS_CANCELREASON_TITLE = MobileBy.iOSNsPredicateString("label == \"Please select your reason for cancellation\"");
    private static final By TXT_MANAGESUBS_CANCELREASON_TOOEXPENSIVE = MobileBy.AccessibilityId("Too expensive");
    private static final By TXT_MANAGESUBS_CANCELREASON_NOTENOUGH = MobileBy.AccessibilityId("Spam numbers database is not enough");
    private static final By TXT_MANAGESUBS_CANCELREASON_DIFFICULTTOUSE = MobileBy.AccessibilityId("Difficult to use");
    private static final By TXT_MANAGESUBS_CANCELREASON_TECHNICALISSUES = MobileBy.AccessibilityId("Technical issues");
    private static final By TXT_MANAGESUBS_CANCELREASON_MISTAKE = MobileBy.AccessibilityId("I signed up by mistake");
    private static final By TXT_MANAGESUBS_CANCELREASON_CANTBLOCK = MobileBy.AccessibilityId("I can't block numbers");
    private static final By TXT_MANAGESUBS_CANCELREASON_NOTWORKING = MobileBy.AccessibilityId("Blocking is not working");
    private static final By TXT_MANAGESUBS_OFFER_TITLE = MobileBy.AccessibilityId("We prepared a special offer for you");
    private static final By TXT_MANAGESUBS_CURRENTLY_PRICE = MobileBy.AccessibilityId("10tl");
    private static final By TXT_MANAGESUBS_OFFER_PRICE = MobileBy.AccessibilityId("5tl");
    private static final By TXT_MANAGESUBS_OFFER_TERMSCONDITIONS = By.xpath("//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]");
    private static final By TXT_MANAGESUBS_OFFER_PRIVACYPOLICY = By.xpath("//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]");
    private static final By BTN_MANAGESUBS_OFFER_CONTINUE = By.xpath("//XCUIElementTypeButton[@name=\"Continue\"]");



    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}

