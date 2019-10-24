package allTests;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

public class Test5Options {
	public String showListPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows";
	public String selectedShowPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedShowTrickPath = "//android.widget.TextView[@text='NUEVA OBRA']";
	public String selectedDatePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedDateTrickPath = "//android.widget.TextView[@text='lun., 28/10/2019']";
	public String selectPlacesPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/ivInfoBuy";
	public HashMap<Integer, String> placesPath = new HashMap<Integer, String>();
	public String pricePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvInfoPrice";
	public String buyPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/ivPit";
	public String noDiscountPath = "android:id/button2";
	public String totalPricePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvPurchaseTotal";
	public String basePlacePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button";
	
	
	//PATH FIRST PLACE
	//"com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/button1";
	
	public Test5Options() {
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
