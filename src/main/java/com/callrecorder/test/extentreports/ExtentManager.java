package com.callrecorder.test.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Call Blocker Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Test Environment", "Call Blocker");
        extentReports.setSystemInfo("Automation Tester", "Osman Türker");
        return extentReports;
    }



}
