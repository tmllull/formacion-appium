package domain;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverAndroid {
	
	private DesiredCapabilities capabilities;
	private URL appium_url;
		
	public DriverAndroid(URL appium_server, String device_name, String platform_name, String app_path,
			String device_version, String device_udid, boolean no_reset) {
		
		this.capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_name);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
		/* SET WITH THE LOCATION OF THE APK*/
		capabilities.setCapability(MobileCapabilityType.APP,app_path);
		/* DOESN'T RE-INSTALL THE APP */
		capabilities.setCapability("noReset",no_reset);
		/* SET UDID OF THE SELECTED DEVICE*/
		capabilities.setCapability("udid",device_udid);
		this.appium_url = appium_server;
		
	}
	
	public AppiumDriver getAndroidDriver() throws MalformedURLException {
		return new AndroidDriver(appium_url,capabilities);
	}
	
	
	
	

}
