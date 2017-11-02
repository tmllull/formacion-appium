package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test1Options;
import domain.Utils;
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
	Utils utils = new Utils();
	private String orig_context;
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
	public void test1() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/fab");
		el1.click();
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
