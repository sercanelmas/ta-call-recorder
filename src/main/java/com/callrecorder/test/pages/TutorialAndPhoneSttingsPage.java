package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import com.callrecorder.test.utilities.DriverThread;
import io.appium.java_client.TouchAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import static io.appium.java_client.touch.offset.PointOption.point;

public class TutorialAndPhoneSttingsPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(TutorialAndPhoneSttingsPage.class);

    private static final By TXT_TUTORIALPAGE_TITLE = By.name("Enable Call Protection");
    private static final By BTN_TUTORIALPAGE_GOTOSETTINGS = By.xpath("//XCUIElementTypeButton[@name=\"Go To Settings\"]");

    private static final By TXT_PHONESETTINGSPAGE_PHONE = By.xpath("//XCUIElementTypeStaticText[@name=\"Phone\"]");
    private static final By SWBTN_PHONESETTINGSPAGE_ENABLE_DISABLE = By.xpath("//XCUIElementTypeSwitch[@name=\"Call Blocker\"]");
    private static final By BTN_PHONESETTINGSPAGE_CALLBLOCKINGANDIDENTIFICATION = By.name("CALL_DIRECTORIES");

    public void verify_TutorialPage_ScreenTitle() {
        LOGGER.info("kullanıcı \"Enable Call Protection\" başlığına bakar ve \"TUTORIAL\" ekranını doğrular.");
        Assert.assertTrue(isDisplayElement(TXT_TUTORIALPAGE_TITLE), "title is not match");
    }

    public void click_TutorialPage_GoToSettingsButton() {
        LOGGER.info("kullanıcı \"HOME PAGE\" sayfasına ilk defa geldiğinde \"TUTORIAL\" ekranı ile karşılaşır ve yönergeler ile GO TO SETTINGS butonuna basar.");
        clickElement(BTN_TUTORIALPAGE_GOTOSETTINGS);
    }

    public void click_TutorialPage_PhoneSetting_EnableOrDisableCallBlockerSwitchButton() {
        LOGGER.info("kullanıcı \"Settings\" de Call Blocker Switch butonuna basarak uygulamayı aktif/deaktif eder.");
        clickElement(SWBTN_PHONESETTINGSPAGE_ENABLE_DISABLE);
    }

    // UYGULAMA BAZEN HOME PAGE TUTORIAL EKRANINDAN SETTINGS E
    // YONLENDIRIRKEN BIR ONCEKI SAYFA OLAN PHONE SAYFASINA YONLENDIRIYOR.
    // KONTROL AMAÇLI BOOLEAN METHOD OLUŞTURDUM
    public boolean verify_SettingsPage_PhoneText() {
        LOGGER.info("kullanıcı\"SETTINGS PAGE\"'de \"Phone\" sayfasında olduğunu doğruluyor.");
        return isDisplayElement(TXT_PHONESETTINGSPAGE_PHONE);
    }

    public void click_SettingsPage_CallBlockingAndIdentification() {
        LOGGER.info("kullanıcı \"SETTINGS PAGE\"'de \"Phone\" \"sayfasında Call Blocking & Identification\" butonuna basar.");
        clickElement(BTN_PHONESETTINGSPAGE_CALLBLOCKINGANDIDENTIFICATION);
    }

    public void click_SettingsPage_ComeBackToApp() {
        LOGGER.info("kullanıcı sol üst köşede bulunan \"Call Blocker\" butonuna basarak uygulamaya geri gider.");
        TouchAction tap = new TouchAction<>(DriverThread.getDriver());
        tap.tap(point(42, 36)).perform();
    }







    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }
}
