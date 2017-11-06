package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test5Options;
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
		
	}

	@After
	public void closeTest() throws InterruptedException {
		
	}
}
