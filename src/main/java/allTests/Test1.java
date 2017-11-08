package allTests;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import allTests.Test1Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test1 {

		
	 public Test1(AppiumDriver driver, Test1Options test1) {
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(test1.menuButtonPath);
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test1.initDataPath);
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById(test1.showListPath);
		el3.click();
	}

}
