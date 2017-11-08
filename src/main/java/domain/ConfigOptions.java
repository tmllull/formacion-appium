package domain;

import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class ConfigOptions {
	private static final String APPIUM_LOCAL_URL = "http://127.0.0.1:4723/wd/hub";
	//private static final String APP_PATH = "C:\\Users\\Appium Automation\\Documents\\teatre-mallorca.apk";
	private static final String APP_PATH = "C:\\Users\\allullam\\Documents\\teatre-mallorca.apk";
	private static final String PLATFORM_VERSION = "5.1.1";
	private static final String DEVICE_NAME = "Moto G";
	//private static final String APP_PATH = "D:\\Users\\jualvare\\Downloads\\teatre_mallorca.apk";
	//private static final String DEVICE_UDID = "08eef699f1421cd5"; // NEXUS 5
	//private static final String DEVICE_UDID = "5e29f967"; // NOTE 3
	//private static final String DEVICE_UDID = "192.168.229.101:5555";
	private static final String DEVICE_UDID = "ZY2222KB59"; //MOTO G
	//private static final String DEVICE_UDID = "LGD85510583830"; //LG G3
	//private static final String DEVICE_UDID = "ae63ae53"; //S5
	//private static final String DEVICE_UDID = "d1a28b45"; // S4
	//private static final String DEVICE_UDID = "4df77c6a0df211a3"; // NOTE 2
	
	public HashMap<String, Integer> games = new HashMap<String, Integer>();
	
	public ConfigOptions() {
	}

	public String getAppPath() {
		return this.APP_PATH;
	}
	
	public String getLocalUrl() {
		return this.APPIUM_LOCAL_URL;
	}
	
	public String getDeviceUdid() {
		return this.DEVICE_UDID;
	}
	
	public String getVersion() {
		return this.PLATFORM_VERSION;
	}
	
	public String getDeviceName() {
		return this.DEVICE_NAME;
	}
	
	public DesiredCapabilities setCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, getVersion());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getDeviceName());
		capabilities.setCapability(MobileCapabilityType.APP,getAppPath());
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("udid",getDeviceUdid());
		return capabilities;		
	}
	

}
