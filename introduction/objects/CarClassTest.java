package objects;

import java.io.IOException;

public class CarClassTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<=========CLASS CAR EXAMPLE===========>");
		System.in.read();
		System.in.read();
		// Use the Car keyword to declare Car Class variable
		System.out.println("Para instanciar una clase de hace de la siguiente manera:");
		System.out.println("Car Toyota = new Car();");
		Car Toyota = new Car();

		System.in.read();
		System.in.read();
		System.out.println("Esta instancia tiene todas las variables vacías. Recordemos que en la clase están solo declaradas"
				+ ", pero no inicializadas.");
		System.in.read();
		System.in.read();
		System.out.println("Para inicializarlas hacemos lo siguiente:");
		System.out.println("Toyota.bLeftHandDrive = true;\r\n" + 
				"Toyota.iDoors = 4;\r\n" + 
				"Toyota.iGear = 5;\r\n" + 
				"Toyota.iHighestSpeed = 200;\r\n" + 
				"Toyota.iMake = 2014;\r\n" + 
				"Toyota.iTyres = 4;\r\n" + 
				"Toyota.sColor = \"Black\";\r\n" + 
				"Toyota.sTransmission = \"Manual\";\r\n" + 
				"Toyota.sModel = \"Camry\";");
		System.in.read();
		System.in.read();
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
		System.in.read();
		System.out.println("Para mostrar el contenido de las variables, usamos el método que hemos creado "
				+ "en la clase 'Car' llamado DisplayCharacteristics()");
		System.out.println("Toyota.DisplayCharacteristics();");
		System.in.read();
		System.in.read();
		Toyota.DisplayCharacteristics();
		System.out.println("FINISH");

	}

}
