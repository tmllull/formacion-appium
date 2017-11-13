package dataTypes;

import java.io.IOException;

public class IntTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Use the int keyword to declare integer variable
		int carSpeed;

		System.out.println("//INT TYPE");
		System.in.read();
		System.in.read();
		System.out.println("//Declaramos un entero:");
		System.out.println("int carSpeed;");
		System.in.read();
		System.in.read();
		// Initialize the integer variable with value 20
		System.out.println("//Le asignamos un valor:");
		System.out.println("CarSpeed = 20;");
		carSpeed = 20;
		System.in.read();
		System.in.read();

		// Print the value of integer variable
		System.out.println("//Lo mostramos en la consola: (notar que se escribe el nombre de la variable)");
		System.out.println("System.out.println(\"Current car speed: \" + carSpeed);");
		System.in.read();
		System.in.read();
		System.out.println("Current car speed: " + carSpeed);
		System.in.read();
		System.in.read();

		// Change the value of integer variable
		System.out.println("//Añadimos 20 a la variable anterior:");
		System.out.println("carSpeed = carSpeed + 20;");
		carSpeed = carSpeed + 20;
		System.in.read();
		System.in.read();

		// Print the value of integer variable
		System.out.println("//Lo mostramos en la consola:");
		System.out.println("System.out.println(\"Current speed of the car is: \" + carSpeed);");
		System.in.read();
		System.in.read();
		System.out.println("Current speed of the car is: " + carSpeed);
		System.out.println("FINISH");
	}

}
