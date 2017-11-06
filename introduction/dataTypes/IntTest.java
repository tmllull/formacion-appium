package dataTypes;

import java.io.IOException;

public class IntTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Use the int keyword to declare integer variable
        int carSpeed;
 
		//Initialize the integer variable with value 20
        carSpeed = 20;
        
        System.out.println("INT TYPE");
		System.in.read();
		System.in.read();
 
		//Print the value of integer variable
		System.out.println("Car is running at the speed of: " +  carSpeed);
		System.in.read();
		System.in.read();
 
		//Change the value of integer variable
		System.out.println("Add 20 to carSpeed");
		carSpeed = carSpeed + 20;
		System.in.read();
		System.in.read();
 
		//Print the value of integer variable
		System.out.println("Current speed of the car is: " +  carSpeed);

	}

}
