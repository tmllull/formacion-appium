package config;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

public class Test4Options {
	public String showListPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows";
	public String selectedShowPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedShowTrickPath = "//android.widget.TextView[@text='NUEVA OBRA']";
	public String selectedDatePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedDateTrickPath = "//android.widget.TextView[@text='lun., 28/10/2019']";
	public String selectPlacesPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/ivInfoBuy";
	public Integer[] places = new Integer[] {3,4,13};
	public String buyPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/ivPit";
	public String noDiscountPath = "android:id/button2";
	public String mailPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etPurchaseMail";
	public String namePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/editText";
	public String lastNamePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/editText2";
	public HashMap<Integer, String> placesPath = new HashMap<Integer, String>();
	public String mail = "test@test.com";
	public String name = "Test";
	public String lastname = "Test";
	public String confirmPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btPurchaseConfirm";
	public String basePlacePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button";
	
	//PATH FIRST PLACE
	//"com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button1";
	
	public Test4Options() {
		setPlacesPath();
	}
	
	public void setPlacesPath() {
		for (int i = 1; i <= 40; ++i) {
			this.placesPath.put(i, this.basePlacePath+i);
		}
	}
	
	public void selectPlaces(AppiumDriver driver, Integer[] places) {
		for (int i = 0; i < places.length; ++i) {
			driver.findElementById(this.placesPath.get(places[i])).click();
		}
		return;
	}
	
	
}
