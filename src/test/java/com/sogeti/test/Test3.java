package com.sogeti.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumUtils;

/**
 * General Test
 *
 */
public class Test3 {

	public Test3(AppiumDriver driver, config.Test3Options test3, ExtentReports extentreports,
			ExtentTest extendedtest) {
		try {
			extendedtest = extentreports.startTest("Add new show");
			extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			extendedtest.log(LogStatus.INFO, "Application is up and running");
			MobileElement el1 = (MobileElement) driver.findElementById(test3.newShowPath);
			el1.click();
			extendedtest.log(LogStatus.PASS, "Shows list");
			MobileElement el2 = (MobileElement) driver.findElementById(test3.titlePath);
			el2.sendKeys(test3.title);
			extendedtest.log(LogStatus.PASS, "Title sended: " + test3.title);
			MobileElement el3 = (MobileElement) driver.findElementById(test3.descriptionPath);
			el3.sendKeys(test3.resume);
			extendedtest.log(LogStatus.PASS, "Description sended: " + test3.resume);
			MobileElement el4 = (MobileElement) driver.findElementById(test3.durationPath);
			el4.sendKeys(test3.duration);
			extendedtest.log(LogStatus.PASS, "Duration sended:" + test3.duration);
			MobileElement el5 = (MobileElement) driver.findElementById(test3.pricePath);
			el5.sendKeys(test3.price);
			extendedtest.log(LogStatus.PASS, "Price sended: " + test3.price);
			// TRICK1 for recorded process
			driver.navigate().back();
			MobileElement el6 = (MobileElement) driver.findElementById(test3.selectDatesPath);
			el6.click();
			// extendedtest.log(LogStatus.PASS, "");
			MobileElement el7 = (MobileElement) driver.findElementById(test3.dataStartPath);
			el7.click();
			MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId(test3.dayStartPath);
			el8.click();
			extendedtest.log(LogStatus.PASS, "Selected init date");
			MobileElement el9 = (MobileElement) driver.findElementById(test3.acceptStartPath);
			el9.click();
			// extendedtest.log(LogStatus.PASS, "");
			MobileElement el10 = (MobileElement) driver.findElementById(test3.dataFinishPath);
			el10.click();
			// extendedtest.log(LogStatus.PASS, "");
			MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId(test3.dayFinishStart);
			el11.click();
			extendedtest.log(LogStatus.PASS, "Selected finish date");
			MobileElement el12 = (MobileElement) driver.findElementById(test3.acceptFinishPath);
			el12.click();
			// extendedtest.log(LogStatus.PASS, "");
			MobileElement el13 = (MobileElement) driver.findElementById(test3.monPath);
			el13.click();
			extendedtest.log(LogStatus.PASS, "Selected Monday");
			MobileElement el14 = (MobileElement) driver.findElementById(test3.thuPath);
			el14.click();
			extendedtest.log(LogStatus.PASS, "Selected Thursday");
			MobileElement el15 = (MobileElement) driver.findElementById(test3.satPath);
			el15.click();
			extendedtest.log(LogStatus.PASS, "Selected Saturday");
			MobileElement el16 = (MobileElement) driver.findElementById(test3.sunPath);
			el16.click();
			extendedtest.log(LogStatus.PASS, "Selected Sunday");
			MobileElement el17 = (MobileElement) driver.findElementById(test3.saveButtonPath);
			el17.click();
			extendedtest.log(LogStatus.PASS, "Changes saved");
			extendedtest.log(LogStatus.INFO, "Test finalized, driver is closed");

		} catch (Exception e) {
			new AppiumUtils().takeScreenshot(driver);
			extendedtest.log(LogStatus.FAIL, e+extendedtest.addScreenCapture(new AppiumUtils().takeScreenshot(driver)));
		} catch (AssertionError e) {
			new AppiumUtils().takeScreenshot(driver);
			extendedtest.log(LogStatus.FAIL,e+extendedtest.addScreenCapture(new AppiumUtils().takeScreenshot(driver)));
		}

	}

}
