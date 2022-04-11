package com.callrecorder.test.pages;

import com.callrecorder.test.base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LandingPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(LandingPage.class);

    private static final By BTN_LETSSTART = By.xpath("//XCUIElementTypeButton[@name=\"LET’S START\"]");


    public void click_LandingPage_LetsStartButton() {
        LOGGER.info("kullanıcı \"Let's Start\" butonuna basar.");
        clickElement(BTN_LETSSTART);


    }

    public boolean isDisplayed_LetsStartPage_LetsstartButton(){
        LOGGER.info("kullanıcı ekranda \"Let's Start\" butonunu gördüğünü ve Landing Page ' olduğunu doğruluyor.");

        return isDisplayElement(BTN_LETSSTART);
    }

    @Override
    public void errorMessage(String scenarioName, String message) {
        LOGGER.error(message);
        super.errorMessage(scenarioName, message);
    }




}
