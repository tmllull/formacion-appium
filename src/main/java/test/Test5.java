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
import domain.Test5Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test5 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test5Options test5 = new Test5Options();
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

	@Test
	public void test1() throws InterruptedException {

		// ROOT MOBILES
		WebElement aceptar = driver.findElementByXPath("/html/body/div[2]/div/div[3]/button");
		aceptar.click();
		///////////

		utils.waitXpath(driver, wait, test5.loginPath);
		WebElement login = driver.findElementByXPath(test5.loginPath);
		System.out.println("Login");
		login.click();
		utils.waitXpath(driver, wait, test5.userPath);
		WebElement userfield = driver.findElementByXPath(test5.userPath);
		System.out.println("Send user");
		userfield.clear();
		userfield.sendKeys(test5.username);
		utils.waitXpath(driver, wait, test5.passPath);
		WebElement passfield = driver.findElementByXPath(test5.passPath);
		System.out.println("Send pass");
		passfield.clear();
		passfield.sendKeys(test5.pass);
		utils.waitXpath(driver, wait, test5.loginPath2);
		WebElement login2 = driver.findElementByXPath(test5.loginPath2);
		login2.click();
		System.out.println("Loging in...");
		Thread.sleep(5000);
		System.out.println("Wait for game...");
		utils.waitXpath(driver, wait, test5.gamePath);
		WebElement game = driver.findElementByXPath(test5.gamePath);
		utils.clickElement(driver, game, options.games.get(test5.gameName), orig_context);
		game.click();
		System.out.println("Step by step...");
		WebElement stepbystep = driver.findElementByXPath(test5.stepByStepPath);
		stepbystep.click();
		System.out.println("Random...");
		Thread.sleep(2000);
		WebElement random = driver.findElementByXPath(test5.randomPath);
		random.click();
		utils.waitXpath(driver, wait, test5.totalPricePath);
		System.out.println("Found total price...");
		WebElement total = driver.findElementByXPath(test5.totalPricePath);
		String totalPrice = total.getText();
		System.out.println("TOTAL PRICE: " + total.getText());
		System.out.println("Continue...");
		utils.waitXpath(driver, wait, test5.continueButtonPath);
		WebElement continueButton = driver.findElementByXPath(test5.continueButtonPath);
		continueButton.click();
		Thread.sleep(2000);
		utils.waitXpath(driver, wait, test5.finalPricePath);
		// swipeToBottom();
		WebElement finalPrice = driver.findElementByXPath(test5.finalPricePath);
		System.out.println("FINAL PRICE: " + finalPrice.getText() + "€");
		String finalPrize = finalPrice.getText() + " €";
		assertEquals(finalPrize, totalPrice);

	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}

}
