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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import domain.ConfigOptions;
import domain.Test4Options;
import domain.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * General Test
 *
 */
public class Test4 {

	AppiumDriver driver;
	ConfigOptions options = new ConfigOptions();
	Test4Options test4 = new Test4Options();
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

		utils.waitXpath(driver, wait, test4.loginPath);
		WebElement login = driver.findElementByXPath(test4.loginPath);
		System.out.println("Loggin");
		login.click();
		utils.waitXpath(driver, wait, test4.userPath);
		WebElement userfield = driver.findElementByXPath(test4.userPath);
		System.out.println("Send user");
		userfield.clear();
		userfield.sendKeys(test4.username);
		utils.waitXpath(driver, wait, test4.passPath);
		WebElement passfield = driver.findElementByXPath(test4.passPath);
		System.out.println("Send pass");
		passfield.clear();
		passfield.sendKeys(test4.pass);
		utils.waitXpath(driver, wait, test4.loginPath2);
		WebElement login2 = driver.findElementByXPath(test4.loginPath2);
		login2.click();
		System.out.println("Logging in...");
		System.out.println("Wait for game...");
		Thread.sleep(5000);
		utils.waitXpath(driver, wait, test4.gamePath);
		WebElement game = driver.findElementByXPath(test4.gamePath);
		utils.clickElement(driver, game, options.games.get(test4.gameName), orig_context);
		game.click();
		System.out.println("Step by step...");
		WebElement stepbystep = driver.findElementByXPath(test4.stepByStepPath);
		stepbystep.click();
		utils.waitXpath(driver, wait, test4.multiplePath);
		WebElement multiple = driver.findElementByXPath(test4.multiplePath);
		multiple.click();
		Select bets = new Select(driver.findElementByXPath(test4.betsSelectorPath));
		System.out.println("number of bets: " + bets.getFirstSelectedOption().getText());
		int betNumber = Integer.valueOf(bets.getFirstSelectedOption().getText());
		org.openqa.selenium.support.ui.Select doble = new org.openqa.selenium.support.ui.Select(
				driver.findElementByXPath(test4.doblePath));
		doble.selectByVisibleText("1");
		int dobleValue = Integer.valueOf(doble.getFirstSelectedOption().getText());
		org.openqa.selenium.support.ui.Select triple = new org.openqa.selenium.support.ui.Select(
				driver.findElementByXPath(test4.triplePath));
		triple.selectByVisibleText("1");
		int tripleValue = Integer.valueOf(triple.getFirstSelectedOption().getText());
		utils.waitXpath(driver, wait, test4.totalPricePath);
		System.out.println("Found total price...");
		WebElement total = driver.findElementByXPath(test4.totalPricePath);
		System.out.println("TOTAL PRICE: " + total.getText());
		WebElement yourCombo = driver.findElementByXPath(test4.yourComboPath);
		yourCombo.click();

		System.out.println("Start click 1's");
		test4.selectBets(driver, orig_context);

		WebElement zero1 = driver.findElementByXPath(test4.zero1Path);
		WebElement zero2 = driver.findElementByXPath(test4.zero2Path);
		test4.selectedBets.add(zero1.getAttribute("textContent").trim());
		test4.selectedBets.add(zero2.getAttribute("textContent").trim());
		zero1.click();
		zero2.click();
		WebElement continueButton = driver.findElementByXPath(test4.continueButtonPath);
		continueButton.click();
		Thread.sleep(5000);
		System.out.println("comparing resume");
		test4.compareResults(driver, dobleValue, tripleValue);
		assertEquals(test4.selectedBets, test4.finalBets);

	}

	@After
	public void closeTest() throws InterruptedException {
		// Thread.sleep(5000);
		// driver.quit();
	}
}
