package test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test3Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test3 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test3Options test3 = new Test3Options();
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
		utils.rootDevices(driver);

		utils.waitXpath(driver, wait, test3.loginPath);
		WebElement login = driver.findElementByXPath(test3.loginPath);
		System.out.println("Login");
		login.click();
		utils.waitXpath(driver, wait, test3.userPath);
		WebElement userfield = driver.findElementByXPath(test3.userPath);
		System.out.println("Send user");
		userfield.clear();
		userfield.sendKeys(test3.username);
		utils.waitXpath(driver, wait, test3.passPath);
		WebElement passfield = driver.findElementByXPath(test3.passPath);
		System.out.println("Send pass");
		passfield.clear();
		passfield.sendKeys(test3.pass);
		utils.waitXpath(driver, wait, test3.loginPath2);
		WebElement login2 = driver.findElementByXPath(test3.loginPath2);
		login2.click();
		System.out.println("Loging in...");
		Thread.sleep(5000);
		System.out.println("Wait for game...");
		utils.waitXpath(driver, wait, test3.gamePath);
		WebElement game = driver.findElementByXPath(test3.gamePath);
		utils.clickElement(driver, game, options.games.get(test3.gameName), orig_context);
		game.click();
		System.out.println("Step by step...");
		WebElement stepbystep = driver.findElementByXPath(test3.stepByStepPath);
		stepbystep.click();
		Thread.sleep(2000);
		WebElement multiple = driver.findElementByXPath(test3.multiplePath);
		multiple.click();
		Select doble = new Select(driver.findElementByXPath(test3.doblePath));
		// doble.selectByValue("1");
		doble.selectByVisibleText("1");
		int dobleValue = Integer.valueOf(doble.getFirstSelectedOption().getText());
		System.out.println("DOUBLE: " + dobleValue);
		Select triple = new Select(driver.findElementByXPath(test3.triplePath));
		// triple.selectByValue("1");
		triple.selectByVisibleText("1");
		int tripleValue = Integer.valueOf(triple.getFirstSelectedOption().getText());
		WebElement random = driver.findElementByXPath(test3.randomPath);
		random.click();

		utils.waitXpath(driver, wait, test3.totalPricePath);
		System.out.println("Found total price...");
		WebElement total = driver.findElementByXPath(test3.totalPricePath);
		System.out.println("TOTAL PRICE: " + total.getText());
		System.out.println("Continue...");
		utils.waitXpath(driver, wait, test3.continueButtonPath);
		WebElement continueButton = driver.findElementByXPath(test3.continueButtonPath);
		continueButton.click();
		Thread.sleep(5000);
		int doubleCounter = 0;
		int tripleCounter = 0;
		int cols = 1;
		if (tripleValue != 0) {
			cols = 3;
		} else if (dobleValue != 0) {
			cols = 2;
		}
		for (int i = 1; i <= cols; i++) {
			// System.out.println(i);
			for (int j = 2; j <= 15; j++) {
				// System.out.println(j);
				try {
					if (i == 2) {
						WebElement element = driver.findElementByXPath(
								"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div["
										+ j + "]/div[2]/div/div[" + i + "]");
						doubleCounter++;
					} else if (i == 3) {
						WebElement element = driver.findElementByXPath(
								"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div["
										+ j + "]/div[2]/div/div[" + i + "]");
						tripleCounter++;
					}
				} catch (NoSuchElementException e) {
					// System.out.println("ERROR");
					// TODO: handle exception
				}

			}
		}
		assertEquals(dobleValue + tripleValue, doubleCounter);
		assertEquals(tripleValue, tripleCounter);
	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}

}
