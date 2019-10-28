package com.sogeti.test;

import org.apache.xml.serializer.utils.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import config.Test1Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumUtils;

/**
 * General Test
 *
 */
public class Test1 {

		
	 public Test1(AppiumDriver driver, Test1Options test1, ExtentReports extentreports, ExtentTest extendedtest) {
		 try {
			 extendedtest = extentreports.startTest("Init data");
			 extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			 extendedtest.log(LogStatus.INFO, "Application is up and running");
			 MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(test1.menuButtonPath);
				el1.click();
				extendedtest.log(LogStatus.PASS, "Menú clicked");
				MobileElement el2 = (MobileElement) driver.findElementByXPath(test1.initDataPath);
				el2.click();
				extendedtest.log(LogStatus.PASS, "Data initialized");
				MobileElement el3 = (MobileElement) driver.findElementById(test1.showListPath);
				el3.click();
				extendedtest.log(LogStatus.PASS, "Shows list is accessible");
				extendedtest.log(LogStatus.INFO, "Test1 finalized, driver is closed");
		} catch (Exception e) {
			new AppiumUtils().takeScreenshot(driver);
			extendedtest.log(LogStatus.FAIL, e);
		}catch (AssertionError e) {
			new AppiumUtils().takeScreenshot(driver);
			extendedtest.log(LogStatus.FAIL, e);
		}
		
	}

}
