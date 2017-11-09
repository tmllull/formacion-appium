package allTests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * General Test
 *
 */
public class Test6 {

	public Test6(AppiumDriver driver, allTests.Test6Options test6, ExtentReports extentreports,
			ExtentTest extendedtest) {
		try {
			extendedtest = extentreports.startTest("Day filter");
			extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			extendedtest.log(LogStatus.INFO, "Application is up and running");
			MobileElement el1 = (MobileElement) driver.findElementById(test6.showListPath);
			el1.click();
			extendedtest.log(LogStatus.PASS, "Shows list");
			// TRICK
			MobileElement el2 = (MobileElement) driver.findElementByXPath(test6.selectedShowTrickPath);
			el2.click();
			extendedtest.log(LogStatus.PASS, "Show selected");
			MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId(test6.filter);
			el3.click();
			extendedtest.log(LogStatus.PASS, "Menu");
			MobileElement el4 = (MobileElement) driver.findElementByXPath(test6.dateFilter);
			el4.click();
			extendedtest.log(LogStatus.PASS, "Day Filter");
			MobileElement el5 = (MobileElement) driver.findElementByXPath(test6.filterDays.get(test6.filterDay));
			el5.click();
			extendedtest.log(LogStatus.PASS, "Selected " + test6.filterDay + " filter");
			List<WebElement> dates = driver.findElementById(test6.listViewDate)
					.findElements(By.className(test6.textDate));
			int counter = 0;
			for (int i = 0; i < dates.size(); i += 3) {
				String temp = dates.get(i).getText();
				String[] day = temp.split(",");
				if (day[0].equals(test6.filterDay)) {
					counter++;
				}
			}
			assertEquals(dates.size() / 3, counter);
			extendedtest.log(LogStatus.PASS, "Days coincidence");
			extendedtest.log(LogStatus.INFO, "Test finalized, driver is closed");

		} catch (Exception e) {
			extendedtest.log(LogStatus.FAIL, e);
		} catch (AssertionError e) {
			extendedtest.log(LogStatus.FAIL, e);
		}

	}

}
