package domain;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

public class Test4Options {
	public String showListPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/bt_llistar_obres_main";
	public String selectedShowPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedShowTrickPath = "//android.widget.TextView[@text='EL REY LEON']";
	public String selectedDatePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedDateTrickPath = "//android.widget.TextView[@text='Miércoles, 6/12/17']";
	public String selectPlacesPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/iv_comprar_entrades";
	public HashMap<Integer, String> placesPath = new HashMap<Integer, String>();
	
	
	//PATH FIRST PLACE
	//"com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button1";
	
	public Test4Options() {
		setPlacesPath();
	}
	
	public void setPlacesPath() {
		for (int i = 1; i <= 40; ++i) {
			this.placesPath.put(i, "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button"+i);
		}
	}
	
	public void selectPlaces(AppiumDriver driver, Integer[] places) {
		for (int i = 0; i < places.length; ++i) {
			driver.findElementById(this.placesPath.get(places[i])).click();
		}
		return;
	}
	
	
}
