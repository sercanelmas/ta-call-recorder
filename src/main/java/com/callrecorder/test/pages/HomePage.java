package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    private static final By BTN_CALLRECORD= By.name("recordButton200x200");
    private static final By POPUP_TITLE = MobileBy.AccessibilityId("Don't forget to add calls and merge calls.");
    private static final By BTN_RECOR_GIF_HOW_TO = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"How to\"`]");
    private static final By BTN_RECORD_GIF_CONTINUE = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Continue\"`]");





    }

    public void isDisplayed_RecentActivityText() {
        LOGGER.info("kullanıcı \"HOME PAGE\" sayfasında \"Recent \" textinin görüntülendiğini doğrular ");
        Assert.assertTrue(isDisplayElement(TXT_HOMEPAGE_CALLBLOCKER_RECENTACTIVITY), "web element not visible");

    }

    public void verify_HomePage_CallBlocker_Title() {
        LOGGER.info("kullanıcı ekranda \"Call Blocker\" başlığını görür ve \"HOME PAGE\"'de olduğunu doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_CALLBLOCKERTITLE),"Call Blocker", "title is not match");
    }

    public void click_SearchForANumber_TextBox() {
        LOGGER.info("kullanıcı \"HOME PAGE\" sayfasında \"Search for a number\" textboxına basar.");
        clickElement(TXTBOX_HOMEPAGE_SEARCHFORANUMBER);
    }

    public void click_HomePage_NavBar_CallBlockerButton() {
        LOGGER.info("kullanıcı Herhangi bir ekranda \"Call Blocker\" nav-bar butonuna basar.");
        clickElement(NAVBAR_BTN_HOMEPAGE_CALLBLOCKER);
    }

    public void verify_HomePage_RecentActivity_FirstCellBlockedText(){
        LOGGER.info("kullanıcı \"Call Blocker\" ekranında \"Recent Activity\" tablosunda ilk hücredeki \"Blocked\" textini doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_CALLBLOCKER_FIRSTCELL_BLOCKEDTEXT),"Blocked","text did not match");
    }

    public void verify_HomePage_RecentActivity_FirstCellUnblockedText(){
        LOGGER.info("kullanıcı \"Call Blocker\" ekranında \"Recent Activity\" tablosunda ilk hücredeki \"Blocked\" textini doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_CALLBLOCKER_FIRSTCELL_UNBLOCKEDTEXT),"Unblocked","text did not match");
    }

    public void click_HomePage_Recent_RecentActivity_FirstCell(){
        LOGGER.info("kullanıcı \"Call Blocker\" ekranında \"Recent Activity\" table viewde ilk hücreye basar.");
        List<IOSElement> list = waitAllVisibleByLocator(RECENTACVTIVITY_ALLCELL);
        IOSElement firstElement = list.get(0);
        firstElement.click();
    }

    public void click_HomePage_Recent_RecentActivity_ThirdCell(){
        LOGGER.info("kullanıcı \"Call Blocker\" ekranında \"Recent Activity\" table viewde üçüncü hücreye basar.");
        List<IOSElement> list = waitAllVisibleByLocator(RECENTACVTIVITY_ALLCELL);
        IOSElement firstElement = list.get(2);
        firstElement.click();
    }

 //   public void randomNumber_HomePage_SearchBar(){
     //   LOGGER.info("\"Search Bar\" alanına random numara gönderilir");
   //     randomNumber(TXTBOX_HOMEPAGE_SEARCHFORANUMBER);
   // }







    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }

}
