package com.callrecorder.test.PaywallPage;

import com.callrecorder.test.base.BaseTest;
import com.callrecorder.test.pages.LandingPage;
import com.callrecorder.test.pages.LoginPage;
import com.callrecorder.test.pages.PaymentPage;
import com.callrecorder.test.pages.PaywallPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.callrecorder.test.extentreports.ExtentTestManager.getTest;
import static com.callrecorder.test.extentreports.ExtentTestManager.startTest;

public class PassPaywallScenario extends BaseTest {

    LandingPage landingPage;
    PaywallPage paywallPage;
    PaymentPage paymentPage;
    LoginPage loginPage;

    @Test(enabled = true, description = "PAYWALL PASS SCENARIO")
     public void passPaywallScenario(Method method) {
        startTest(method.getName(), "PAYWALL PASS SCENARIO");
        landingPage = new LandingPage();
        paywallPage = new PaywallPage();
        paymentPage = new PaymentPage();
        loginPage = new LoginPage();

        String password = "Ayse!234";
        String successfulText ="Your purchase was successful.";

        landingPage.click_LandingPage_LetsStartButton();
        getTest().info("kullanıcı \"Let's Start\" butonuna basar.");

        paywallPage.clickPWMainWeeklyButton();
        getTest().info("kullanıcı \"Weekly\" subscribtion seçeneğini seçer.");

        paywallPage.clickPWMainContinueButton();
        getTest().info("kullanıcı Paywall ekranında \"Continue\" butonuna basar.");

        paymentPage.clickPaymentPageSubscribeButton();
        getTest().info("kullanıcı Payment Ekranında \"Subscribe\" butonuna basar.");

        paymentPage.textBoxPaymentPagePasswordFilling(password);
        getTest().info("kullanıcı Paywall ekranında \"Password\" yazar.");

        paymentPage.clickPaymentPageSingInButton();
        getTest().info("kullanıcı Payment Ekranında \"Sign In\" butonuna basar.");

        paymentPage.verifyPaymentPagePasswordText(successfulText);
        getTest().info("kullanıcı Payment Ekranında \"You're all set\" pop up textini doğruluyor.");

        paymentPage.clickPaymentPageSuccesfulOKButton();
        getTest().info("kullanıcı Payment Ekranında \"You're all set\" pop up'ta OK butonuna basar.");

        loginPage.verifyLoginTitle();
        getTest().info("Kullanıcı başlık alanında \"Verify your phone number\" yazdığını doğrular");

    }









}
