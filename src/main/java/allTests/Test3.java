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
public class Test3 {

	
	
	public Test3(AppiumDriver driver, allTests.Test3Options test3) {
		
		MobileElement el1 = (MobileElement) driver.findElementById(test3.newShowPath);
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById(test3.titlePath);
		el2.sendKeys(test3.title);
		MobileElement el3 = (MobileElement) driver.findElementById(test3.descriptionPath);
		el3.sendKeys(test3.resume);
		MobileElement el4 = (MobileElement) driver.findElementById(test3.durationPath);
		el4.sendKeys(test3.duration);
		MobileElement el5 = (MobileElement) driver.findElementById(test3.pricePath);
		el5.sendKeys(test3.price);
		
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

}
