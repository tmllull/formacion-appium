package operators;

import java.io.IOException;

public class StringTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("-------------LENGHT-------------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite saber la longitud del String");
		System.in.read();
		System.in.read();
		// Declaring the String and Int Variable
		System.out.println("Declaramon un String y lo inicializamos:");
		System.out.println("String sPopularTopic = \"Example Strings\";");
		String sPopularTopic = "Example Strings";
		System.in.read();
		System.in.read();
		System.out.println("Obtenemos la longitud del String usando el método '.length()':");
		System.out.println("int ilength = sPopularTopic.length();");
		int ilength = sPopularTopic.length();
		System.in.read();
		System.in.read();
		// Print the value of String variable & int Variable
		System.out.println("El resultado es:");
		System.out.println("String content: " + sPopularTopic);
		System.out.println("Length content: " + ilength);
		System.in.read();
		System.in.read();
		System.out.println("---------------CONCAT-------------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite concatenar (juntar) dos o más String");
		System.in.read();
		System.in.read();
		// Declaring the String Variables
		System.out.println("Declaramos 3 Strings:");
		System.out.println("String sPopularTopic_1 = \"String Introduction\";");
		System.out.println("String sPopularTopic_2 = \"Basic Java Tutorial\";");
		System.out.println("String sSpace = \" \";");
		String sPopularTopic_1 = "String Introduction";
		String sPopularTopic_2 = "Basic Java Tutorial";
		String sSpace = " ";
		System.in.read();
		System.in.read();
		
		// Print the value of Concat String
		// String1.concat(String2);
		System.out.println("La función concat se puede utilizar de la siguiente manera:");
		System.in.read();
		System.in.read();
		System.out.println("Para concatenar 2 variables:");
		System.out.println("String1.concat(String2);");
		System.in.read();
		System.in.read();
		System.out.println("First Output");
		System.out.println(sPopularTopic_1.concat(sPopularTopic_2));
		
		// Another way of using String Concat
		// "String1".concat(String2);
		System.in.read();
		System.in.read();
		System.out.println("Otra opción es concatenar texto 'explícito' con una variable:");
		System.out.println("\"String Introduction\".concat(sPopularTopic_2)");
		System.in.read();
		System.in.read();
		System.out.println("Second Output");
		System.out.println("String Introduction".concat(sPopularTopic_2));

		// Another way of using String Concat
		// "String1" + "String2";
		System.in.read();
		System.in.read();
		System.out.println("También se puede concatenar texto 'explícito' con otro texto 'explícito':");
		System.out.println("\"String Introduction\" + \"Basic Java Tutorial\"");
		System.in.read();
		System.in.read();
		System.out.println("Third Output");
		System.out.println("String Introduction" + "Basic Java Tutorial");

		// Another way of using String Concat
		// "String1" + String + "String2";
		System.in.read();
		System.in.read();
		System.out.println("O podemos concatenar más de una variable o texto 'explícito':");
		System.out.println("String Introduction\" + sSpace + \"Basic Java Tutorial");
		System.in.read();
		System.in.read();
		System.out.println("Fourth Output");
		System.out.println("String Introduction" + sSpace + "Basic Java Tutorial");
		System.in.read();
		System.in.read();

		System.out.println("---------------COMPARE-----------------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite comparar 2 Strings para saber si son iguales en su contenido:");
		System.out.println("sPopularTopic_1.equals(sPopularTopic_2);");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un booleano, por lo que nos dirá si esa comprobación"
				+ " es 'true' o 'false'");
		System.in.read();
		System.in.read();
		// Compare two String: This would compare two strings
		// If the twos strings are equal, it will return 'true' else it will return
		// 'false'
		boolean bCompareResult = sPopularTopic_1.equals(sPopularTopic_2);
		System.out.println("Texto 1: "+sPopularTopic_1);
		System.out.println("Texto 2: "+sPopularTopic_2);
		System.out.println("The result of String Comparison is : " + bCompareResult);
		System.in.read();
		System.in.read();

		System.out.println("-----------CHARACTER AT (Position)-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite saber qué caracter se encuentra un posición concreta [El primer caracter es el 0]:");
		System.out.println("sPopularTopic_1.charAt(5);");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un char (caracter)");
		System.in.read();
		System.in.read();		// Character at: This would return the single character at index value from the
		// String
		char cIndex = sPopularTopic_1.charAt(5);
		System.out.println("Texto 1: "+sPopularTopic_1);
		System.out.println("The fifth character of Popular Topic 1 is : " + cIndex);

		System.in.read();
		System.in.read();

		System.out.println("-----------CONTAINS-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite saber si el String contiene otro String:");
		System.out.println("sPopularTopic_1.contains(\"Introduction\");");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un booleano, por lo que nos dirá si esa comprobación"
				+ " es 'true' o 'false'");
		System.in.read();
		System.in.read();
		// Contains: This would return 'true' if the passed string is contained in the
		// another String
		System.out.println("Texto 1: "+sPopularTopic_1);
		boolean bContainResult = sPopularTopic_1.contains("Introduction");
		System.out.println(
				"The result of string Introduction is contained in the String sPopularTopic_1 is : " + bContainResult);

		System.in.read();
		System.in.read();
		
		System.out.println("-----------INDEX OF-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite saber en qué posición empieza un texto o caracter dentro de un String:");
		System.out.println("sPopularTopic_1.indexOf(\"Introduction\");");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un int.");
		System.in.read();
		System.in.read();
		// Index of: This would return the starting index of the passed string
		int iIndex = sPopularTopic_1.indexOf("Introduction");
		System.out.println("Texto 1: "+sPopularTopic_1);
		System.out.println("The start index of the string Introduction is : " + iIndex);

		System.in.read();
		System.in.read();
		
		System.out.println("-----------SUBSTRING-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos devuelve el String que empieza en una posición concreta:");
		System.out.println("sPopularTopic_1.substring(iIndex);");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un String.");
		System.in.read();
		System.in.read();
		// Sub String First index: This would return the sub string of the string from
		// the passed index number
		String sSubString = sPopularTopic_1.substring(iIndex);
		System.out.println("Texto 1: "+sPopularTopic_1);
		System.out.println("Index: " + iIndex);
		System.out.println("The sub string from the index number is : " + sSubString);

		System.in.read();
		System.in.read();
		
		System.out.println("-----------SUBSTRING (first-last)-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite saber qué texto se encuentra entre dos posiciones del String:");
		System.out.println("sPopularTopic_1.substring(7, 19);");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un String.");
		System.in.read();
		System.in.read();// Sub String First & Last index: This would return the sub string from first
		// index to end index
		sSubString = sPopularTopic_1.substring(7, 19);
		System.out.println("Texto 1: "+sPopularTopic_1);
		System.out.println("The sub string of Popular Topic 1 from index 7 to 19 is : " + sSubString);

		System.in.read();
		System.in.read();
		
		System.out.println("-----------SPLIT-----------");
		System.in.read();
		System.in.read();
		System.out.println("Nos permite 'cortar' un String a partir de un caracter especial o texto:");
		System.out.println("sPopularTopic_2.split(\"Java\");");
		System.in.read();
		System.in.read();
		System.out.println("Esta función nos devuelve un array de Strings.");
		System.in.read();
		System.in.read();
		// Split: It breaks the string in to two parts from the passed argument and
		// store it in to array
		String[] aSplit = sPopularTopic_2.split("Java");
		System.out.println("The original String is: " + sPopularTopic_2);
		System.out.println("The first part of the array is : " + aSplit[0]);
		System.out.println("The last part of the array is : " + aSplit[1]);
		System.out.println("FINISH");
	}

}
