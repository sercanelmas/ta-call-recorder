package com.callrecorder.test.utilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class DriverThread {

    private static final ThreadLocal<IOSDriver<IOSElement>> driverThreadLocal = new ThreadLocal<>();


    public DriverThread() {
    }

    public static synchronized IOSDriver<IOSElement> getDriver() {
        return driverThreadLocal.get();
    }

    public static synchronized void setDriver(IOSDriver<IOSElement> driver) {
        DriverThread.driverThreadLocal.set(driver);
    }

}
