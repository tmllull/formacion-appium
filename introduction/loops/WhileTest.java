package loops;

import java.io.IOException;

public class WhileTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<==========WHILE EXAMPLE=========>");
		System.in.read();
		System.in.read();
		System.out.println("Declaramos una variable inicializada a 0:");
		System.in.read();
		System.in.read();
		System.out.println("int Count = 0;");
		int Count = 0;
		// This will print -- 5,10,15,20,25
		System.in.read();
		System.in.read();
		System.out.println("Ejemplo de while:");
		System.out.println("while (Count < 25) {\r\n" + 
				"    Count = Count + 5;\r\n" + 
				"    System.out.println(\"Count is ==> \" + Count);\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		while (Count < 25) {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		}
		System.out.println("FINISH");
	}

}
