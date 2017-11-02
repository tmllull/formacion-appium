package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * General Test
 *
 */
public class GeneralTest 
{
	
	AppiumDriver driver;
	private static final String APPIUM_LOCAL_URL = "http://127.0.0.1:4723/wd/hub";
	//private static final String APP_PATH = "C:\\Users\\allullam\\Downloads\\SELAE_SIGNED_PRO_8.1.01.apk";
	private static final String APP_PATH = "D:\\Users\\jualvare\\Downloads\\SELAE_INT7_8.1.01.apk";
	private static final String DEVICE_UDID = "08eef699f1421cd5"; // NEXUs 5
	//private static final String DEVICE_UDID = "5e29f967"; // NOTE 3
	//private static final String DEVICE_UDID = "192.168.229.101:5555";
	//private static final String DEVICE_UDID = "ZY2222KB59"; //MOTO G
	//private static final String DEVICE_UDID = "LGD85510583830"; //LG G3
	//private static final String DEVICE_UDID = "ae63ae53"; //S5
	private int height;
	private int width;
	private String orig_context;
	HashMap<String, Integer> games = new HashMap<String, Integer>();
	
	@Before
	public void openTest() throws InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MOTO G");
		/* SET WITH THE LOCATION OF THE APK*/
		capabilities.setCapability(MobileCapabilityType.APP,APP_PATH);
		/* DOESN'T RE-INSTALL THE APP */
		capabilities.setCapability("noReset", true);
		/* SET UDID OF THE SELECTED DEVICE*/
		capabilities.setCapability("udid",DEVICE_UDID);
		/* SET AUTOMATION NAME */
		//capabilities.setCapability("automationName","Appium");
		
		
		try {
			driver = new AndroidDriver(new URL(APPIUM_LOCAL_URL), capabilities);
			height = driver.manage().window().getSize().getHeight();
			width =  driver.manage().window().getSize().getWidth();
			games.put("PRIMITIVA", -2);
			games.put("EUROMILLONES", -1);
			games.put("LOTERÍA NACIONAL", 0);
			games.put("BONOLOTO", 1);
			games.put("LA QUINIELA", 2);
			games.put("EL GORDO", 3);
			games.put("QUINIGOL", 4);
			games.put("LOTOTURF", 5);
			games.put("QUÍNTUPLE PLUS", 6);	
			System.out.println("WIDTH: "+width+" HEIGHT: "+height);
			//Thread.sleep(8000);
			
			Set<String> availableContexts1 = driver.getContextHandles();
			System.out.println("Total No of Context Found Before reaching WebView = "+ availableContexts1.size());
			System.out.println("Context Name is "+ availableContexts1);
			for(String context : availableContexts1) {
				if(context.contains("WEBVIEW")){
					System.out.println("Context Name is " + context);
					orig_context = context;
					// 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
					//(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
					driver.context(context);
					System.out.println("changed");
					break;
				}
			}
			System.out.println("changed to webview");

		}
		catch (MalformedURLException e) {
			System.out.println(APPIUM_LOCAL_URL+" IS NOT A VALID URL");
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		
			WebDriverWait wait = new WebDriverWait(driver, 20);
			/*wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div/div[3]/button")));
			System.out.println("button accept");
			WebElement aceptar = driver.findElementByXPath("/html/body/div[2]/div/div[3]/button");
			aceptar.click();*/
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/html/body/ion-nav-view/ion-content/div[2]/div/div/div[1]/a")));
			WebElement without_session = driver.findElementByXPath("/html/body/ion-nav-view/ion-content/div[2]/div/div/div[1]/a");
			System.out.println("without session");
			without_session.click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[3]")));

			//clickElement(bonoloto,games.get("BONOLOTO"));
			
		System.out.println("menu");
			WebElement menu = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[1]/span/button");
			menu.click();
			
			System.out.println("Last results");
			WebElement lastResults = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div/ion-list/div/ion-item[3]/a");
			wait.until(ExpectedConditions.elementToBeClickable(lastResults));
			lastResults.click();
		
			//Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[3]/div")));
			WebElement quinigol = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[7]");
			//WebElement loteria_ini = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[3]");
			WebElement euromillones = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[2]");
			WebElement primitiva = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[1]");
			WebElement loteria = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[3]");
			WebElement bonoloto = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[4]");
			//WebElement laquiniela = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[5]");
			WebElement elgordo = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[6]");
			WebElement lototurf = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[8]");
			WebElement quintupleplus = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[9]");
			
			clickElement(loteria,games.get("LOTERÍA NACIONAL"));
			//clickElement(loteria);
			System.out.println("Element clicked");
			
			WebElement premio2 = driver.findElementByXPath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[2]/div[1]/div/div[2]/div[1]/div[4]/span/p");
			System.out.println("GET_TEXT: "+premio2.getText());
	}
	
