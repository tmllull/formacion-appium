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
	
	public String takeScreenshot(AppiumDriver driver) {
		String screenshotDirectory;
		if(System.getProperty("appium.screenshots.dir") != null) {
			screenshotDirectory = System.getProperty("appium.screenshots.dir");

		}
		else {
			screenshotDirectory = System.getProperty("user.dir")+"/reports/screenshots";
		}
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		count ++;
		screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", "screenshot_"+count)));
		return new File(screenshotDirectory, String.format("%s.png", "screenshot_"+count)).toString();
	}

}
