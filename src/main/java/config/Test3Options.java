package config;

public class Test3Options {
	public String newShowPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/fab";
	public String titlePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowTitle";
	public String descriptionPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowDescription";
	public String durationPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowDuration";
	public String pricePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowPrice";
	public String title;
	public String resume;
	public String price;
	public String duration;
	public String selectDatesPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btNewShowConfirm";
	public String dataStartPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvDay1";
	public String dayStartPath;
	public String acceptStartPath = "android:id/button1";
	public String dataFinishPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvDay2";
	public String dayFinishStart;
	public String acceptFinishPath = "android:id/button1";
	public String monPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbMon";
	public String tuePath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbTue";
	public String wedPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbWeb";
	public String thuPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbThu";
	public String friPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbFri";
	public String satPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbSat";
	public String sunPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbSun";
	public String saveButtonPath = "com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btSaveDatesShow";
	
	public Test3Options(String title,String resume, String price, String duration,String dayStart,String dayFinish) {
		this.title = title;
		this.resume = resume;
		this.price = price;
		this.duration = duration;
		this.dayStartPath = dayStart;
		this.dayFinishStart = dayFinish;
	}
	
}
