package domain;

import java.util.HashMap;

public class Test6Options {
	public String showListPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/bt_llistar_obres_main";
	public String selectedShowPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	public String selectedShowTrickPath = "//android.widget.TextView[@text='EL REY LEON']";
	public String filter = "Más opciones";
	public String dateFilter = "/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView";
	public HashMap<String,String> filterDays = new HashMap<String, String>();
	public String filterDay = "Sábado";
	public String listViewDate = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/mRecyclerViewDies";
	public String textDate = "android.widget.TextView";
	
	
	public Test6Options() {
		fillFilterDays();
	}
	
	//PATH FIRST DAY
	//"/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]";
	
	private void fillFilterDays() {
		this.filterDays.put("Lunes","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
		this.filterDays.put("Martes","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]");
		this.filterDays.put("Miércoles","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]");
		this.filterDays.put("Jueves","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]");
		this.filterDays.put("Viernes","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]");
		this.filterDays.put("Sábado","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]");
		this.filterDays.put("Domingo","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]");
		this.filterDays.put("Todos","/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]");
	}
	
	
}
