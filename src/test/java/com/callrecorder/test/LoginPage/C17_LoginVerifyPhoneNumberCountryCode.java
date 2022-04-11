package com.callrecorder.test.LoginPage;


import com.callrecorder.test.base.BaseTest;
import com.callrecorder.test.pages.LoginPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.callrecorder.test.extentreports.ExtentTestManager.getTest;
import static com.callrecorder.test.extentreports.ExtentTestManager.startTest;

public class C17_LoginVerifyPhoneNumberCountryCode extends BaseTest {



    LoginPage loginpage;

    @Test(enabled = true, description = "C216 HomePage-Overwiew SENARYOSU")
    public void c17_LoginVerifyPhoneNumberCountryCode(Method method) throws InterruptedException {
        startTest(method.getName(), "C216 HomePage-Overwiew SENARYOSU");

        loginpage = new LoginPage();

        loginpage.clickLoginNowButton();
        getTest().info("Kullanıcı login ekranında \"LOGIN NOW\" butonuna basar");

        loginpage.verifyCountryCode();
        getTest().info("Kullanıcı telefon ülke kodunun \"90\" olduğunu doğrular");

        loginpage.clickLoginXButton();
        getTest().info("Kullanıcı login ekranında \"X\" butonuna basar");


    }

}
