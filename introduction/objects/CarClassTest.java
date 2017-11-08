package objects;

import java.io.IOException;

public class CarClassTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<=========CLASS CAR EXAMPLE===========>");
		System.in.read();
		// Use the Car keyword to declare Car Class variable
		Car Toyota = new Car();

		Toyota.bLeftHandDrive = true;
		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iMake = 2014;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.sModel = "Camry";

		System.out.println("<===============DISPLAY CHARACTERISTICS=================>");
		System.in.read();
		Toyota.DisplayCharacterstics();

	}

}
