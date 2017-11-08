package reports;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import domain.ConfigOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import solutions.Test1Options;

public class report {

	static AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test1Options test1 = new Test1Options();
	WebDriverWait wait;

	static ExtentReports extentreports;
	static ExtentTest test;

	@BeforeClass
	public static void createReport() {
		extentreports = new ExtentReports(
				System.getProperty("user.dir") + "/test-output/ICP_TestExecution/ICP_Create_Data_Test.html", true);
		extentreports.addSystemInfo("HostName", "Ivan");
		extentreports.addSystemInfo("Enviroment", "QA");
		extentreports.addSystemInfo("User Name", "Ivan Tosso");
		// extentreports.loadConfig(configFile);
		extentreports.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));

	}
	
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
	public void test() {
		try {
			
			test = extentreports.startTest("Open App");
			test.log(LogStatus.INFO, "Driver is up and running " + driver);
			test.log(LogStatus.INFO, "Application is up and running");

			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(test1.menuButtonPath);
			el1.click();
			test.log(LogStatus.PASS, "Menú clicked");
			MobileElement el2 = (MobileElement) driver.findElementByXPath(test1.initDataPath);
			el2.click();
			test.log(LogStatus.PASS, "Data initialized");
			MobileElement el3 = (MobileElement) driver.findElementById(test1.showListPath);
			el3.click();
			test.log(LogStatus.PASS, "Shows list is accessible");

			// test creation
			//test = extentreports.startTest("New Role");
			

			/*test.log(LogStatus.PASS, "Assert Pass as condition is True", "Sending correct email: " + "email"
					+ "\n and using correct password and mandator is possible to do a Login");
			String image = test.addScreenCapture("path" + "loginPossible.png");
			test.log(LogStatus.PASS, "Assert Pass as condition is True", image);

			// test creation
			test = extentreports.startTest("Try to write data in management Vehicle Vehicle search textbox");
			test.log(LogStatus.INFO, "Driver is up and running" + driver);
			test.log(LogStatus.INFO, "Application is up and running");*/

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e);
		}
	}

	@AfterClass
	public static void clean() {
		test.log(LogStatus.INFO, "Execution finalized, driver " + driver + " is closed");
		extentreports.endTest(test);
		extentreports.flush();
		driver.quit();

	}

}
