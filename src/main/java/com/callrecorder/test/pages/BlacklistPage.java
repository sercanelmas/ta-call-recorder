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

public class BlacklistPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(BlacklistPage.class);

    private static final By NAVBAR_BTN_HOMEPAGE_BLACKLIST = By.xpath("//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[1]");
    private static final By TXT_HOMEPAGE_BLACKLIST_BLACKLISTTITLE = By.xpath("(//XCUIElementTypeStaticText[@name=\"Blacklist\"])[1]");
    private static final By TXT_HOMEPAGE_BLACKLIST_EMPTYLIST = By.name("There is no blocked data in your phone.");
    private static final By CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR = By.className("XCUIElementTypeCell");
    private static final By CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR = By.className("XCUIElementTypeStaticText");
    private static final By BTN_BLACKLIST_CONTACTS = By.xpath("//XCUIElementTypeButton[@name=\"Contacts\"]");
    private static final By BTN_BLACKLIST_BLACKLIST = By.xpath("//XCUIElementTypeButton[@name=\"Blacklist\"]");
    private static final By VERIFYELEMENT_BLACKLIST_SHARPICON = MobileBy.AccessibilityId("#");
    private static final By TXTBOX_BLACKLIST_SEARCHBAR = MobileBy.iOSNsPredicateString("value == \"Search for a number / name\"");
    private static final By BTN_BLACKLIST_KEYBOARD_CANCEL = MobileBy.AccessibilityId("Cancel");



    public void isEnabled_BlacklistPage_BlacklistButton() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Blacklist\" butonunun işlevselliğini doğrular");
        Assert.assertTrue(isEnableElement(BTN_BLACKLIST_BLACKLIST), "button did not enable");
    }

    public void isEnabled_BlacklistPage_ContacsButton() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Contacs\" butonunun işlevselliğini doğrular");
        Assert.assertTrue(isEnableElement(BTN_BLACKLIST_CONTACTS), "button did not enable");
    }

    public void isDisplay_BlacklistPage_Searchforanumbernamebar() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name bar.\" textbox'ının görünürlüğünü doğrular.");
        Assert.assertTrue(isDisplayElement(TXTBOX_BLACKLIST_SEARCHBAR), "textbox did not visible");
    }

    public void click_BlacklistPage_NavBar_BlacklistButton() {
        LOGGER.info("kullanıcı navbar'da \"Blacklist\" butonuna basar.");
        clickElement(NAVBAR_BTN_HOMEPAGE_BLACKLIST);
    }

    public void verify_BlacklistPage_Title() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranına geldiğini \"Blacklist\" başlığını görerek doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_BLACKLIST_BLACKLISTTITLE), "Blacklist", "title did not match.");
    }

    public void verify_Blacklist_EmptyListText() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında listenin boş olduğunu ve DATA'nın başarılı bir şekilde listeden kaldırıldığını doğrular.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_BLACKLIST_EMPTYLIST), "There is no blocked data in your phone.", "text did no match.");
    }

    public void click_Blacklist_TableView_FirstCell() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında listenin birinci hücresine basar.");
        List<IOSElement> elements = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        IOSElement firstElement = elements.get(0);
        firstElement.click();
        System.out.println(elements);
    }

    public void click_Blacklist_TableView_SecondCell() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında listenin ikinci hücresine basar.");
        List<IOSElement> elements = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        IOSElement firstElement = elements.get(1);
        firstElement.click();
    }

    public void click_Blacklist_ContactsButton() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Contacts\" butonuna basar.");
        clickElement(BTN_BLACKLIST_CONTACTS);
    }

    public void verify_Blacklist_ContactList() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Contacts\" listesini doğrular.");
        Assert.assertTrue(isDisplayElement(VERIFYELEMENT_BLACKLIST_SHARPICON), "Contacts did not appear");
    }

    public void click_Blacklist_Contacts_TableView_FirstCell() {
        LOGGER.info("kullanıcı \"Contacs\" ekranında listenin birinci hücresine basar.");
        List<IOSElement> elements = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        IOSElement firstContacts = elements.get(0);
        firstContacts.click();
    }

    public void click_Blacklist_BlacklistButton() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Blacklist\" butonuna basar.");
        clickElement(BTN_BLACKLIST_BLACKLIST);
    }

    public void click_Blacklist_SearcForANumberNameTextBox_SendKeys_Test1() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name\" butonuna basar ve \"test1\" yazar.");
        setTextElement(TXTBOX_BLACKLIST_SEARCHBAR, "test1");
    }

    public void click_Blacklist_SearcForANumberNameTextBox_SendKeys_Test2() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name\" butonuna basar ve \"test2\" yazar.");
        setTextElement(TXTBOX_BLACKLIST_SEARCHBAR, "test2");
    }

    public void sendKeys_Blacklist_SearcForANumberNameTextBox_Test3() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name\" butonuna basar ve \"test3\" yazar.");
        setTextElement(TXTBOX_BLACKLIST_SEARCHBAR, "test3");
    }

    public void click_Blacklist_SearcForANumberNameTextBox_XButton() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name\" kısmında \"X\" butonuna basar.");
        TouchAction action = new TouchAction<>(DriverThread.getDriver());
        action.tap(PointOption.point(347, 135)).perform();
    }

    public void click_Blacklist_SearcForANumberNameTextBox() {
        LOGGER.info("kullanıcı \"Blacklist\" ekranında \"Search for a number / name\" texbox'ına basar.");
        clickElement(TXTBOX_BLACKLIST_SEARCHBAR);
    }

    public void verify_Blacklist_SearchBar_isDisable() {
        LOGGER.info("kullanıcı  \"Search for a number / name\" kısmında \"X\" butonuna bastıktan sonra textbox'ın disable olduğunu doğrular.");
        List<IOSElement> list = waitAllVisibleByLocator(BTN_BLACKLIST_KEYBOARD_CANCEL);
        Assert.assertEquals(list.size(),0,"Searchbar still enable");
    }

    public void verify_Blacklist_Contacts_PhoneNumber_test1() {
        LOGGER.info("kullanıcı  \"Search for a number / name\" kısmına \"05347689842\" numarasını yazar ilk hücrede test1 kaydının geldiğini doğrular");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w : list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(0).getText();
            Assert.assertEquals(recentStatus,"test1 ","text did not match");
            LOGGER.info("\"Table View\" gelen numarada \"test1\" doğrulanır.");
        }
    }

    public void verify_Blacklist_Contacts_ContactName_test1() {
        LOGGER.info("kullanıcı  \"Search for a number / name\" kısmına \"test1\" numarasını yazar ilk hücrede 05347689842 kaydının geldiğini doğrular");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w : list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(1).getText();
            Assert.assertEquals(recentStatus,"0 (534) 768 98 42","text did not match");
            LOGGER.info("\"Table View\" gelen numarada \"05347689842\" doğrulanır.");
        }
    }


    public void verify_Blacklist_Contacts_PhoneNumber_test2() {
        LOGGER.info("kullanıcı  \"Search for a number / name\" kısmına \"05347689849\" numarasını yazar ilk hücrede test2 kaydının geldiğini doğrular");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w : list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(0).getText();
            Assert.assertEquals(recentStatus,"test2 ","text did not match");
            LOGGER.info("\"Table View\" gelen numarada \"test2\" doğrulanır.");
        }
    }

    public void verify_Blacklist_Contacts_PhoneNumber_test3() {
        LOGGER.info("kullanıcı  \"Search for a number / name\" kısmına \"05347689847\" numarasını yazar ilk hücrede test3 kaydının geldiğini doğrular");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w : list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(0).getText();
            Assert.assertEquals(recentStatus,"test3 ","text did not match");
            LOGGER.info("\"Table View\" gelen numarada \"test3\" doğrulanır.");
        }
    }

    public void verify_BlacklistPage_TableviewListExistingNumber(){
        LOGGER.info("kullanıcı \"Blacklist\" ekranında tableview de \"Contacts\" larda var olan numaraların olduğunu doğrular. ");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w:list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(1).getText();
            System.out.println(recentStatus);
            assertContains(recentStatus,"05347689842","05347689849","05347689847");
            LOGGER.info("\"Blacklist\" ekranında \"Blocked\" numaralı olan hücreler doğrulanıyor");
        }
    }

    public void verify_BlacklistPage_TableviewListNoneExistingNumber(){
        LOGGER.info("kullanıcı \"Blacklist\" ekranında tableview de \"Contacts\" larda olmayan numaraların olduğunu doğrular. ");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        for (IOSElement w:list) {
            String recentStatus = w.findElements(CELL_BLACKLIST_COLLECTIONVIEW_TEXTS_LOCATOR).get(1).getText();
            System.out.println(recentStatus);
            assertContains(recentStatus,"05469000001","05469000002","05469000003");
            LOGGER.info("\"Blacklist\" ekranında \"Blocked\" numaralı olan hücreler doğrulanıyor");
        }
    }

    public void verify_Blacklist_ContactList_Empty(){
        LOGGER.info("kullanıcı \"Contact List\" in boş olduğunu doğrular.");
        List<IOSElement> list = waitAllVisibleByLocator(CELL_BLACKLIST_COLLECTIONVIEW_LOCATOR);
        Assert.assertEquals(list.size(),0,"Contact List is not Empty");
    }




    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }

}
