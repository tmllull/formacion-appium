package config;

import java.util.HashMap;

public class Test6Options {
	public String showListPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows";
	public String selectedShowPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedShowTrickPath = "//android.widget.TextView[@text='NUEVA OBRA']";
	public String filter = "Más opciones";
	public String dateFilter = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]";
	public HashMap<String,String> filterDays = new HashMap<String, String>();
	public String filterDay = "lun.";
	public String listViewDate = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/mRecyclerViewDies";
	public String textDate = "android.widget.TextView";
	
	
	public Test6Options() {
		fillFilterDays();
	}
	
	//PATH FIRST DAY
	//"/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]";
	   

	private void fillFilterDays() {
		this.filterDays.put("lun.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
		this.filterDays.put("mar.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]");
		this.filterDays.put("mie.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]");
		this.filterDays.put("jue.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]");
		this.filterDays.put("vie.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]");
		this.filterDays.put("sab.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]");
		this.filterDays.put("dom.","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]");
		this.filterDays.put("Todos","/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]");
	}
	
	
}
