package solutions;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import solutions.Test5Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test5 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test5Options test5 = new Test5Options();
	WebDriverWait wait;

	@Before
	public void openTest() throws InterruptedException {

		DesiredCapabilities capabilities = options.setCapabilities();

		try {
			driver = new AndroidDriver(new URL(options.getLocalUrl()), capabilities);
			wait = new WebDriverWait(driver, 20);
		} catch (MalformedURLException e) {
			System.out.println(options.getLocalUrl() + " IS NOT A VALID URL");
		}
	}

	@Test
	public void test() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById(test5.showListPath);
		el1.click();
		//MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowPath);
		//el2.click();
		
		//TRICK
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test5.selectedShowTrickPath);
		el2.click();
		
		//MobileElement el3 = (MobileElement) driver.findElementByXPath(test4.selectedDatePath);
		//el3.click();
		
		//TRICK
		MobileElement el3 = (MobileElement) driver.findElementByXPath(test5.selectedDateTrickPath);
		el3.click();
		
		Thread.sleep(200);
		
		(new TouchAction(driver))
		  .press(523,1038)
		  .moveTo(-3, -474)
		  .release()
		  .perform();
		
		MobileElement el20 = (MobileElement) driver.findElementById(test5.pricePath);
		String priceString = el20.getText();
		String[] priceSplit = priceString.split("€");
		Integer price = Integer.valueOf(priceSplit[0]);
		
		
		MobileElement el4 = (MobileElement) driver.findElementById(test5.selectPlacesPath);
		el4.click();
		
		Integer[] places = new Integer[] {1,8,22,32,34};
		Integer partialPrice = price*places.length;
		test5.selectPlaces(driver, places);
		MobileElement el5 = (MobileElement) driver.findElementById(test5.buyPath);
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById(test5.noDiscountPath);
		el6.click();
		
		MobileElement el17 = (MobileElement) driver.findElementById(test5.totalPricePath);
		String totalPriceString = el17.getText();
		String[] totalPriceSplit = totalPriceString.split("€");
		totalPriceSplit = totalPriceString.split(",");
		Integer totalPrice = Integer.valueOf(totalPriceSplit[0]);
		assertEquals(partialPrice, totalPrice);
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
