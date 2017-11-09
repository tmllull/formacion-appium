package allTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import domain.ConfigOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class GeneralTest {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test1Options test1 = new Test1Options();
	Test2Options test2 = new Test2Options();
	Test3Options test3 = new Test3Options();
	Test4Options test4 = new Test4Options();
	Test5Options test5 = new Test5Options();
	Test6Options test6 = new Test6Options();
	WebDriverWait wait;
	static ExtentReports extentreports;
	static ExtentTest extendedtest;

	@BeforeClass
	public static void createReport() {
		extentreports = new ExtentReports(
				System.getProperty("user.dir") + "/reports/Teatre_Mallorca.html", false);
		extentreports.addSystemInfo("HostName", "CursoAppium");
		extentreports.addSystemInfo("Enviroment", "QA");
		extentreports.addSystemInfo("User Name", "Juan y Toni");
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
	public void Test1() {
		Test1 test = new Test1(driver, test1, extentreports, extendedtest);

	}

	@Test
	public void Test2() {
		Test2 test = new Test2(driver, test2, extentreports, extendedtest);

	}

	@Test
	public void Test3() {
		Test3 test = new Test3(driver, test3, extentreports, extendedtest);

	}

	@Test
	public void Test4() throws InterruptedException {
		Test4 test = new Test4(driver, test4, extentreports, extendedtest);

	}

	@Test
	public void Test5() throws InterruptedException {
		Test5 test = new Test5(driver, test5, extentreports, extendedtest);

	}

	@Test
	public void Test6() {
		Test6 test = new Test6(driver, test6, extentreports, extendedtest);

	}

	@After
	public void closeTest() {
		driver.quit();
	}
	
	@AfterClass
	public static  void clean() {
		extentreports.endTest(extendedtest);
		extentreports.flush();
		//driver.quit();

	}

}
