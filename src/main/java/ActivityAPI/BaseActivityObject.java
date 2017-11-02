package ActivityAPI;

import io.appium.java_client.AppiumDriver;

public abstract class BaseActivityObject {
	
	AppiumDriver driver;

	public BaseActivityObject(AppiumDriver driver) {
		this.driver = driver;
	}
	
	

}
