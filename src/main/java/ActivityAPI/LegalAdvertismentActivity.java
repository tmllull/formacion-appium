package ActivityAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LegalAdvertismentActivity extends BaseActivityObject {
	
	public LegalAdvertismentActivity(AppiumDriver driver) {
		super(driver);
		
	}

	public void acceptAdvertisment() {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Aviso legal\"]")));
		System.out.println("wait for aviso");
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Aceptar");
		System.out.println("Element found");
		System.out.println("scroll");
		wait.until(ExpectedConditions.visibilityOf(el1));
		driver.scrollToExact("Aceptar");
		el1.click();
		System.out.println("element clicked");
	}

}
