package domain;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

public class Test7Options {
	public String loginPath = "/html/body/ion-nav-view/ion-content/div[2]/div/div/div[2]/div/div[2]/button";
	public String userPath = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/label[1]/input";
	public String passPath = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/label[2]/input";
	public String loginPath2 = "/html/body/div[3]/div[2]/ion-modal-view/ion-content/div/form/div[3]/button";
	public String username = "poc01@b.com";
	public String pass = "Prueba123";
	public String gameName = "PRIMITIVA";
	public String gamePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/ks-swiper-container/div/div[2]/div[1]/div/div";
	public String stepByStepPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/div[1]/div[1]/button";
	public String multiplePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[2]/label[2]";
	public String selectMultiplePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[4]/div/select";
	public String yourComboPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[3]/button";
	public String randomPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[9]/label";
	public String totalPricePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[2]/div[2]";
	public String continueButtonPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[3]/button";
	public String finalPricePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/p/b";
	
	public HashMap<Integer, String> grid = new HashMap<Integer, String>();

	public Test7Options() {
		setQuinielaGrid();
	}
	
	private void setQuinielaGrid() {
		//QUINIELA GRID
		int col = 1;
		int row = 1;
		for (int i = 0; i < 50; ++i) {
			if (i == 10 || i == 20 || i == 30 || i == 40) {
				col++;
				row = 1;
			}
			this.grid.put(i, "//*[@id=\"combo-1\"]/div[2]/div["+col+"]/div["+row+"]");
			++row;
		}
		return;
	}
	
	public void clickNumbers(AppiumDriver driver, Integer[] numbers) {
		for (int i = 0; i < numbers.length; ++i) {
			driver.findElementByXPath(this.grid.get(numbers[i])).click();
		}
		return;
	}
}