	public void tapOnCoordinates(final double x, final double y) {
       
		driver.tap(1,(int) x,(int) y,1000);
    }
	
	public void clickElement(WebElement webViewElement,int it) throws InterruptedException {

        // We need to compare the view size of web and native.

        // First we gather [Information] of web view.
        // [Information] - Element coordinates of element and web view height
        // and width.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Web View Dimensions
        int screenWebViewWidth = ((Long) js.executeScript("return window.innerWidth || document.body.clientWidth"))
                .intValue();
        System.out.println("width value calculated is :" + screenWebViewWidth);
        int screenWebViewHeight = ((Long) js.executeScript("return window.innerHeight || document.body.clientHeight"))
                .intValue();
        System.out.println("height value calculated is :" + screenWebViewHeight);

        /*// Element Coordinates in WebView
        int elementwebViewX = webViewElement.getLocation().getX();
        int elementwebViewY = webViewElement.getLocation().getY();*/
        Point point = webViewElement.getLocation();
        Dimension size = webViewElement.getSize();
        int elementwebViewX = point.getX() + Math.round(size.getWidth() / 2);
        int elementwebViewY = point.getY() + Math.round(size.getHeight() / 2);
        System.out.println("X :" + elementwebViewX);
        System.out.println("Y :" + elementwebViewY);

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

        System.out.println("Service Url bar height :" + serviceUrlBar);
        System.out.println("element native view Y coordinate calculated as :" + elementNativeViewY);
        System.out.println("X: " + elementNativeViewX);
        System.out.println("Y: " + (elementNativeViewY + serviceUrlBar));

        // Adding 1 just to remove the 0.9999999 error
        //tapOnCoordinates(elementNativeViewX, (elementNativeViewY + serviceUrlBar + 1));
        
        /////////////////////////////////////SWIPE/////////////////////////////////////////////////////////
        //driver.swipe((int)elementNativeViewX,(int)(elementNativeViewY + serviceUrlBar + 1),(int)screenWidth/2 ,(int) (elementNativeViewY + serviceUrlBar + 1),1000);
        int diff = ((int)screenWidth/2) - (int)elementNativeViewX;
        System.out.println("DIFF "+diff);
        System.out.println("CENTER "+(int)screenWidth/2);
        System.out.println("ELEM CENTER "+(int)elementNativeViewX);
		if(it  != 0) {
			it = Math.abs(it);
			int diff_elem = diff/it;
			while(it > 0) {
				System.out.println("DIFF_ELEM "+diff_elem);
				System.out.println("SWIPE");
				(new TouchAction(driver))
				  .press((int)screenWidth/2,(int) (elementNativeViewY + serviceUrlBar + 1) )
				  .moveTo((int) (diff_elem),0) 
				  .waitAction(200)
				  .perform();
				 it--;
				 System.out.println("patata");
				 //tapOnCoordinates((int)screenWidth/2,(int) (elementNativeViewY + serviceUrlBar + 1));
				
			}
			
		}
        tapOnCoordinates((int)screenWidth/2,(int) (elementNativeViewY + serviceUrlBar + 1));
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        Thread.sleep(2000);
        // Switching back to Web View
        driver.context(orig_context);
    }
	
	
	@After
	public void closeTest() throws InterruptedException{
		//Thread.sleep(5000);
		//driver.quit();
	}
	
		



	
	
		
}
