package com.callrecorder.test.LoginPage;

import com.callrecorder.test.base.BaseTest;
import com.callrecorder.test.pages.LoginPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.callrecorder.test.extentreports.ExtentTestManager.getTest;
import static com.callrecorder.test.extentreports.ExtentTestManager.startTest;

public class C6_LoginValidPhoneNumber extends BaseTest {


    LoginPage loginpage;
    String ValidNumber = "5069373645";

    @Test(enabled = true, description = "c6_LoginValidPhoneNumber")
    public void c6_LoginValidPhoneNumber(Method method) throws InterruptedException {
        startTest(method.getName(), "C216 HomePage-Overwiew SENARYOSU");

        loginpage = new LoginPage();

        loginpage.clickLoginNowButton();
        getTest().info("Kullanıcı login ekranında \"LOGIN NOW\" butonuna basar");

        loginpage.setTxtLoginPhoneNumber(ValidNumber);
        getTest().info("Kullanıcı \"phone number\" alanına telefon numarasını girer");

        loginpage.clickLoginNextButton();
        getTest().info("Kullanıcı login ekranında \"Next\" butonuna basar");

        loginpage.clickAppleKeyAutoComplete();
        getTest().info("Kullanıcı verify ekranında, apple klavyesinden önerilen \"autocomplete\" 'e tıklar ");

        loginpage.clickVerifyNextButton();
        getTest().info("Kullanıcı verify ekranında \"NEXT\" butonuna basar");


    }
}
