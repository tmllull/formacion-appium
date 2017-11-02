package domain;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class Test4Options {

	public String loginPath = "/html/body/ion-nav-view/ion-content/div[2]/div/div/div[2]/div/div[2]/button";
	public String userPath = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/label[1]/input";
	public String passPath = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/label[2]/input";
	public String loginPath2 = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/div[3]/button";
	public String username = "poc01@b.com";
	public String pass = "Prueba123";
	public String gameName = "LA QUINIELA";
	public String gamePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[5]/div/div/span";
	public String guardarPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-tabs/ion-nav-view/ion-view/ion-content/div/div[3]/div[2]/button";
	public String stepByStepPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/div[1]/div[1]/button";
	public String yourComboPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[3]/button";
	public String totalPricePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[2]/div[2]";
	public String oneNumberPath[] = new String[15];
	public String betsSelectorPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[3]/select";
	public String continueButtonPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[2]/button";
	public String zero1Path = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/quiniela-combination-drv/div/div[2]/div/div[2]";
	public String zero2Path = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/quiniela-combination-drv/div/div[3]/div/div[2]";
	public String xNumberPath[] = new String[15];

	public String[] twoNumberPath = new String[15];

	public String multiplePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[2]/label[2]";
	public String doblePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[4]/div/select";
	public String triplePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[5]/div/select";

	public List<String> selectedBets = new ArrayList<String>();
	public List<String> finalBets = new ArrayList<String>();

	public Test4Options() {
		setNumbers();
	}

	private void setNumbers() {
		for (int i = 1; i <= 14; ++i) {
			this.oneNumberPath[i] = "//*[@id=\"combo-1\"]/div[2]/div[" + i + "]/div[3]/div[1]";
			this.xNumberPath[i] = "//*[@id=\"combo-1\"]/div[2]/div[" + i + "]/div[3]/div[2]";
			this.twoNumberPath[i] = "//*[@id=\"combo-1\"]/div[2]/div[" + i + "]/div[3]/div[3]";
		}
	}

	public List<String> compareResults(AppiumDriver driver, int dobleValue, int tripleValue) {
		System.out.println("Start");
		System.out.println("Doble value = "+dobleValue);
		System.out.println("Triple value = "+tripleValue);
		int cols = 1;
		if (tripleValue != 0) {
			cols = 3;
		} else if (dobleValue != 0) {
			cols = 2;
		}
		for (int i = 2; i <= 15; i++) {
			// System.out.println(i);
			for (int j = 1; j <= cols; j++) {
				// System.out.println(j);
				try {
					System.out.println("Try " + i + j);
					WebElement element = driver.findElementByXPath(
							"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div["
									+ i + "]/div[2]/div/div[" + j + "]");

					String temp = element.getAttribute("textContent");
					System.out.println(temp);
					this.finalBets.add(temp);
				} catch (NoSuchElementException e) {
					System.err.println("NO ELEMENT");
					// TODO: handle exception
				}
			}
		}
		WebElement zero0 = driver.findElementByXPath(
				"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div[16]/div[2]/div/div[1]/div");
		WebElement zeroSecond = driver.findElementByXPath(
				"/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/quiniela-bet-drv/div/div[16]/div[2]/div/div[2]/div");
		this.finalBets.add(zero0.getAttribute("textContent").trim());
		this.finalBets.add(zeroSecond.getAttribute("textContent").trim());
		return finalBets;
	}
	
	public void selectBets(AppiumDriver driver, String orig_context) throws InterruptedException {
		for (int i = 1; i <= 14; ++i) {
			WebElement one = driver.findElementByXPath(this.oneNumberPath[i]);
			String temp = one.getAttribute("textContent");
			System.out.println(temp.trim());
			this.selectedBets.add(temp.trim());
			if (i == 1) {
				WebElement xElement = driver.findElementByXPath(this.xNumberPath[i]);
				WebElement twoElement = driver.findElementByXPath(this.twoNumberPath[i]);
				temp = xElement.getAttribute("textContent");
				System.out.println(temp.trim());
				this.selectedBets.add(temp.trim());
				temp = twoElement.getAttribute("textContent");
				System.out.println(temp.trim());
				this.selectedBets.add(temp.trim());
				xElement.click();
				twoElement.click();
			}
			if (i == 2) {
				WebElement xElement = driver.findElementByXPath(this.xNumberPath[i]);
				temp = xElement.getAttribute("textContent");
				System.out.println(temp.trim());
				this.selectedBets.add(temp.trim());
				xElement.click();
			}
			if (i == 10) {
				Utils utils = new Utils();
				utils.swipeToBottom(driver, orig_context);
			}
			one.click();
		}
	}
}
