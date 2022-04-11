package com.callrecorder.test.base;


import com.callrecorder.test.Listener.Listener;
import com.callrecorder.test.utilities.DriverThread;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

@Listeners({Listener.class})
public class BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);

    public IOSDriver<IOSElement> iosDriver;

    public IOSDriver<IOSElement> getIosDriver() {
        return iosDriver;
    }


    @Parameters({"platformVersion", "deviceName", "udid", "xcodeOrgId", "bundleId"})
    @BeforeClass(alwaysRun = true)
    public void beforeClass(String platformVersion, String deviceName, String udid, String xcodeOrgId, String bundleId) {
        DesiredCapabilities iosCaps = new DesiredCapabilities();

        iosCaps.setCapability("platformName", "ios");
        iosCaps.setCapability("platformVersion", platformVersion);
        iosCaps.setCapability("automationName", "XCUITest");
        iosCaps.setCapability("deviceName", deviceName);
        iosCaps.setCapability("udid", udid);
        iosCaps.setCapability("noReset", true);
        iosCaps.setCapability("useNewWDA", true);
        iosCaps.setCapability("xcodeOrgId", xcodeOrgId);
        iosCaps.setCapability("xcodeSigningId", "iPhone Developer");
        iosCaps.setCapability("bundleId", bundleId);


        try {
            iosDriver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), iosCaps);
        } catch (MalformedURLException e) {
            LOGGER.error("Driver could not be created! ErrorMessage: " + e.getMessage());
        }

        DriverThread.setDriver(iosDriver);
    }

    @BeforeMethod //Her case öncesinde programı kapatıp açar. AfterMethod olarakta yapılabilirdi.
    public void beforeMethod() {

        DriverThread.getDriver().launchApp();

    }

    @AfterClass // Her class sonrasında driver kapatılıp temizlenir.
    public void afterClass() {
        //DriverThread.getDriver().terminateApp("com.madduck.callblocker");
        DriverThread.getDriver().quit();
        DriverThread.setDriver(null);

    }


}
