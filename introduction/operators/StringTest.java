package operators;

import java.io.IOException;

public class StringTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("-------------LENGHT-------------");
		System.in.read();
		// Declaring the String and Int Variable
		String sPopularTopic = "Example Strings";
		int ilength = sPopularTopic.length();

		// Print the value of String variable & int Variable
		System.out.println("String content: " + sPopularTopic);
		System.out.println("Length content: " + ilength);

		System.in.read();
		System.out.println("");
		System.out.println("---------------CONCAT-------------");
		
		System.in.read();
		// Declaring the String Variables
		String sPopularTopic_1 = "String Introduction";
		String sPopularTopic_2 = "Basic Java Tutorial";
		String sSpace = " ";

		// Print the value of Concat String
		// String1.concat(String2);
		System.out.println("First Output");
		System.out.println(sPopularTopic_1.concat(sPopularTopic_2));

		// Another way of using String Concat
		// "String1".concat(String2);
		System.out.println("Second Output");
		System.out.println("String Introduction".concat(sPopularTopic_2));

		// Another way of using String Concat
		// "String1" + "String2";
		System.out.println("Third Output");
		System.out.println("String Introduction" + "Basic Java Tutorial");

		// Another way of using String Concat
		// "String1" + String + "String2";
		System.out.println("Fourth Output");
		System.out.println("String Introduction" + sSpace + "Basic Java Tutorial");
		
		System.in.read();
		
		// Declaring the String
		sPopularTopic_1 = "String Introduction";
		sPopularTopic_2 = "Basic Java Tutorial";

		System.out.println("");
		System.out.println("---------------COMPARE-----------------");
		System.in.read();
		// Compare two String: This would compare two strings
		// If the twos strings are equal, it will return 'true' else it will return
		// 'false'
		boolean bCompareResult = sPopularTopic_1.equals(sPopularTopic_2);
		System.out.println("The result of String Comparison is : " + bCompareResult);
		
		System.in.read();
		System.out.println("");
		System.out.println("-----------CHARACTER AT (Position)-----------");
		System.in.read();
		// Character at: This would return the single character at index value from the
		// String
		char cIndex = sPopularTopic_1.charAt(5);
		System.out.println("The fifth character of Popular Topic 1 is : " + cIndex);

		System.in.read();
		System.out.println("");
		System.out.println("-----------CONTAINS-----------");
		System.in.read();
		// Contains: This would return 'true' if the passed string is contained in the
		// another String
		boolean bContainResult = sPopularTopic_1.contains("Introduction");
		System.out.println(
				"The result of string Introduction is contained in the String sPopularTopic_1 is : " + bContainResult);

		System.in.read();
		System.out.println("");
		System.out.println("-----------INDEX OF-----------");
		System.in.read();
		// Index of: This would return the starting index of the passed string
		int iIndex = sPopularTopic_1.indexOf("Introduction");
		System.out.println("The start index of the string Introduction is : " + iIndex);

		
		System.in.read();
		System.out.println("");
		System.out.println("-----------SUBSTRING-----------");
		System.in.read();
		// Sub String First index: This would return the sub string of the string from
		// the passed index number
		String sSubString = sPopularTopic_1.substring(iIndex);
		System.out.println("The sub string from the index number is : " + sSubString);

		System.in.read();
		System.out.println("");
		System.out.println("-----------SUBSTRING (first-last)-----------");
		System.in.read();
		// Sub String First & Last index: This would return the sub string from first
		// index to end index
		sSubString = sPopularTopic_1.substring(7, 19);
		System.out.println("The sub string of Popular Topic 1 from index 8 to 18 is : " + sSubString);

		System.in.read();
		System.out.println("");
		System.out.println("-----------TO LOWER CASE-----------");
		System.in.read();
		// To Lower Case: It would return the complete string in the lower case
		String sLowerCase = sPopularTopic_1.toLowerCase();
		System.out.println("The lower case of the Popular Topic 1 is : " + sLowerCase);

		System.in.read();
		System.out.println("");
		System.out.println("-----------SPLIT-----------");
		System.in.read();
		// Split: It breaks the string in to two parts from the passed argument and
		// store it in to array
		String[] aSplit = sPopularTopic_2.split("Java");
		System.out.println("The original String is: "+sPopularTopic_2);
		System.out.println("The first part of the array is : " + aSplit[0]);
		System.out.println("The last part of the array is : " + aSplit[1]);
	}

}
