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
		Test1 test = new Test1(driver, test1);
		
		
	}
	
	@Test
	public void Test2() {
		Test2 test = new Test2(driver, test2);
		
	}
	
	@Test
	public void Test3() {
		Test3 test = new Test3(driver, test3);
		
		
	}
	
	@Test
	public void Test4() throws InterruptedException {
		Test4 test = new Test4(driver, test4);
		
		
	}
	
	@Test
	public void Test5() throws InterruptedException {
		Test5 test = new Test5(driver, test5);
		
		
	}
	
	@Test
	public void Test6() {
		Test6 test = new Test6(driver, test6);
		
		
	}
	
	@After
	public void closeTest() {
		driver.quit();
	}
	
	
	

}
