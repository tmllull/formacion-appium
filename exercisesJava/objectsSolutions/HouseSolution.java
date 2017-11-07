package objectsSolutions;

public class HouseSolution {
	
	//////////////////////////////////////
	//Create a House Class with the next variables
	// number of plants (int)
	// Street (String)
	// house (false) or flat (true)
	//////////////////////////////////////
	
    int plants;
    String street;
	boolean isFlat;
	
	
	////////////////////////////////////////
	//Create a method that display the characteristics
	///////////////////////////////////////
	public void display() {
		System.out.println("The house has "+plants+" plants");
		System.out.println("The house is in "+street+" street");
		if(isFlat)	System.out.println("The house is a flat");
		else System.out.println("The house is not a flat");
	}
	
	

}
