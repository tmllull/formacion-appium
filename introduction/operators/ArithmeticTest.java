package operators;

import java.io.IOException;

public class ArithmeticTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a, b = 10, c = 3;
		System.out.println("//ARITHMETIC OPERATIONS");
		System.in.read();
		System.in.read();
		System.out.println("//Inicializamos algunas variables:");
		System.out.println("int a, b = 10, c = 5;");
		System.in.read();
		System.in.read();
		System.out.println("a: NOT INITIALIZED");
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.in.read();
		System.in.read();
		System.out.println("//Operador + (suma)");
		System.out.println("a = b + c;");
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		System.out.println("//Operador - (resta)");
		System.out.println("a = b - c;");
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		System.out.println("//Operador * (multiplicación)");
		System.out.println("a = b * c;");
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		System.out.println("//Operador / (división)");
		System.out.println("a = b / c;");
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		System.out.println("//Operador % (módulo)");
		System.out.println("a = b % c;");
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		System.out.println("//Operador ++ (incremento)");
		System.out.println("b++;");
		b++;
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		System.in.read();
		System.in.read();
		System.out.println("//Operador -- (decremento)");
		System.out.println("c--;");
		c--;
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
		System.out.println("FINISH");

	}

}
