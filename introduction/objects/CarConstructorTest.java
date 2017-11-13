package objects;

import java.io.IOException;

public class CarConstructorTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<==========CLASS CONSTRUCTOR EXAMPLE======================>");
		
		System.in.read();
		System.in.read();
		System.out.println("Podemos instanciar una clase añadiendo parámetros al constructor:");
		System.out.println("CarConstructor Toyota = new CarConstructor(\"Camry\", 2014, true);");
		CarConstructor Toyota = new CarConstructor("Camry", 2014, true);
		System.in.read();
		System.in.read();
		System.out.println("Esto nos ha creado una instancia de la clase 'Car' con las variables "
				+ "sModel, iMake i bLeftHandDrive inicializadas.");
		System.in.read();
		System.in.read();
		System.out.println("Para inicializar el resto, se hace como antes, pero solo añadimos las"
				+ " variables que nos faltan:");
		System.out.println("Toyota.iDoors = 4;\r\n" + 
				"Toyota.iGear = 5;\r\n" + 
				"Toyota.iHighestSpeed = 200;\r\n" + 
				"Toyota.iTyres = 4;\r\n" + 
				"Toyota.sColor = \"Black\";\r\n" + 
				"Toyota.sTransmission = \"Manual\";");
		// Use the Car keyword to declare Car Class variable
		// Passing values to the constructor
		

		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";

		System.in.read();
		System.in.read();
		System.out.println("Y llamamos al método DisplayCharacteristics()");
		// Using Car class method
		Toyota.DisplayCharacteristics();
		System.out.println("FINISH");

	}

}
