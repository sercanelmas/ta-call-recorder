package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import io.appium.java_client.MobileBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DataPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(DataPage.class);



    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_0 = By.name("0");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_1 = By.name("1");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_2 = By.name("2");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_3 = By.name("3");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_4 = By.name("4");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_5 = By.name("5");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_6 = By.name("6");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_7 = By.name("7");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_8 = By.name("8");
    private static final By BTN_HOMEPAGE_SEARCHFORANUMBER_9 = By.name("9");



    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA1RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"0123456789\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA2RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"1111111111\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA3RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"2222222222\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA4RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"9999999999\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA5RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"8888888888\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA6RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"0135792468\"])[1]");
    private static final By TXT_HOMEPAGE_SEARCHNUMBER_DATA7RESULT = By.xpath("(//XCUIElementTypeStaticText[@name=\"0246813579\"])[1]");

    private static final By TXT_HOMEPAGE_BLACKLIST_DATA2RESULT = By.name("1111111111");
    private static final By BTN_HOMEPAGE_SEARCHNUMBER = By.xpath("(//XCUIElementTypeStaticText[@name=\"Search Number\"])[2]");

    private static final By TXTBOX_BLACKLIST_CONTACTS_SEARCHFORANUMBERNAME = MobileBy.iOSNsPredicateString("value == \"Search for a number / name\"");

    private static final By TXTBOX_HOMEPAGE_SEARCHNUMBER = By.xpath("(//XCUIElementTypeStaticText[@name=\"Search Number\"])[2]");


    public void enter_SearchForANumber_Keyboard_Data1() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA1 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_0);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_3);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_4);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_5);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_6);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_7);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
    }

    public void enter_SearchForANumber_Keyboard_Data2() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA2 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
    }

    public void enter_SearchForANumber_Keyboard_Data3() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA3 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);

    }

    public void enter_SearchForANumber_Keyboard_Data4() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA4 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);

    }

    public void enter_SearchForANumber_Keyboard_Data5() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA5 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);

    }

    public void enter_SearchForANumber_Keyboard_Data6() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA6 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_0);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_3);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_5);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_7);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_4);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_6);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);

    }

    public void enter_SearchForANumber_Fast_Data6(){
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda h??zl?? DATA6 tu??lar");
        setTextElement(BTN_HOMEPAGE_SEARCHNUMBER,"0135792468");
    }

    public void enter_SearchForANumber_Keyboard_Data7() {
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda DATA7 tu??lar");
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_0);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_2);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_4);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_6);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_8);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_1);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_3);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_5);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_7);
        clickElement(BTN_HOMEPAGE_SEARCHFORANUMBER_9);

    }
    public void enter_SearchForANumber_Fast_Data7(){
        LOGGER.info("kullan??c?? \"Search Number\" ekran??nda h??zl?? DATA6 tu??lar");
        setTextElement(BTN_HOMEPAGE_SEARCHNUMBER,"0246813579");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA1() {
        LOGGER.info("kullan??c?? DATA1=\"0123456789\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA1RESULT), "0123456789", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA2() {
        LOGGER.info("kullan??c?? DATA2=\"1111111111\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA2RESULT), "1111111111", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA3() {
        LOGGER.info("kullan??c?? DATA3=\"2222222222\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA3RESULT), "2222222222", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA4() {
        LOGGER.info("kullan??c?? DATA4=\"9999999999\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA4RESULT), "9999999999", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA5() {
        LOGGER.info("kullan??c?? DATA5=\"8888888888\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA5RESULT), "8888888888", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA6() {
        LOGGER.info("kullan??c?? DATA6=\"0135792468\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA6RESULT), "0135792468", "numbers did not match.");
    }

    public void verify_SearchForANumber_ClickedSearchNumber_DATA7() {
        LOGGER.info("kullan??c?? DATA7=\"0246813579\" rakamlar??n??n textinin do??rulamas??n?? yapar");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_SEARCHNUMBER_DATA7RESULT), "0246813579", "numbers did not match.");
    }

    public void verify_BlacklistPage_DATA2() {
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda DATA2:1111111111 'yi do??ruluyor.");
        Assert.assertEquals(getTextElement(TXT_HOMEPAGE_BLACKLIST_DATA2RESULT), "1111111111", "Text did not match.");
    }

    public void sendKeys_BlacklistPage_Test1_Number(){
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689842\" numaras??n?? girer");
        setTextElement(TXTBOX_BLACKLIST_CONTACTS_SEARCHFORANUMBERNAME,"05347689842");
    }

    public void sendKeys_BlacklistPage_Test2_Number() {
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689849\" numaras??n?? girer");
        setTextElement(TXTBOX_BLACKLIST_CONTACTS_SEARCHFORANUMBERNAME,"05347689849");
    }
    public void sendKeys_BlacklistPage_Test3_Number() {
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689847\" numaras??n?? girer");
        setTextElement(TXTBOX_BLACKLIST_CONTACTS_SEARCHFORANUMBERNAME,"05347689847");
    }

    public void sendKeys_BlacklistPage_NoneExistTest1_Number(){
        LOGGER.info("kullan??c?? \"Contacts\" ekran??nda \"Search for a number / name\" k??sm??na \"05469000001\" numaras??n?? girer");
        setTextElement(TXTBOX_BLACKLIST_CONTACTS_SEARCHFORANUMBERNAME,"05469000001");
    }

    public void sendKeys_SearchNumberPage_Test1_Number(){
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689842\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05347689842");
    }

    public void sendKeys_SearchNumberPage_Test2_Number() {
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689849\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05347689849");
    }
    public void sendKeys_SearchNumberPage_Test3_Number() {
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05347689847\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05347689847");
    }

    public void sendKeys_SearchNumberPage_NoneExistTest1_Number(){
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05469000001\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05469000001");
    }

    public void sendKeys_SearchNumberPage_NoneExistTest2_Number(){
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05469000002\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05469000002");
    }

    public void sendKeys_SearchNumberPage_NoneExistTest3_Number(){
        LOGGER.info("kullan??c?? \"Blacklist\" ekran??nda \"Search for a number / name\" k??sm??na \"05469000003\" numaras??n?? girer");
        setTextElement(TXTBOX_HOMEPAGE_SEARCHNUMBER,"05469000003");
    }





    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }

}
