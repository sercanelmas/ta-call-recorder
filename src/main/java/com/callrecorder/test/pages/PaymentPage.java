package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PaymentPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(PaymentPage.class);

    private static final By BTN_PAYMENTPAGE_SUBSCRIBE = By.xpath("//XCUIElementTypeButton[@name=\"Subscribe\"]");
    private static final By TXTBOX_PAYMENTPAGE_PASSWORD = By.className("XCUIElementTypeSecureTextField");
    private static final By BTN_PAYMENTAPGE_SIGNIN = By.xpath("//XCUIElementTypeButton[@name=\"Sign In\"]");
    private static final By TXT_PAYMENTPAGE_SUCCESSFUL= By.name("Your purchase was successful.");
    private static final By BTN_PAYMENTPAGE_SUCCESSFULOK = By.name("OK");

    public void clickPaymentPageSubscribeButton() {
        LOGGER.info("kullanıcı Payment Ekranında \"Subscribe\" butonuna basar.");
        clickElement(BTN_PAYMENTPAGE_SUBSCRIBE);

    }

    public PaymentPage textBoxPaymentPagePasswordFilling(String expectedText) {
        LOGGER.info("kullanıcı Payment Ekranında \"Password\" alanına şifre girişi yapar.");

        setTextElement(TXTBOX_PAYMENTPAGE_PASSWORD, expectedText);

        return this;
    }

    public void clickPaymentPageSingInButton(){
        LOGGER.info("kullanıcı Payment Ekranında \"Sign In\" butonuna basar.");
        clickElement(BTN_PAYMENTAPGE_SIGNIN);

    }

    public PaymentPage verifyPaymentPagePasswordText (String expectedText){
        LOGGER.info("kullanıcı Payment Ekranında \"You're all set\" pop up textini doğruluyor.");

        getTextElement(TXT_PAYMENTPAGE_SUCCESSFUL);


        return this;
    }

    public void clickPaymentPageSuccesfulOKButton(){
        LOGGER.info("kullanıcı Payment Ekranında \"You're all set\" pop up'ta OK butonuna basar.");
        clickElement(BTN_PAYMENTPAGE_SUCCESSFULOK);
    }

    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }

}
