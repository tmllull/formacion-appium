package objectsSolutions;

public class ComputerSolution {
	
//////////////////////////////////////
//Create a Computer Class with the next variables
// number of cores (int)
// Model (String)
// Desktop (false) or laptop (true)
//////////////////////////////////////
	
	int cores;
	String model;
	boolean isLaptop;
	
	public ComputerSolution(int cores, String model, boolean isLaptop) {
		this.cores = cores;
		this.model = model;
		this.isLaptop = isLaptop;
	}
	
////////////////////////////////////////
//Create a method that display the characteristics
///////////////////////////////////////
	
	public void display() {
		System.out.println("The computer has "+cores+" cores");
		System.out.println("The model of the computer is "+model);
		if(isLaptop)System.out.println("The computer is a laptop");
		else System.out.println("The computer is a Desktop computer");
	}

}
