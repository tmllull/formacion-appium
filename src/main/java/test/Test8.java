package test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test8Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test8 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test8Options test8 = new Test8Options();
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

		// ROOT MOBILES
		utils.rootDevices(driver);

		utils.waitXpath(driver, wait, test8.loginPath);
		WebElement login = driver.findElementByXPath(test8.loginPath);
		System.out.println("Login");
		login.click();
		utils.waitXpath(driver, wait, test8.userPath);
		WebElement userfield = driver.findElementByXPath(test8.userPath);
		System.out.println("Send user");
		userfield.clear();
		userfield.sendKeys(test8.username);
		utils.waitXpath(driver, wait, test8.passPath);
		WebElement passfield = driver.findElementByXPath(test8.passPath);
		System.out.println("Send pass");
		passfield.clear();
		passfield.sendKeys(test8.pass);
		utils.waitXpath(driver, wait, test8.loginPath2);
		WebElement login2 = driver.findElementByXPath(test8.loginPath2);
		login2.click();
		System.out.println("Loging in...");
		Thread.sleep(5000);
		System.out.println("Wait for game...");
		utils.waitXpath(driver, wait, test8.gamePath);
		WebElement game = driver.findElementByXPath(test8.gamePath);
		utils.clickElement(driver, game, options.games.get(test8.gameName), orig_context);
		game.click();
		System.out.println("Step by step...");
		WebElement stepbystep = driver.findElementByXPath(test8.stepByStepPath);
		stepbystep.click();
		System.out.println("Multiple...");
		Thread.sleep(2000);
		WebElement multiple = driver.findElementByXPath(test8.multiplePath);
		multiple.click();
		org.openqa.selenium.support.ui.Select multipleSelect = new org.openqa.selenium.support.ui.Select(
				driver.findElementByXPath(test8.selectMultiplePath));
		multipleSelect.selectByVisibleText("Multiple 28");
		WebElement yourCombo = driver.findElementByXPath(test8.yourComboPath);
		yourCombo.click();
		Thread.sleep(3000);
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		test8.clickNumbers(driver, numbers);
		WebElement continueButton = driver.findElementByXPath(test8.continueButtonPath);
		continueButton.click();
		Thread.sleep(3000);
		System.out.println("Starting check numbers...");
		Integer[] checkNumbers = new Integer[8];
		for (int i = 0; i < 8; ++i) {
			System.out.println("Get number " + (i + 1));
			checkNumbers[i] = Integer.valueOf(driver.findElementByXPath(
					"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/primitiva-bet-drv/div/ul/li["
							+ (i + 1) + "]")
					.getText());
		}
		for (int i = 0; i < 8; ++i) {
			System.out.println("Selected number: " + numbers[i]);
			System.out.println("Checked number: " + checkNumbers[i]);
		}
		assertEquals(numbers, checkNumbers);

		Thread.sleep(2000);
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}

}
