package decisions;

import java.io.IOException;

public class IfTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("//IF");
		System.in.read();
		System.in.read();
		System.out.println("//Declaramos un int y un String:");
		System.out.println("String sDay = \"Sunday\";");
		System.out.println("int iDay = 7;");
		String sDay = "Sunday";
		int iDay = 7;
		System.in.read();
		System.in.read();
		System.out.println("//Mostramos el valor por consola:");
		System.out.println("sDay value is = " + sDay);
		System.out.println("iDay value is = " + iDay);
		System.in.read();
		System.in.read();
		System.out.println("//Ejemplo de if:");
		System.out.println("if (sDay.equals(\"Sunday\")) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}
		System.in.read();
		System.in.read();
		System.out.println("if (iDay == 7) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (iDay == 7) {
			System.out.println("Today is Sunday");
		}

		System.in.read();
		System.in.read();

		System.out.println("/////////////////////////////////////////////");
		System.in.read();
		System.in.read();
		System.out.println("//IF-ELSE");
		System.in.read();
		System.in.read();
		sDay = "Saturday";
		iDay = 6;
		System.in.read();
		System.in.read();
		System.out.println("sDay = " + sDay);
		System.out.println("iDay = " + iDay);
		System.in.read();
		System.in.read();
		System.out.println("//Ejemplo de if-else:");
		System.out.println("if (sDay.equals(\"Sunday\")) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"} else {\r\n" + 
				"    System.out.println(\"Today is not Sunday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}
		
		System.in.read();
		System.in.read();
		System.out.println("if (iDay == 7) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"} else {\r\n" + 
				"    System.out.println(\"Today is not Sunday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		System.in.read();
		System.in.read();
		System.out.println("/////////////////////////////////////////////");
		System.in.read();
		System.in.read();
		System.out.println("//IF-ELSEIF-ELSE");
		System.in.read();
		System.in.read();
		sDay = "Monday";
		iDay = 1;
		System.in.read();
		System.in.read();
		System.out.println("sDay = " + sDay);
		System.out.println("iDay = " + iDay);
		System.in.read();
		System.in.read();
		System.out.println("//Ejemplo de if-elseif-else:");
		System.out.println("if (sDay.equals(\"Sunday\")) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"} else if (sDay.equals(\"Saturday\")) {\r\n" + 
				"    System.out.println(\"Today is not Saturday\");\r\n" + 
				"} else {\r\n" + 
				"    System.out.println(\"Today is a Weekday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else if (sDay.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}
		System.in.read();
		System.in.read();
		System.out.println("if (iDay == 7) {\r\n" + 
				"    System.out.println(\"Today is Sunday\");\r\n" + 
				"} else if (iDay == 6) {\r\n" + 
				"    System.out.println(\"Today is Saturday\");\r\n" + 
				"} else {\r\n" + 
				"    System.out.println(\"Today is a Weekday\");\r\n" + 
				"}");
		System.in.read();
		System.in.read();
		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else if (iDay == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}
		System.out.println("FINISH");
	}

}
