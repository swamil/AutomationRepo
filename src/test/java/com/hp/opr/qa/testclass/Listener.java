package com.hp.opr.qa.testclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listenerpullreq implements ITestListener {

   WebDriver fd;
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "Test has started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "Test has successfully Tested");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "Test has failed");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        File file=(File)((TakesScreenshot)fd).getScreenshotAs(OutputType.FILE);
        System.out.println(iTestResult.getName() + "Test has skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println(iTestContext.getName() + "Test Script Execution has started");
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println(iTestContext.getName() + "Test Script Execution completed");
    }
}
