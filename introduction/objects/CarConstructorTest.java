package objects;

import java.io.IOException;

public class CarConstructorTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<==========CLASS CONSTRUCTOR EXAMPLE======================>");
		// Use the Car keyword to declare Car Class variable
		// Passing values to the constructor
		CarConstructor Toyota = new CarConstructor("Camry", 2014, true);

		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";

		System.in.read();
		// Using Car class method
		Toyota.DisplayCharacterstics();

	}

}
