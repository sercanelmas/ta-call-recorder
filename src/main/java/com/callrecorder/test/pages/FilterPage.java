package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.ios.IOSElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class FilterPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(FilterPage.class);

    private static final By BTN_HOMEPAGE_FILTER = By.xpath("//XCUIElementTypeButton[@name=\"Filter\"]");
    private static final By BTN_HOMEPAGE_FILTER_ALLBUTTON = By.xpath("//XCUIElementTypeButton[@name=\"All\"]");
    private static final By BTN_HOMEPAGE_FILTER_BLOCKEDBUTTON = By.xpath("//XCUIElementTypeButton[@name=\"Blocked\"]");
    private static final By BTN_HOMEPAGE_FILTER_UNBLOCKEDBUTTON = By.xpath("//XCUIElementTypeButton[@name=\"Unblocked\"]");
    private static final By RECENTACVTIVITY_ALLCELL = By.className("XCUIElementTypeCell");
    private static final By RECENTACTIVITY_TEXTCELLINFO = By.className("XCUIElementTypeStaticText");


    public void isDisplayed_HomePage_FilterButton() {
        LOGGER.info("kullanıcı \"HOME PAGE\" sayfasında \"Filter \" butonun görüntülendiğini doğrular ");
        Assert.assertTrue(isDisplayElement(BTN_HOMEPAGE_FILTER), "web element not visible");
    }

    public void click_HomePage_FilterButton(){
        LOGGER.info("kullanıcı \"Call Blocker\" ekranında \"Filter\" butonuna basar.");
        clickElement(BTN_HOMEPAGE_FILTER);
    }

    public void click_FilterPage_AllButton(){
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"All\" butonuna basar");
        clickElement(BTN_HOMEPAGE_FILTER_ALLBUTTON);
    }

    public void click_FilterPage_BlockedClick(){
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"Blocked\" butonuna basar");
        clickElement(BTN_HOMEPAGE_FILTER_BLOCKEDBUTTON);
    }

    public void click_FilterPage_UnblockedClick(){
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"Unblocked\" butonuna basar");
        clickElement(BTN_HOMEPAGE_FILTER_UNBLOCKEDBUTTON);
    }

    public void verify_FilterPage_FilterDropDown_Elements(){
        LOGGER.info("kullanıcı \"Filter\" butonuna bastıktan sonra dropdown menüsünde \"All, Blocked,Unblocked\" textlerini doğrular.");

        Assert.assertEquals(getTextElement(BTN_HOMEPAGE_FILTER_ALLBUTTON),"All","text did not match");
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"All\" textini doğrular");
        Assert.assertEquals(getTextElement(BTN_HOMEPAGE_FILTER_BLOCKEDBUTTON),"Blocked","text did not match");
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"Blocked\" textini doğrular");
        Assert.assertEquals(getTextElement(BTN_HOMEPAGE_FILTER_UNBLOCKEDBUTTON),"Unblocked","text did not match");
        LOGGER.info("kullanıcı \"Filter\" dropdownda \"Unblocked\" textini doğrular");

    }

    public void verify_FilterPage_AllCell_AllButton(){
        LOGGER.info("\"All\" butonu hücrelerindeki statusleri doğruluyor");

        List<IOSElement> list = waitAllVisibleByLocator(RECENTACVTIVITY_ALLCELL);
        for (IOSElement w:list) {
            String recentStatus = w.findElements(RECENTACTIVITY_TEXTCELLINFO).get(2).getText();
            assertContains(recentStatus,"Blocked","Unblocked");
            System.out.println(list);
            LOGGER.info("\"Filter\" dropdownda \"Blocked\" ve \"Unblocked\" olan hücreler doğrulanıyor");

        }
    }

    public void verify_FilterPage_AllCell_BlockedButton(){
        LOGGER.info("\"Blocked\" butonu hücrelerindeki statusleri doğruluyor");
        List<IOSElement> list = waitAllVisibleByLocator(RECENTACVTIVITY_ALLCELL);
        for (IOSElement w:list) {
            String recentStatus = w.findElements(RECENTACTIVITY_TEXTCELLINFO).get(2).getText();
            assertContains(recentStatus,"Blocked");
            LOGGER.info("\"Filter\" dropdownda \"Blocked\" olan hücreler doğrulanıyor");
        }
    }


    public void verify_FilterPage_AllCell_UnblockedButton(){
        LOGGER.info("\"Unblocked\" butonu hücrelerindeki statusleri doğruluyor");
        List<IOSElement> list = waitAllVisibleByLocator(RECENTACVTIVITY_ALLCELL);
        for (IOSElement w:list) {
            String recentStatus = w.findElements(RECENTACTIVITY_TEXTCELLINFO).get(2).getText();
            assertContains(recentStatus,"Unblocked");
            LOGGER.info("\"Filter\" dropdownda \"Unblocked\" olan hücreler doğrulanıyor");
        }
    }





    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}
