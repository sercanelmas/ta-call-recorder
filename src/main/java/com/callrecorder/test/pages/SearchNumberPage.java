package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import com.callrecorder.test.utilities.DriverThread;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class SearchNumberPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(SearchNumberPage.class);


    private static final By TXTBOX_HOMEPAGE_SEARCHNUMBER = By.xpath("(//XCUIElementTypeStaticText[@name=\"Search Number\"])[2]");
    // BTN_HOMEPAGE_SEARCHNUMBER homepage de değil.
    private static final By CELL_HOMEPAGE_SEARCHNUMBER_FIRSTCELL = By.className("XCUIElementTypeCell");
    private static final By BTN_HOMEPAGE_SEARCHNUMBER_XMARKGRAYICON = By.xpath("(//XCUIElementTypeButton[@name=\"xmarkGrayIcon\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBERPAGETITLE = By.xpath("(//XCUIElementTypeStaticText[@name=\"Search Number\"])[1]");
    private static final By KEYBOARD_HOMEPAGE_SEARCHNUMBER = By.className("XCUIElementTypeKeyboard");
    private static final By TXT_SEARCHNUMBER_RECENT = MobileBy.AccessibilityId("Recent");
    private static final By BTN_SEARCHNUMBERPAGE_XBUTTON = By.xpath("(//XCUIElementTypeButton[@name=\"xmarkGrayIcon\"])[1]");





    public void verify_SearchNumberPage_Title() {
        LOGGER.info("Kullanıcı \"Search Number\" sayfasında olduğunu doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBERPAGETITLE), "Search Number", "title is not match");

    }

    public void click_SearchNumberPage_SearchNumberButton() {
        LOGGER.info("kullanıcı rakamlar tuşlandıktan sonra\"Search Number\" butonuna basar");
        clickElement(TXTBOX_HOMEPAGE_SEARCHNUMBER);
    }

    public void click_SearchNumberPage_GotoCallBlocker_XButton() {
        LOGGER.info("kullanıcı \"Call Blocker\" sayfasına gitmek için \"X\" butonuna basar. ");
        clickElement(BTN_HOMEPAGE_SEARCHNUMBER_XMARKGRAYICON);
    }

    public void click_SearchNumberPage_TableViewData() {
        LOGGER.info("kullanıcı \"Search Number\" ekranında \"Table View\" alanında çıkan İLK sonuca basar. ");
        clickElement(CELL_HOMEPAGE_SEARCHNUMBER_FIRSTCELL);
    }

    public void verify_SearchNumberPage_Keyboard() {
        LOGGER.info("kullanıcı \"HOME PAGE\" sayfasında \"Search for a number\" textboxına bastıktan sonra Rakamlardan oluşan klavyeyi görür.");
        Assert.assertTrue(isEnableElement(KEYBOARD_HOMEPAGE_SEARCHNUMBER), "keyboard is not visible.");
    }

    public void verify_SearchNumberPage_RecentText(){
        LOGGER.info("kullanıcı \"Search for a number\" textboxında aksiyon olmadığını \"Recent\" textinin varlığı ile doğrular.");
        Assert.assertTrue(isDisplayElement(TXT_SEARCHNUMBER_RECENT),"text did not visible");
    }

    public void verify_SearchNumberPage_ListLenght(){
        LOGGER.info("Search number page table view ekranının boş olduğu doğrulanır");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_HOMEPAGE_SEARCHNUMBER_FIRSTCELL);
        Assert.assertNull(list,"list did not empty");
    }

    public void touch_HomePage_SearchBar_XButton (){
        LOGGER.info("Kullanıcı search bar'da \"X\" butonuna basar");
        TouchAction action = new TouchAction<>(DriverThread.getDriver());
        action.tap(PointOption.point(345, 140)).perform();
    }

    public void click_SearchNumberPage_XButton () {
        LOGGER.info("Kullanıcı search number sayfasını kapatmak için \"X\" butonuna tıklar");
        clickElement(BTN_SEARCHNUMBERPAGE_XBUTTON);
    }





    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }

}
