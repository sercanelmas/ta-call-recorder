package com.callrecorder.test.PaywallPage;

import com.callrecorder.test.base.BaseTest;
import com.callrecorder.test.pages.LandingPage;
import com.callrecorder.test.pages.PaymentPage;
import com.callrecorder.test.pages.PaywallPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Objects;

import static com.callrecorder.test.extentreports.ExtentTestManager.getTest;
import static com.callrecorder.test.extentreports.ExtentTestManager.startTest;

public class PaywallView extends BaseTest {

    LandingPage landingPage;
    PaywallPage pwPage;
    PaymentPage pmPage;

    @Test(enabled = true, description = "C275 Paywall View SENARYOSU")
    public void paywallView(Method method) throws InterruptedException {
        startTest(method.getName(), "C275 Paywall View SENARYOSU");
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(iosDriver)).getScreenshotAs(OutputType.BASE64);

        landingPage = new LandingPage();
        pwPage = new PaywallPage();
        pmPage = new PaymentPage();

        landingPage.click_LandingPage_LetsStartButton();
        getTest().info("kullanıcı \"Let's Start\" butonuna basar.");

        pwPage.verify_PwMain_AutorenewedText();
        getTest().info("kullanıcı paywall main ekranında \"Apple subscriptions are automatically renewed.\"yazısını görerek paywall sayfasına geldiğini kontrol eder.");
    }

}
