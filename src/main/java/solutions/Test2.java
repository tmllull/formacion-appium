package solutions;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import solutions.Test2Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test2 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test2Options test2 = new Test2Options();
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
		MobileElement el1 = (MobileElement) driver.findElementById(test2.showListPath);
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test2.selectedShowPath);
		el2.click();
		
		//TRICK
		//MobileElement el2 = (MobileElement) driver.findElementByXPath(test2.selectedShowTrick);
		//el2.click();
		
		MobileElement el3 = (MobileElement) driver.findElementByXPath(test2.selectedDatePath);
		el3.click();

	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
