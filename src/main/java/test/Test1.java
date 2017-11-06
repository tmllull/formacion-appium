package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test1Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test1 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test1Options test1 = new Test1Options();
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

	//Click on menu bar, initialize data and list shows
	@Test
	public void test() throws InterruptedException {
		
	}

	@After
	public void closeTest() throws InterruptedException {
		
	}
}
