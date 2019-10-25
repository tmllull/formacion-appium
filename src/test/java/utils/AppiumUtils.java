package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;

public class AppiumUtils {
	
	private int count;
	
	public AppiumUtils() {
		int count = 0;
	}
	
	public boolean takeScreenshot(AppiumDriver driver) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		count ++;
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", "screenshot_"+count)));
	}

}
