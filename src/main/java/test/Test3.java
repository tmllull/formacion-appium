package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test3Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test3 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test3Options test3 = new Test3Options();
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
	public void test() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById(test3.newShowPath);
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById(test3.titlePath);
		el2.sendKeys("Alatriste");
		MobileElement el3 = (MobileElement) driver.findElementById(test3.descriptionPath);
		el3.sendKeys("Historias para no dormir");
		MobileElement el4 = (MobileElement) driver.findElementById(test3.durationPath);
		el4.sendKeys("120");
		MobileElement el5 = (MobileElement) driver.findElementById(test3.pricePath);
		el5.sendKeys("25");
		
		//TRICK1 for recorded process
		driver.navigate().back();
		//TRICK2 for recorded process
		/*(new TouchAction(driver))
		  .press(523,1038)
		  .moveTo(-3, -474)
		  .release()
		  .perform();*/
		  

		MobileElement el6 = (MobileElement) driver.findElementById(test3.selectDatesPath);
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById(test3.dataStartPath);
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId(test3.dayStartPath);
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementById(test3.acceptStartPath);
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById(test3.dataFinishPath);
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId(test3.dayFinishStart);
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementById(test3.acceptFinishPath);
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementById(test3.monPath);
		el13.click();
		MobileElement el14 = (MobileElement) driver.findElementById(test3.thuPath);
		el14.click();
		MobileElement el15 = (MobileElement) driver.findElementById(test3.satPath);
		el15.click();
		MobileElement el16 = (MobileElement) driver.findElementById(test3.sunPath);
		el16.click();
		MobileElement el17 = (MobileElement) driver.findElementById(test3.saveButtonPath);
		el17.click();


	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
