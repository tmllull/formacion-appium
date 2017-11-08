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
	WebDriverWait wait;
	
	public Test4(AppiumDriver driver, allTests.Test4Options test42) throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById(test42.showListPath);
		el1.click();
		//MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowPath);
		//el2.click();
		
		//TRICK
		MobileElement el2 = (MobileElement) driver.findElementByXPath(test42.selectedShowTrickPath);
		el2.click();
		
		//MobileElement el3 = (MobileElement) driver.findElementByXPath(test4.selectedDatePath);
		//el3.click();
		
		//TRICK
		MobileElement el3 = (MobileElement) driver.findElementByXPath(test42.selectedDateTrickPath);
		el3.click();
		
		Thread.sleep(200);
		
		(new TouchAction(driver))
		  .press(523,1038)
		  .moveTo(-3, -474)
		  .release()
		  .perform();
		
		//TRICK
		/*
		 * driver.scrollTo("Seleccionar butacas");
		 */
		
		MobileElement el4 = (MobileElement) driver.findElementById(test42.selectPlacesPath);
		el4.click();
		test42.selectPlaces(driver, test42.places);
		MobileElement el5 = (MobileElement) driver.findElementById(test42.buyPath);
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById(test42.noDiscountPath);
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById(test42.mailPath);
		el7.sendKeys(test42.mail);
		driver.navigate().back();
		MobileElement el8 = (MobileElement) driver.findElementById(test42.namePath);
		el8.sendKeys(test42.name);
		driver.navigate().back();
		MobileElement el9 = (MobileElement) driver.findElementById(test42.lastNamePath);
		el9.sendKeys(test42.lastname);
		driver.navigate().back(); 
		MobileElement el10 = (MobileElement) driver.findElementById(test42.confirmPath);
		el10.click();
	}

}
