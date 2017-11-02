package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test7Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test7 
{
	
	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test7Options test7 = new Test7Options();
	Utils utils = new Utils();
	private String orig_context;
	WebDriverWait wait;

	@Before
	public void openTest() throws InterruptedException {
		DesiredCapabilities capabilities = options.setCapabilities();

		try {
			driver = new AndroidDriver(new URL(options.getLocalUrl()), capabilities);
			// System.out.println("WIDTH: "+width+" HEIGHT: "+height);
			wait = new WebDriverWait(driver, 50);
			// Thread.sleep(10000);

			Set<String> availableContexts = driver.getContextHandles();
			// System.out.println("Total No of Context Found Before reaching WebView = "+
			// availableContexts1.size());
			System.out.println("Context options on load: " + availableContexts);
			for (String context : availableContexts) {
				if (context.contains("WEBVIEW")) {
					orig_context = context;
					driver.context(context);
					// orig_context = "WEBVIEW_R";
					// driver.context(orig_context);
					break;
				}
			}
			System.out.println("changed to webview");

		} catch (MalformedURLException e) {
			System.out.println(options.getLocalUrl() + " IS NOT A VALID URL");
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
		
			
			//ROOT MOBILES
		utils.rootDevices(driver);
			
			utils.waitXpath(driver, wait, test7.loginPath);
			WebElement login = driver.findElementByXPath(test7.loginPath);
			System.out.println("Login");
			login.click();
			utils.waitXpath(driver, wait, test7.userPath);
			WebElement userfield = driver.findElementByXPath(test7.userPath);
			System.out.println("Send user");
			userfield.clear();
			userfield.sendKeys(test7.username);
			utils.waitXpath(driver, wait, test7.passPath);
			WebElement passfield = driver.findElementByXPath(test7.passPath);
			System.out.println("Send pass");
			passfield.clear();
			passfield.sendKeys(test7.pass);
			utils.waitXpath(driver, wait, test7.loginPath2);
			WebElement login2 = driver.findElementByXPath(test7.loginPath2);
			login2.click();
			System.out.println("Loging in...");
			Thread.sleep(5000);
			System.out.println("Wait for game...");
			utils.waitXpath(driver, wait, test7.gamePath);
			WebElement game = driver.findElementByXPath(test7.gamePath);
			utils.clickElement(driver, game,options.games.get(test7.gameName), orig_context);
			game.click();
			System.out.println("Step by step...");
			WebElement stepbystep = driver.findElementByXPath(test7.stepByStepPath);
			stepbystep.click();
			System.out.println("Multiple...");
			Thread.sleep(2000);
			WebElement multiple = driver.findElementByXPath(test7.multiplePath);
			multiple.click();
			org.openqa.selenium.support.ui.Select multipleSelect = new org.openqa.selenium.support.ui.Select(driver.findElementByXPath(test7.selectMultiplePath));
			multipleSelect.selectByVisibleText("Multiple 28");
			WebElement random = driver.findElementByXPath(test7.randomPath);
			random.click();
			WebElement totalPrice = driver.findElementByXPath(test7.totalPricePath);
			String price = totalPrice.getText();
			WebElement continueButton = driver.findElementByXPath(test7.continueButtonPath);
			continueButton.click();
			Thread.sleep(3000);
			boolean fail = false;
			for (int i = 1; i <= 8; ++i) {
				try {
					WebElement element = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/primitiva-bet-drv/div/ul/li["+i+"]");
				} catch (NoSuchElementException e) {
					fail = true;
					// TODO: handle exception
				}
			}
			assertEquals(false, fail);
			WebElement finalPrice = driver.findElementByXPath(test7.finalPricePath);
			String priceFinal = finalPrice.getText();
			System.out.println(totalPrice);
			System.out.println(priceFinal);
			
			Thread.sleep(2000);		
	}
	
	
	@After
	public void closeTest() throws InterruptedException{
		//Thread.sleep(5000);
		//driver.quit();
	}
		
}
