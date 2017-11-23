package solutions;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import solutions.Test6Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test6 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test6Options test6 = new Test6Options();
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
		MobileElement el1 = (MobileElement) driver.findElementById(test6.showListPath);
		el1.click();
		//MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowPath);
		//el2.click();
		
		//TRICK
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test6.selectedShowTrickPath);
		el2.click();
		
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId(test6.filter);
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath(test6.dateFilter);
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath(test6.filterDays.get(test6.filterDay));
		el5.click();
		
		List<WebElement> dates = driver.findElementById(test6.listViewDate).findElements(By.className(test6.textDate));
		int counter = 0;
		for(int i=0;i<dates.size();i+=3) {
			String temp = dates.get(i).getText();
			String [] day = temp.split(",");
			if(day[0].equals(test6.filterDay)) {
				counter++;
			}
		}
		assertEquals(dates.size()/3,counter);
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
