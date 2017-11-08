package allTests;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import domain.ConfigOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * General Test
 *
 */
public class Test4 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test4Options test4 = new Test4Options();
	WebDriverWait wait;
	
	public Test4(AppiumDriver driver, allTests.Test4Options test4, ExtentReports extentreports, ExtentTest extendedtest) throws InterruptedException {
		try {
			extendedtest = extentreports.startTest("Buy tickets");
			 extendedtest.log(LogStatus.INFO, "Driver is up and running " + driver);
			 extendedtest.log(LogStatus.INFO, "Application is up and running");
			MobileElement el1 = (MobileElement) driver.findElementById(test4.showListPath);
			el1.click();
			extendedtest.log(LogStatus.PASS, "Shows list");
			
			//TRICK
			MobileElement el2 = (MobileElement) driver.findElementByXPath(test4.selectedShowTrickPath);
			el2.click();
			extendedtest.log(LogStatus.PASS, "Show selected");
			
			//TRICK
			MobileElement el3 = (MobileElement) driver.findElementByXPath(test4.selectedDateTrickPath);
			el3.click();
			extendedtest.log(LogStatus.PASS, "Date selected");
			
			Thread.sleep(200);
			//TRICK
			driver.scrollTo("Seleccionar butacas");
			
			MobileElement el4 = (MobileElement) driver.findElementById(test4.selectPlacesPath);
			el4.click();
			extendedtest.log(LogStatus.PASS, "Start selecting places");
			test4.selectPlaces(driver, test4.places);
			extendedtest.log(LogStatus.PASS, "Places selected: "+test4.places.toString());
			MobileElement el5 = (MobileElement) driver.findElementById(test4.buyPath);
			el5.click();
			extendedtest.log(LogStatus.PASS, "Proceed to buy");
			MobileElement el6 = (MobileElement) driver.findElementById(test4.noDiscountPath);
			el6.click();
			extendedtest.log(LogStatus.PASS, "No discount selected");
			MobileElement el7 = (MobileElement) driver.findElementById(test4.mailPath);
			el7.sendKeys(test4.mail);
			extendedtest.log(LogStatus.PASS, "Mail sended");
			driver.navigate().back();
			MobileElement el8 = (MobileElement) driver.findElementById(test4.namePath);
			el8.sendKeys(test4.name);
			extendedtest.log(LogStatus.PASS, "Name sended");
			driver.navigate().back();
			MobileElement el9 = (MobileElement) driver.findElementById(test4.lastNamePath);
			el9.sendKeys(test4.lastname);
			extendedtest.log(LogStatus.PASS, "Lastname sended");
			driver.navigate().back(); 
			MobileElement el10 = (MobileElement) driver.findElementById(test4.confirmPath);
			el10.click();
			extendedtest.log(LogStatus.PASS, "Buy completed");
		} catch (Exception e) {
			extendedtest.log(LogStatus.FAIL, e);		}
		
	}

}
