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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test2Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test2 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test2Options test2 = new Test2Options();
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

		utils.waitXpath(driver, wait, test2.loginPath);
		WebElement login = driver.findElementByXPath(test2.loginPath);
		System.out.println("Loggin");
		login.click();
		utils.waitXpath(driver, wait, test2.userPath);
		WebElement userfield = driver.findElementByXPath(test2.userPath);
		System.out.println("Send user");
		userfield.clear();
		userfield.sendKeys(test2.username);
		utils.waitXpath(driver, wait, test2.passPath);
		WebElement passfield = driver.findElementByXPath(test2.passPath);
		System.out.println("Send pass");
		passfield.clear();
		passfield.sendKeys(test2.pass);
		utils.waitXpath(driver, wait, test2.loginPath2);
		WebElement login2 = driver.findElementByXPath(test2.loginPath2);
		login2.click();
		System.out.println("Logging in...");
		System.out.println("Wait for game...");
		Thread.sleep(6000);
		WebElement game = driver.findElementByXPath(test2.gamePath);
		utils.clickElement(driver, game, options.games.get(test2.gameName), orig_context);
		game.click();
		System.out.println("Step by step...");
		WebElement stepbystep = driver.findElementByXPath(test2.stepByStepPath);
		stepbystep.click();
		Select bets = new Select(driver.findElementByXPath(test2.betsSelectorPath));
		System.out.println("number of bets: " + bets.getFirstSelectedOption().getText());
		int betNumber = Integer.valueOf(bets.getFirstSelectedOption().getText());
		WebElement yourCombo = driver.findElementByXPath(test2.yourComboPath);
		yourCombo.click();
		System.out.println("Start first bet");
		for (int i = 1; i <= 14; ++i) {
			utils.waitXpath(driver, wait, test2.oneNumberPath[i]);
			WebElement element = driver.findElementByXPath(test2.oneNumberPath[i]);
			if (i == 10) {
				utils.swipeToBottom(driver, orig_context);
			}
			String temp = element.getAttribute("textContent");
			System.out.println(temp.trim());
			test2.selectedBets.add(temp.trim());
			element.click();
		}
		utils.swipeToTop(driver, orig_context);
		utils.swipeToRight(driver, orig_context);
		System.out.println("Start second bet");
		for (int i = 1; i <= 14; ++i) {
			utils.waitXpath(driver, wait, test2.xNumberPath[i]);
			WebElement element = driver.findElementByXPath(test2.xNumberPath[i]);
			if (i == 10) {
				utils.swipeToBottom(driver, orig_context);
			}
			String temp = element.getAttribute("textContent").trim();
			System.out.println(temp);
			test2.selectedBets.add(temp);
			element.click();
		}

		WebElement zero1 = driver.findElementByXPath(test2.zero1Path);
		WebElement zero2 = driver.findElementByXPath(test2.zero2Path);
		zero1.click();
		zero2.click();
		test2.selectedBets.add(zero1.getAttribute("textContent").trim());
		test2.selectedBets.add(zero2.getAttribute("textContent").trim());
		WebElement continueButton = driver.findElementByXPath(test2.continueButtonPath);
		continueButton.click();
		Thread.sleep(5000);
		System.out.println("comparing resume");
		for (int i = 1; i <= betNumber; i++) {
			for (int j = 2; j <= 15; j++) {
				WebElement element = driver.findElementByXPath(
						"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div["
								+ j + "]/div[2]/div[" + i + "]/div");
				String temp = element.getAttribute("textContent");
				test2.finalBets.add(element.getAttribute("textContent"));
			}
		}
		WebElement zero0 = driver.findElementByXPath(
				"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div[16]/div[2]/div/div[1]/div");
		WebElement zeroSecond = driver.findElementByXPath(
				"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div[16]/div[2]/div/div[2]/div");
		test2.finalBets.add(zero0.getAttribute("textContent").trim());
		test2.finalBets.add(zeroSecond.getAttribute("textContent").trim());
		assertEquals(test2.selectedBets, test2.finalBets);

	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
