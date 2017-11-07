package operators;

import java.io.IOException;

public class ArithmeticTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a, b = 10, c = 5;
		System.out.println("ARITHMETIC OPERATIONS");
		System.in.read();
		System.in.read();
		System.out.println("a: NOT INITIALIZED");
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.in.read();
		System.in.read();
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		System.in.read();
		System.in.read();
		b++;
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		System.in.read();
		System.in.read();
		c--;
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);

	}

}
