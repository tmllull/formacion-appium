package domain;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class Utils {

	public void tapOnCoordinates(AppiumDriver driver, final double x, final double y) {

		driver.tap(1, (int) x, (int) y, 1000);
	}

	public void clickElement(AppiumDriver driver, WebElement webViewElement, int it, String orig_context)
			throws InterruptedException {

		// We need to compare the view size of web and native.

		// First we gather [Information] of web view.
		// [Information] - Element coordinates of element and web view height
		// and width.
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Web View Dimensions
		int screenWebViewWidth = ((Long) js.executeScript("return window.innerWidth || document.body.clientWidth"))
				.intValue();
		int screenWebViewHeight = ((Long) js.executeScript("return window.innerHeight || document.body.clientHeight"))
				.intValue();

		/*
		 * // Element Coordinates in WebView int elementwebViewX =
		 * webViewElement.getLocation().getX(); int elementwebViewY =
		 * webViewElement.getLocation().getY();
		 */
		Point point = webViewElement.getLocation();
		Dimension size = webViewElement.getSize();
		int elementwebViewX = point.getX();
		int elementwebViewY = point.getY();
		// int elementwebViewX = point.getX() + Math.round(size.getWidth() / 2);
		// int elementwebViewY = point.getY() + Math.round(size.getHeight() / 2);

		// Switching to Native view to use the native supported methods

		driver.context("NATIVE_APP");

		double screenWidth = driver.manage().window().getSize().getWidth();
		double screenHeight = driver.manage().window().getSize().getHeight();

		// Service URL bar height is %
		double serviceUrlBar = (double) screenHeight * (0.135135);
		double relativeScreenViewHeight = screenHeight - serviceUrlBar;

		// From the webview coordinates we will be calculating the native view
		// coordinates using the width and height.
		double elementNativeViewX = (double) ((elementwebViewX * screenWidth) / screenWebViewWidth);
		double elementNativeViewY = (double) ((elementwebViewY * relativeScreenViewHeight) / screenWebViewHeight);

		// Adding 1 just to remove the 0.9999999 error
		// tapOnCoordinates(elementNativeViewX, (elementNativeViewY + serviceUrlBar +
		// 1));

		///////////////////////////////////// SWIPE/////////////////////////////////////////////////////////
		// driver.swipe((int)elementNativeViewX,(int)(elementNativeViewY + serviceUrlBar
		///////////////////////////////////// + 1),(int)screenWidth/2 ,(int)
		///////////////////////////////////// (elementNativeViewY + serviceUrlBar +
		///////////////////////////////////// 1),1000);
		int diff = ((int) screenWidth / 2) - (int) elementNativeViewX;

		if (it != 0) {
			it = Math.abs(it);
			int diff_elem = diff / it;
			while (it > 0) {
				System.out.println("SWIPE");
				(new TouchAction(driver)).press((int) screenWidth / 2, (int) (elementNativeViewY + serviceUrlBar + 1))
						.moveTo((int) (diff_elem), 0).waitAction(200).perform();
				it--;
				// tapOnCoordinates((int)screenWidth/2,(int) (elementNativeViewY + serviceUrlBar
				// + 1));

			}

		}
		System.out.println("Click on game");
		tapOnCoordinates(driver, (int) screenWidth / 2, (int) (elementNativeViewY + serviceUrlBar + 1));
		///////////////////////////////////////////////////////////////////////////////////////////////////
		Thread.sleep(2000);
		// Switching back to Web View
		driver.context(orig_context);
	}

	public void waitXpath(AppiumDriver driver, WebDriverWait wait, String xpath) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath(xpath)));
		return;
	}

	public void swipeToBottom(AppiumDriver driver, String orig_context) throws InterruptedException {
		driver.context("NATIVE_APP");

		double screenWidth = driver.manage().window().getSize().getWidth();
		double screenHeight = driver.manage().window().getSize().getHeight();
		System.out.println("WIDTH: " + screenWidth);
		System.out.println("HEIGHT: " + screenHeight);
		System.out.println("WIDTH/2: " + screenWidth / 2);
		System.out.println("HEIGHT/2: " + screenHeight / 2);
		System.out.println("HEIGHT CLICK POSITION: " + screenHeight * 0.8);
		System.out.println("MOVE TO VALUE: " + String.valueOf(screenHeight / 2));

		(new TouchAction(driver)).press((int) (screenWidth / 2), (int) (screenHeight * 0.8))
				.moveTo(0, (int) (-screenHeight / 2)).perform();
		System.out.println("SCROLL UP");
		Set<String> availableContexts1 = driver.getContextHandles();
		// System.out.println("Total No of Context Found Before reaching WebView = "+
		// availableContexts1.size());
		System.out.println("Context options on return: " + availableContexts1);

		///////////////////////////////////////////////////////////////////////////////////////////////////
		driver.context(orig_context);

	}

	public void rootDevices(AppiumDriver driver) {
		WebElement aceptar = driver.findElementByXPath("/html/body/div[2]/div/div[3]/button");
		aceptar.click();
	}

	public void swipeToTop(AppiumDriver driver, String orig_context) throws InterruptedException {
		driver.context("NATIVE_APP");

		double screenWidth = driver.manage().window().getSize().getWidth();
		double screenHeight = driver.manage().window().getSize().getHeight();

		(new TouchAction(driver)).press((int) (screenWidth / 2), (int) (screenHeight * 0.2))
				.moveTo(0, (int) (screenHeight / 2)).perform();
		System.out.println("SCROLL DOWN");
		Set<String> availableContexts1 = driver.getContextHandles();
		// System.out.println("Total No of Context Found Before reaching WebView = "+
		// availableContexts1.size());
		// System.out.println("Context options on return: " + availableContexts1);

		///////////////////////////////////////////////////////////////////////////////////////////////////
		driver.context(orig_context);

	}

	public void swipeToRight(AppiumDriver driver, String orig_context) throws InterruptedException {
		driver.context("NATIVE_APP");

		double screenWidth = driver.manage().window().getSize().getWidth();
		double screenHeight = driver.manage().window().getSize().getHeight();

		(new TouchAction(driver)).press((int) (screenWidth * 0.8), (int) (screenHeight / 2))
				.moveTo((int) (-screenWidth / 1.5), 0).perform();
		System.out.println("SCROLL LEFT");
		Set<String> availableContexts1 = driver.getContextHandles();
		// System.out.println("Total No of Context Found Before reaching WebView = "+
		// availableContexts1.size());
		// System.out.println("Context options on return: " + availableContexts1);

		///////////////////////////////////////////////////////////////////////////////////////////////////
		driver.context(orig_context);

	}

	public void swipeToLeft(AppiumDriver driver, String orig_context) throws InterruptedException {
		driver.context("NATIVE_APP");

		double screenWidth = driver.manage().window().getSize().getWidth();
		double screenHeight = driver.manage().window().getSize().getHeight();

		(new TouchAction(driver)).press((int) (screenWidth * 0.2), (int) (screenHeight / 2))
				.moveTo((int) (screenWidth / 1.5), 0).perform();
		System.out.println("SCROLL RIGHT");
		Set<String> availableContexts1 = driver.getContextHandles();
		// System.out.println("Total No of Context Found Before reaching WebView = "+
		// availableContexts1.size());
		// System.out.println("Context options on return: " + availableContexts1);

		///////////////////////////////////////////////////////////////////////////////////////////////////
		driver.context(orig_context);

	}

}
