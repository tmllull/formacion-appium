package domain;

import java.net.URL;

import org.openqa.selenium.Capabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class MyDriver extends AppiumDriver{

	private static Capabilities capabilities;
	private static URL remoteAddress;

	public MyDriver() {
		super(remoteAddress, capabilities);
		this.capabilities = capabilities;
		this.remoteAddress = remoteAddress;
		// TODO Auto-generated constructor stub
	}

	public AndroidDriver getAndroidDriver() {
		return null;
	}
	
	public IOSDriver getIOSDriver() {
		return null;
	}

	public MobileElement scrollTo(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public MobileElement scrollToExact(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
