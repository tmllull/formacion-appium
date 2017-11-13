package operators;

import java.io.IOException;

public class LogicalTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean Output_1 = true;
		boolean Output_2 = false;
		System.out.println("LOGICAL OPERATORS");
		System.in.read();
		System.in.read();
		System.out.println("Inicializamos algunos booleanos:");
		System.out.println("boolean Output_1 = true;");
		System.out.println("boolean Output_2 = false;");
		System.out.println("First bool = " + Output_1);
		System.out.println("Second bool = " + Output_2);
		System.in.read();
		System.in.read();
		System.out.println("Operador 'and' (&&)");
		System.out.println("(Output_1 && Output_2)");
		System.in.read();
		System.in.read();
		System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		System.in.read();
		System.in.read();
		System.out.println("Operador 'or' (||)");
		System.out.println("(Output_1 || Output_2)");
		System.in.read();
		System.in.read();
		System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		System.in.read();
		System.in.read();
		System.out.println("Operador 'negative' (!)");
		System.out.println("(!Output_1)");
		System.in.read();
		System.in.read();
		System.out.println("Change the state of the Output_1 to false : " + (!Output_1));
		System.out.println("FINISH");

	}

}
