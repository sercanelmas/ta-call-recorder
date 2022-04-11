package com.callrecorder.test.settings;


import com.callrecorder.test.base.BaseTest;
import com.callrecorder.test.pages.HomePage;
import com.callrecorder.test.pages.SettingsPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


import static com.callrecorder.test.extentreports.ExtentTestManager.getTest;
import static com.callrecorder.test.extentreports.ExtentTestManager.startTest;

public class C239_SettingsCountry extends BaseTest {
    SettingsPage settingspage;
    HomePage homePage;

    @Test(description = "C247 Settings Clear History Senaryosu")
    public void c239_SettingsCountry(Method method) {
        startTest(method.getName(), "C247 Settings Clear History Senaryosu");

        settingspage = new SettingsPage();
        homePage = new HomePage();

        homePage.verify_HomePage_CallBlocker_Title();
        getTest().info("kullanıcı ekranda \"Call Blocker\" başlığını görür ve \"HOME PAGE\"'de olduğunu doğrular.");

        settingspage.click_Settings_NavBarSettings();
        getTest().info("kullanıcı home page navbar'da \"settings\" butonuna basar");

        settingspage.verify_SettingsSelectedCountry();
        getTest().info("Country alanında seçili ülkenin \"Turkey\" olduğu doğrulanır");

        homePage.click_HomePage_NavBar_CallBlockerButton();
        getTest().info("kullanıcı Herhangi bir ekranda \"Call Blocker\" nav-bar butonuna basar.");

        homePage.verify_HomePage_CallBlocker_Title();
        getTest().info("kullanıcı ekranda \"Call Blocker\" başlığını görür ve \"HOME PAGE\"'de olduğunu doğrular.");
    }

}
