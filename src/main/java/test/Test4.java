package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test4Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test4 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test4Options test4 = new Test4Options();
	Utils utils = new Utils();
	WebDriverWait wait;
	// HashMap<String, Integer> games = new HashMap<String, Integer>();

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
		MobileElement el1 = (MobileElement) driver.findElementById(test4.showListPath);
		el1.click();
		//MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowPath);
		//el2.click();
		
		//TRICK
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowTrickPath);
		el2.click();
		
		//MobileElement el3 = (MobileElement) driver.findElementByXPath(test4.selectedDatePath);
		//el3.click();
		
		//TRICK
		MobileElement el3 = (MobileElement) driver.findElementByXPath(test4.selectedDateTrickPath);
		el3.click();
		
		(new TouchAction(driver))
		  .press(523,1038)
		  .moveTo(-3, -474)
		  .release()
		  .perform();
		
		MobileElement el4 = (MobileElement) driver.findElementById(test4.selectPlacesPath);
		el4.click();
		
		MobileElement el5 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button1");
		el5.click();
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
