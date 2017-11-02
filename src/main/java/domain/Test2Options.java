package domain;

import java.util.ArrayList;
import java.util.List;

public class Test2Options {
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
	public String betsSelectorPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[1]/div[3]/select"; 
	public String totalPricePath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/div[2]/div[2]";
	public String oneNumberPath[] = new String[15];
	public String continueButtonPath = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[2]/button";
	public String zero1Path = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/quiniela-combination-drv/div/div[2]/div/div[2]";
	public String zero2Path = "/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[1]/quiniela-combination-drv/div/div[3]/div/div[2]";
	public String xNumberPath[] = new String[15];
	
	public List<String> selectedBets = new ArrayList<String>();
	public List<String> finalBets = new ArrayList<String>();
	
	public Test2Options() {
		setBets();
	}
	
	public void setBets() {
		for (int i = 1; i <= 14; ++i) {
			this.oneNumberPath[i] = "//*[@id=\"combo-1\"]/div[2]/div[" + i + "]/div[2]/div[1]";
			this.xNumberPath[i] = "//*[@id=\"combo-2\"]/div[2]/div["+ i +"]/div[2]/div[2]";
		}
		return;
	}

}
