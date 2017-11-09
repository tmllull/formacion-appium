package allTests;

import static org.junit.Assert.*;

import org.junit.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * General Test
 *
 */
public class Test5 {

	@SuppressWarnings("deprecation")
	public Test5(AppiumDriver driver, allTests.Test5Options test5, ExtentReports extentreports, ExtentTest extendedtest)
			throws InterruptedException {
		try {
			extendedtest = extentreports.startTest("Compare prices");
			extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			extendedtest.log(LogStatus.INFO, "Application is up and running");
			MobileElement el1 = (MobileElement) driver.findElementById(test5.showListPath);
			el1.click();
			extendedtest.log(LogStatus.PASS, "Shows list");
			// TRICK
			MobileElement el2 = (MobileElement) driver.findElementByXPath(test5.selectedShowTrickPath);
			el2.click();
			extendedtest.log(LogStatus.PASS, "Show selected");
			// TRICK
			MobileElement el3 = (MobileElement) driver.findElementByXPath(test5.selectedDateTrickPath);
			el3.click();
			extendedtest.log(LogStatus.PASS, "Date selected");
			Thread.sleep(200);

			/*
			 * (new TouchAction(driver)) .press(523,1038) .moveTo(-3, -474) .release()
			 * .perform();
			 */

			driver.scrollTo("Seleccionar butacas");

			MobileElement el20 = (MobileElement) driver.findElementById(test5.pricePath);
			String priceString = el20.getText();
			String[] priceSplit = priceString.split("€");
			Integer price = Integer.valueOf(priceSplit[0]);
			extendedtest.log(LogStatus.PASS, "The show price is: " + price);

			MobileElement el4 = (MobileElement) driver.findElementById(test5.selectPlacesPath);
			el4.click();
			extendedtest.log(LogStatus.PASS, "Start selecting places");

			Integer[] places = new Integer[] { 2, 8, 12, 35, 34 };
			Integer partialPrice = price * places.length;
			test5.selectPlaces(driver, places);
			extendedtest.log(LogStatus.PASS, "Places selected: " + places.toString());
			MobileElement el5 = (MobileElement) driver.findElementById(test5.buyPath);
			el5.click();
			extendedtest.log(LogStatus.PASS, "Continue buying");
			MobileElement el6 = (MobileElement) driver.findElementById(test5.noDiscountPath);
			el6.click();
			extendedtest.log(LogStatus.PASS, "No discount");
			MobileElement el17 = (MobileElement) driver.findElementById(test5.totalPricePath);
			String totalPriceString = el17.getText();
			String[] totalPriceSplit = totalPriceString.split("€");
			totalPriceSplit = totalPriceString.split(",");
			Integer totalPrice = Integer.valueOf(totalPriceSplit[0]);
			extendedtest.log(LogStatus.PASS, "Total price is " + totalPrice);

			assertEquals(partialPrice, totalPrice);
			extendedtest.log(LogStatus.PASS, "Price coincident");
			extendedtest.log(LogStatus.INFO, "Test finalized, driver is closed");

		} catch (Exception e) {
			extendedtest.log(LogStatus.FAIL, e);
		} catch (AssertionError e) {
			extendedtest.log(LogStatus.FAIL, e);
		}
	}

}
