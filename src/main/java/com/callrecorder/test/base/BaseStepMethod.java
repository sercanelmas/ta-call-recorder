package com.callrecorder.test.base;

import com.callrecorder.test.utilities.DriverThread;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.testng.Assert.assertTrue;

public class BaseStepMethod {

    private static final Logger LOGGER = LogManager.getLogger(BaseStepMethod.class);

    protected IOSDriver<IOSElement> iosDriver = DriverThread.getDriver();
    private final WebDriverWait wait;

    public BaseStepMethod() {
        this.wait = new WebDriverWait(iosDriver, 30);

        if (iosDriver.isDeviceLocked())
            iosDriver.unlockDevice();
    }

    protected MobileElement waitVisibleByLocator(By locator) {
        MobileElement element = null;

        try {
            element = (IOSElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            LOGGER.error("Web element is not visible!");
        }
        return element;
    }

    protected List<IOSElement> waitAllVisibleByLocator(By locator) {
        List<IOSElement> element = null;

        try {
            element = iosDriver.findElements(locator);
        } catch (Exception e) {
            LOGGER.error("Web element is not visible!");
        }
        return element;
    }

    protected MobileElement waitClickableByOfElement(MobileElement mobileElement) {
        MobileElement element = null;

        try {
            element = (IOSElement) wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
        } catch (Exception e) {
            LOGGER.error("Web element is not clickable!");
        }
        return element;
    }

    protected MobileElement waitPresenceOfElementByLocator(By locator) {
        MobileElement element = null;

        try {
            element = (IOSElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            LOGGER.error("Web element not found in document!");
        }
        return element;
    }

    protected void clickElement(By locator) {
        MobileElement element = this.waitVisibleByLocator(locator);
        waitClickableByOfElement(element).click();
    }



    protected String getTextElement(By locator) {
        return waitPresenceOfElementByLocator(locator).getText();
    }



    protected MobileElement setTextElement(By locator, String text) {
        MobileElement element = waitPresenceOfElementByLocator(locator);
        element.clear();
        element.sendKeys(text);

        return element;
    }
    /* android de back tuşu için kullanılır.
    protected void backClick() {
        //androidDriver.pressKeyCode(AndroidKeyCode.BACK);
        iosDriver.pressKey(new KeyEvent(.BACK));
    }
    */
    public void testSeekBarToEnd(By locator) {
        //Locating seekbar using resource id
        MobileElement seek_bar_element = waitVisibleByLocator(locator);
        // get start co-ordinate of seekbar
        int start = seek_bar_element.getLocation().getX();
        //Get width of seekbar
        int padding = 250;// Couldn't scroll to the last part because of padding.
        int end = seek_bar_element.getSize().getWidth() + padding;
        //get location of seekbar vertically
        int y = seek_bar_element.getLocation().getY();

        // Select till which position you want to scroll the seekbar
        TouchAction action = new TouchAction(iosDriver);

        //Move it will the end
        action.longPress(PointOption.point(start, y)).moveTo(PointOption.point(end, y)).release().perform();
    }


    public String getToastMessage() {
        WebElement toastView = iosDriver.findElement(By.xpath("//android.widget.Toast[1]"));
        return toastView.getAttribute("name");
    }

    public void resultTakeScreenShot(String scenarioName) {
        takeScreenShot(scenarioName, false);
    }

    public void errorMessage(String scenarioName, String message) {
        takeScreenShot(scenarioName, true);
        Assert.fail(message);
    }

    public static String takeScreenShot(String methodName, boolean isFail) {

        try {
            String fail = isFail ? "FailTest" : "TestResult";
            SimpleDateFormat formatterDate = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
            String time = formatterDate.format(new Date());

            String screenshotLoc = System.getProperty("user.dir") + File.separator + "ScreenshotFile" + File.separator + fail +
                    File.separator + time + "_" + methodName.replaceAll(" ", "") + ".png";

            File srcFiler = ((TakesScreenshot) DriverThread.getDriver()).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(srcFiler, new File(screenshotLoc));
            return screenshotLoc;
        } catch (IOException e) {
            LOGGER.error("Error occurred in screenshot file operations!", e);

            Assert.fail(e.getMessage());

            return null;
        }
    }
    public void swipeThirdParagraph() {
        TouchAction swipe = new TouchAction(iosDriver);
        swipe.longPress(PointOption.point(150, 725)).moveTo(PointOption.point(150, 225)).release().perform();
    }

    public boolean isDisplayElement(By locator){
        MobileElement element = waitPresenceOfElementByLocator(locator);
        return element.isDisplayed();

    }

    public boolean isEnableElement(By locator){
        MobileElement element = waitPresenceOfElementByLocator(locator);
        return element.isEnabled();
    }


    public void assertContains(Object actual, Object ... expected) {
        assertTrue(Arrays.asList(expected).contains(actual),"text did not match");
    }

    public void randomChar(By locator){
        String uuid = UUID.randomUUID().toString();
        MobileElement element = setTextElement(locator,uuid);

    }

    public void randomNumber (By locator){
        Random random = new Random();
        int randomNumber = random.nextInt(9999999);
    }







}
