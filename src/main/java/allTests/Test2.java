package allTests;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test2 {
	
	 public Test2(AppiumDriver driver, allTests.Test2Options test2) {
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

	

	
}
