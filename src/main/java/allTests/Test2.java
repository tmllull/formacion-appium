package allTests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * General Test
 *
 */
public class Test2 {

	public Test2(AppiumDriver driver, allTests.Test2Options test2, ExtentReports extentreports,
			ExtentTest extendedtest) {
		try {
			extendedtest = extentreports.startTest("Select show");
			 extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			 extendedtest.log(LogStatus.INFO, "Application is up and running");
			MobileElement el1 = (MobileElement) driver.findElementById(test2.showListPath);
			el1.click();
			extendedtest.log(LogStatus.PASS, "Shows list");
			// TRICK
			MobileElement el2 = (MobileElement) driver.findElementByXPath(test2.selectedShowTrickPath);
			el2.click();
			extendedtest.log(LogStatus.PASS, "Show selected correctly");

			MobileElement el3 = (MobileElement) driver.findElementByXPath(test2.firstDatePath);
			el3.click();
			extendedtest.log(LogStatus.PASS, "Selected date and show info");
			extendedtest.log(LogStatus.INFO, "Test2 finalized, driver is closed");
		} catch (Exception e) {
			extendedtest.log(LogStatus.FAIL, e);
		}catch (AssertionError e) {
			extendedtest.log(LogStatus.FAIL, e);
		}
	}
}
