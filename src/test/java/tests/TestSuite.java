package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import config.ConfigOptions;
import config.Test1Options;
import config.Test2Options;
import config.Test3Options;
import config.Test4Options;
import config.Test5Options;
import config.Test6Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	String date = "mar., 29/10/2019";
	String filterDay = "lu.";
	String show = "EL REY LEON";
	Test1Options test1 = new Test1Options();
	Test2Options test2 = new Test2Options();
	Test3Options test3 = new Test3Options("NUEVA OBRA","Test","25","60","23 octubre 2019","31 octubre 2019");
	Test4Options test4 = new Test4Options(date,show);
	Test5Options test5 = new Test5Options(date,show);
	Test6Options test6 = new Test6Options(filterDay,show);
	WebDriverWait wait;
	static ExtentReports extentreports;
	static ExtentTest extendedtest;

	@BeforeClass
	public static void createReport() {
		extentreports = new ExtentReports(
				System.getProperty("user.dir") + "/reports/Report_teatre_Mallorca"+new Date().getTime()+".html", false);
		extentreports.addSystemInfo("HostName", "Appium Demo");
		extentreports.addSystemInfo("Enviroment", "QA");
		extentreports.addSystemInfo("User Name", "Remote Center");
		extentreports.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
			}
	
	@Before
	public void openTest() throws InterruptedException {

		DesiredCapabilities capabilities = options.setCapabilities();

		try {
			driver = new AndroidDriver(new URL(options.getLocalUrl()), capabilities);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 40);
		} catch (MalformedURLException e) {
			System.out.println(options.getLocalUrl() + " IS NOT A VALID URL");
		}
	}

	@Test
	@Order(1)
	public void Test1() throws Exception {
		Test1 test = new Test1(driver, test1, extentreports, extendedtest);

	}

	@Test
	@Order(2)
	public void Test2() throws Exception {
		Test2 test = new Test2(driver, test2, extentreports, extendedtest);

	}

	@Test
	@Order(3)
	public void Test3() throws Exception {
		Test3 test = new Test3(driver, test3, extentreports, extendedtest);

	}

	@Test
	@Order(4)
	public void Test4() throws Exception {
		Test4 test = new Test4(driver, test4, extentreports, extendedtest);

	}

	@Test
	@Order(5)
	public void Test5() throws Exception {
		Test5 test = new Test5(driver, test5, extentreports, extendedtest);

	}

	@Test
	@Order(6)
	public void Test6() throws Exception {
		Test6 test = new Test6(driver, test6, extentreports, extendedtest);

	}

	@After
	public void closeTest() {
		driver.closeApp();
	}
	
	@AfterClass
	public static  void clean() {
		extentreports.endTest(extendedtest);
		extentreports.flush();

	}

}
